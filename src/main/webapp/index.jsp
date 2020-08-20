<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Time Site</title>
</head>
<h1>
    Main Page of Time site
</h1>
<body>
<jsp:useBean id="calendar" class="java.util.GregorianCalendar"/>
    <form action="controller" method="post">
        <input type="hidden" name="time" value="${calendar.timeInMillis}">
        <input type="hidden" name="command" value="calculate_time">
        <input type="submit" value="Stopwatch">
    </form>
</body>
</html>
