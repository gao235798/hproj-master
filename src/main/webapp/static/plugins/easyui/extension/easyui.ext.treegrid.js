/**
 * Treegrid扩展方法tooltip 基于Easyui 1.3.3，可用于Easyui1.3.3+
 * 代码案例:
 * $("#dg").treegrid('tooltip'); 所有列
 * $("#dg").treegrid('tooltip',['productid','listprice']); 指定列
 */
$.extend($.fn.treegrid.methods,{
    tooltip : function(jq, fields) {
    return jq.each(function() {
        var panel = $(this).datagrid('getPanel');
        if (fields && typeof fields == 'object' && fields.sort) {
            $.each(fields, function() {
                var field = this;
                bindEvent($('.datagrid-body td[field=' + field + '] .datagrid-cell', panel));
            });
        } else {
            bindEvent($(".datagrid-body .datagrid-cell", panel));
        }
    });

    function bindEvent(jqs) {
        jqs.mouseover(function() {
            var content = $(this).text();
            if (content.replace(/(^\s*)|(\s*$)/g, '').length > 5) {
                $(this).tooltip({
                    content : content,
                    trackMouse : true,
                    position : 'bottom',
                    onHide : function() {
                        $(this).tooltip('destroy');
                    },
                    onUpdate : function(p) {
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
 * 为treegrid增加表头菜单，用于显示或隐藏列，注意：冻结列不在此菜单中
 */
$.fn.treegrid.defaults.onHeaderContextMenu= function(e, field) {
    e.preventDefault();
    var grid = $(this);/* grid本身 */
    var headerContextMenu = this.headerContextMenu;/* grid上的列头菜单对象 */
    if (!headerContextMenu) {
        var tmenu = $('<div style="width:100px;"></div>').appendTo('body');
        var fields = grid.datagrid('getColumnFields');
        for ( var i = 0; i < fields.length; i++) {
            var fildOption = grid.datagrid('getColumnOption', fields[i]);
            if (!fildOption.hidden) {
                $('<div iconCls="tick" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
            } else {
                $('<div iconCls="bullet_blue" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
            }
        }
        headerContextMenu = this.headerContextMenu = tmenu.menu({
            onClick : function(item) {
                var field = $(item.target).attr('field');
                if (item.iconCls == 'tick') {
                    grid.datagrid('hideColumn', field);
                    $(this).menu('setIcon', {
                        target : item.target,
                        iconCls : 'bullet_blue'
                    });
                } else {
                    grid.datagrid('showColumn', field);
                    $(this).menu('setIcon', {
                        target : item.target,
                        iconCls : 'tick'
                    });
                }
            }
        });
    }
    headerContextMenu.menu('show', {
        left : e.pageX,
        top : e.pageY
    });
};


/**
 * 扩展treegrid，使其支持平滑数据格式
 */
$.fn.treegrid.defaults.loadFilter = function(data, parentId) {
	var opt = $(this).data().treegrid.options;
	var idField, textField, parentField;
	if (opt.parentField) {
		idField = opt.idField || 'id';
		textField = opt.textField || 'text';
		parentField = opt.parentField;
		var i, l, treeData = [], tmpMap = [];
		for (i = 0, l = data.length; i < l; i++) {
			tmpMap[data[i][idField]] = data[i];
		}
		for (i = 0, l = data.length; i < l; i++) {
			if (tmpMap[data[i][parentField]] && data[i][idField] != data[i][parentField]) {
				if (!tmpMap[data[i][parentField]]['children'])
					tmpMap[data[i][parentField]]['children'] = [];
				data[i]['text'] = data[i][textField];
				tmpMap[data[i][parentField]]['children'].push(data[i]);
			} else {
				data[i]['text'] = data[i][textField];
				treeData.push(data[i]);
			}
		}
		return treeData;
	}
	return data;
};
