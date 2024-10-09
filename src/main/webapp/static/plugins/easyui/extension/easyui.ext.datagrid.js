/**
 * Datagrid扩展方法tooltip 基于Easyui 1.3.3，可用于Easyui1.3.3+
 * 代码案例:
 * $("#dg").datagrid('tooltip'); 所有列
 * $("#dg").datagrid('tooltip',['productid','listprice']); 指定列
 */
$.extend($.fn.datagrid.methods, {
    tooltip: function (jq, fields) {
        return jq.each(function () {
            var panel = $(this).datagrid('getPanel');
            if (fields && typeof fields == 'object' && fields.sort) {
                $.each(fields, function () {
                    var field = this;
                    bindEvent($('.datagrid-body td[field=' + field + '] .datagrid-cell', panel));
                });
            } else {
                bindEvent($(".datagrid-body .datagrid-cell", panel));
            }
        });

        function bindEvent(jqs) {
            jqs.mouseover(function () {
                var content = $(this).text();
                if (content.replace(/(^\s*)|(\s*$)/g, '').length > 5) {
                    $(this).tooltip({
                        content: content,
                        trackMouse: true,
                        position: 'bottom',
                        onHide: function () {
                            $(this).tooltip('destroy');
                        },
                        onUpdate: function (p) {
                            var tip = $(this).tooltip('tip');
                            if (parseInt(tip.css('width')) > 500) {
                                tip.css('width', 500);
                            }
                        }
                    }).tooltip('show');
                }
            });
        }
    }
});


/**
 * 为datagrid增加表头菜单，用于显示或隐藏列，注意：冻结列不在此菜单中
 */
$.fn.datagrid.defaults.onHeaderContextMenu = function (e, field) {
    e.preventDefault();
    var grid = $(this);/* grid本身 */
    var headerContextMenu = this.headerContextMenu;/* grid上的列头菜单对象 */
    if (!headerContextMenu) {
        var tmenu = $('<div style="width:100px;"></div>').appendTo('body');
        var fields = grid.datagrid('getColumnFields');
        for (var i = 0; i < fields.length; i++) {
            var fildOption = grid.datagrid('getColumnOption', fields[i]);
            if (!fildOption.hidden) {
                $('<div iconCls="tick" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
            } else {
                $('<div iconCls="bullet_blue" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
            }
        }
        headerContextMenu = this.headerContextMenu = tmenu.menu({
            onClick: function (item) {
                var field = $(item.target).attr('field');
                if (item.iconCls == 'tick') {
                    grid.datagrid('hideColumn', field);
                    $(this).menu('setIcon', {
                        target: item.target,
                        iconCls: 'bullet_blue'
                    });
                } else {
                    grid.datagrid('showColumn', field);
                    $(this).menu('setIcon', {
                        target: item.target,
                        iconCls: 'tick'
                    });
                }
            }
        });
    }
    headerContextMenu.menu('show', {
        left: e.pageX,
        top: e.pageY
    });
};
