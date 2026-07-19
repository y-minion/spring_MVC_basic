<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
        <tr>
            <th>id</th>
            <th>username</th>
            <th>age</th>
        </tr>
    </thead>
    <tbody>
    <!-- JSTL의 반복문. 자바의 for문과 비슷하다. JSTL의 forEach 사용. 반복문 변수는 item으로 지정 -->
    <c:forEach var="item" items="${members}">
        <tr>
        <!-- JSP 에서는 변수에 직접적으로 상태에 접근해도 알아서 getId 등등... 으로 변환된다. -->
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>