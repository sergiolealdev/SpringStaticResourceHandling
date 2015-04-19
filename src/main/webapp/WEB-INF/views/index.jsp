<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="resources/js/jquery-2.1.3.min.js"/>"></script>
</head>
<body>
	<span class="label label-primary">Hi, today is ${time}</span>
</body>
</html>
