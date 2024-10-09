/**
 * 当页面加载完毕关闭加载进度
 */
$(window).load(function(){
    $("#loading").fadeOut();
});


/**
 * 将form表单元素的值序列化成对象
 */
$.serializeObject = function(form) {
    var o = {};
    $.each(form.serializeArray(), function(index) {
        if (o[this['name']]) {
            o[this['name']] = o[this['name']] + "," + this['value'];
        } else {
            o[this['name']] = this['value'];
        }
    });
    return o;
};

/**
 * 在页面中任何嵌套层次的窗口中获取顶层窗口
 * @return 当前页面的顶层窗口对象
 */
function getTopWinow(){
    var p = window;
    while(p != p.parent){
        p = p.parent;
    }
    return p;
}

/**
 * 改变jQuery的AJAX默认属性和方法
 */
$.ajaxSetup({
    type : 'POST',
    error : function(XMLHttpRequest, textStatus, errorThrown) {
        try {
            parent.$.messager.progress('close');
            parent.$.messager.alert('错误', XMLHttpRequest.responseText);
        } catch (e) {
            alert(XMLHttpRequest.responseText);
        }
    },
    complete:function(XMLHttpRequest,textStatus){
        //通过XMLHttpRequest取得响应头，sessionStatus
        var sessionstatus = XMLHttpRequest.getResponseHeader("sessionStatus");
        if(sessionstatus == "timeout"){
            //如果超时就处理 ，指定要跳转的页面
            var top = getTopWinow(); //获取当前页面的顶层窗口对象
            $.messager.alert('提示', '登录超时-请重新登录！', 'info');
            top.location.href = "${ctx}/login";
        }
    }
});

/**
 * 增加formatString功能
 * 使用方法：$.formatString('字符串{0}字符串{1}字符串','第一个变量','第二个变量');
 * @returns 格式化后的字符串
 */
$.formatString = function(str) {
    for ( var i = 0; i < arguments.length - 1; i++) {
        str = str.replace("{" + i + "}", arguments[i + 1]);
    }
    return str;
};


/**
 * 接收一个以逗号分割的字符串，返回List，list里每一项都是一个字符串
 * @returns list
 */
$.stringToList = function(value) {
    if (value != undefined && value != '') {
        var values = [];
        var t = value.split(',');
        for ( var i = 0; i < t.length; i++) {
            values.push('' + t[i]);/* 避免他将ID当成数字 */
        }
        return values;
    } else {
        return [];
    }
};


/**
 * 去掉空格
 */
String.prototype.trim = function() {
    return this.replace(/(^\s*)|(\s*$)/g, '');
};
String.prototype.ltrim = function() {
    return this.replace(/(^\s*)/g, '');
};
String.prototype.rtrim = function() {
    return this.replace(/(\s*$)/g, '');
};


$.cookie = function(key, value, options) {
    if (arguments.length > 1 && (value === null || typeof value !== "object")) {
        options = $.extend({}, options);
        if (value === null) {
            options.expires = -1;
        }
        if (typeof options.expires === 'number') {
            var days = options.expires, t = options.expires = new Date();
            t.setDate(t.getDate() + days);
        }
        return (document.cookie = [ encodeURIComponent(key), '=', options.raw ? String(value) : encodeURIComponent(String(value)), options.expires ? '; expires=' + options.expires.toUTCString() : '', options.path ? '; path=' + options.path : '', options.domain ? '; domain=' + options.domain : '', options.secure ? '; secure' : '' ].join(''));
    }
    options = value || {};
    var result, decode = options.raw ? function(s) {
        return s;
    } : decodeURIComponent;
    return (result = new RegExp('(?:^|; )' + encodeURIComponent(key) + '=([^;]*)').exec(document.cookie)) ? decode(result[1]) : null;
};


/**
 * 页面加载加载进度条启用
 */
function progressLoad(){  
    $("<div class=\"datagrid-mask\" style=\"position:absolute;z-index: 9999;\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body");  
    $("<div class=\"datagrid-mask-msg\" style=\"position:absolute;z-index: 9999;\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({display:"block",left:($(document.body).outerWidth(true) - 190) / 2,top:($(window).height() - 45) / 2});  
}
/**
 * 页面加载加载进度条关闭
 */
function progressClose(){
    $(".datagrid-mask").remove();  
    $(".datagrid-mask-msg").remove();
}


/**
 * 防止退格键导致页面回退
 */
$(document).keydown(function (e) { 
    var doPrevent; 
    if (e.keyCode == 8) { 
        var d = e.srcElement || e.target; 
        if (d.tagName.toUpperCase() == 'INPUT' || d.tagName.toUpperCase() == 'TEXTAREA') { 
            doPrevent = d.readOnly || d.disabled; 
        }else{
            doPrevent = true; 
        }
    }else{ 
        doPrevent = false; 
    }
    if (doPrevent) 
    e.preventDefault(); 
});