// 搜索
function doSearch() {
    var $uname = $('#searchByName')
    var ByName = $uname.val()

    $('#dg').datagrid({
        //这个的作用类似 Ajax 了！向后台传递数据
        queryParams: {          
            ByName: ByName            
          },   
        columns : [ [ //添加列  
            {
                field : 'Id', //绑定数据源ID  
                title : 'Id', //显示列名称
                align : 'center', //内容在列居中
                width : 100 //列的宽度
            },
            {
                field : 'Name',
                title : 'Name',
                align : 'center',
                width : 100
            },
            {
                field : 'Email',
                title : 'Email',
                align : 'center',
                width : 100
            },
            {
                field : 'Salary',
                title : 'Salary',
                align : 'center',
                width : 100
            },
        ] ],
        ByName : ByName,
        url : 'Search' //获取数据地址
    });
}