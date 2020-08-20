<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Кнопка нажата через ${res} сек </p>
<form action="controller" method="post">
    <input type="hidden" name="command" value="reset_stopwatch">
    <input type="submit" value="Return on main page">
</form>
</body>
</html>
