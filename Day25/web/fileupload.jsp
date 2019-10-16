<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadServlet" method="post" enctype="multipart/form-data">
    文件描述<input type="text" name="desc"><br>
    选择文件<input type="file" name="upload"><br>
    <button type="submit">上传</button>
</form>
</body>
</html>
