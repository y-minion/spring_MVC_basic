<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<!-- 상대경로 사용, [현재 URL이 속한 계층 경로 + /save] -->
<!-- 아래와 같은 상대 경로를 사용하면 플로우는 아래와 같다. -->
<!-- 먼저 컨트롤러가 매핑된 url로 GET요청으로 이어진다. -->
<!-- 뷰의 경로로 디스패치된다 -->
<!-- 뷰의 폼의 경로가 상대 경로면, 현재 브라우저의 경로(컨트롤러가 매핑한 경로)에 속한 계층 경로로 save가 호출된다. -->
<form action="save" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>

</body>
</html>

