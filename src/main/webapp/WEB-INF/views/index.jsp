<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="msg.title"/></title>
</head>
<body background="${pageContext.request.contextPath}/resources/images/timg.jpg">
</h2>

<marquee direction=left scrollamount=20><h1 style="color: cyan"><spring:message code="msg.lang_en"/></h1></marquee>
<marquee direction=left scrollamount=18><h1 style="color: red"><spring:message code="msg.jj"/></h1></marquee>
<marquee direction=left scrollamount=22><h1 style="color:black"><spring:message code="msg.ww"/></h1></marquee>
<marquee direction=left scrollamount=15><h1 style="color:pink "><spring:message code="msg.kk"/></h1></marquee>
<marquee direction=left scrollamount=25><h1 style="color:pink "><spring:message code="msg.dd"/></h1></marquee>
<marquee direction=left scrollamount=30><h1 style="color: purple"><spring:message code="msg.username"/></h1></marquee>
<a href="index?lang=ja_JP" style="font-size: 37px;color: red;float: right;" >
    日本
</a>
<a href="index?lang=en_US"  style="font-size: 37px;color: red;float: right" >
    美国
</a>
<a href="index?lang=zh_CN"  style="font-size: 37px;color: red;float: right;" >
    中国
</a>



</body>
</html>
