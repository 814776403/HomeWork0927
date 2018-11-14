<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态资源访问</title>
</head>
<body>
<h2>静态资源访问</h2>
<%--通过映射去访问受权限的静态资源--%>
<img src="${pageContext.request.contextPath}/resources/images/weilai.jpg"/>
<a href="page/index">view - langu</a>

<h2>上传文件</h2>
<form action="upload" enctype="multipart/form-data" method="post">
    文件描述<input type="text" name="context"/><br/>
    <input type="file" name="file1"/>
    <input type="file" name="file2"/>
    <input type="file" name="file3"/>
    <input type="submit" value="提交">

</form>
</body>
</html>
