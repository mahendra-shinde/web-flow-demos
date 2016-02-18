<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div class="content">
			<fieldset>
				<legend>Navigation menu</legend>
				<!-- here the href's value will be used to decide the 
					 controller to be executed on click of this link.
					 here "memberShip" is mapped in FlowController mapping-->
				<a href="membership.do" style="margin:50;">Become Member</a>
			</fieldset>
		</div>
</body>
</html>