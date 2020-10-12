
$(document).ready(function () {
    //$("table").attr("bgColor", "#222222"); //设置表格的背景颜色
    $("tr").attr("bgColor", "#A65DCC"); //为单数行表格设置背景颜色
    $("tr:even").css("background-color", "#51CC97"); //为双数行表格设置背颜色素
    $("table").css("width", "600px"); //为表格添加样式，设置表格长度为300像素

});

function del(name) {
    const aa = confirm("你确定要删除吗？");
    if (aa) {
        location.href = "keywordServlet?&name=" + name + "&comm=del";
    }
}
