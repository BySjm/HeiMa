<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>员工信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">员工信息列表</h3>
    <form action="" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <td>
                    姓名： <input type="text" name="ename" value="">
                    地址：
                    <select name="address" id="address">
                        <option value="">--请选择--</option>
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option value="广州">广州</option>
                        <option value="深圳">深圳</option>
                    </select>
                    <input type="submit" value="搜索" class="btn btn-primary">
                </td>
            </tr>
        </table>
    </form>
    <form id="delsForm" method="post" action="${pageContext.request.contextPath}/empServlet?action=dels">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th>
                    <input type="checkbox" id="checkAll">
                </th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>入职日期</th>
                <th>工资</th>
                <th>地址</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pageBean.list}" var="emp">
                <tr>
                    <td>
                        <input type="checkbox" name="ids" value="${emp.id}">
                    </td>
                    <td>${emp.id}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.sex}</td>
                    <td>${emp.joindate}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.address}</td>
                    <td><a class="btn btn-default btn-sm" href="update.jsp">修改</a>&nbsp;<a
                            class="btn btn-default btn-sm" href="">删除</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="9" align="center">
                    <a class="btn btn-primary" href="add.jsp">添加员工</a>
                    <input class="btn btn-primary" type="button" id="delsBtn" value="删除选中">
                </td>
            </tr>
        </table>
    </form>
    <nav>
        <ul class="pagination">
            <%-- 上一页 --%>
            <c:if test="${pageBean.currentPage > 1}">
                <li>
                    <a href="${pageContext.request.contextPath}/empServlet?action=findByPage&currentPage=${pageBean.currentPage - 1}&pageSize=5">
                        <span>&laquo;</span>
                    </a>
                </li>
            </c:if>
            <%-- 页码显示区 --%>
            <c:forEach begin="1" end="${pageBean.totalPage}" var="page">
                <c:if test="${pageBean.currentPage == page}">
                    <li class="active"><a
                            href="${pageContext.request.contextPath}/empServlet?action=findByPage&currentPage=${page}&pageSize=5">${page}</a>
                    </li>
                </c:if>
                <c:if test="${pageBean.currentPage != page}">
                    <li>
                        <a href="${pageContext.request.contextPath}/empServlet?action=findByPage&currentPage=${page}&pageSize=5">${page}</a>
                    </li>
                </c:if>
            </c:forEach>
            <%-- 下一页 --%>
            <c:if test="${pageBean.currentPage < pageBean.totalPage}">
                <li>
                    <a href="${pageContext.request.contextPath}/empServlet?action=findByPage&currentPage=${pageBean.currentPage + 1}&pageSize=5">
                        <span>&raquo;</span>
                    </a>
                </li>
            </c:if>
            <span style="font-size:25px;margin-left:5px">
		总${pageBean.totalCount}条记录，共${pageBean.totalPage}页
	</span>
        </ul>
    </nav>
</div>
<script>
    $('#checkAll').click(function () {
        let prop = $(this).prop('checked');
        $('input[type = "checkbox"]').prop('checked', prop);
    });
    $('#delsBtn').click(function () {
        if (confirm('确定要删除吗？')) {
            $('#delsForm').submit();
        }
    });
</script>
</body>
</html>
