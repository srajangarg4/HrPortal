<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
<title>Insert title here</title>
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
</head>
<body>

	<div class="container">
		<div class="row min-vh-100 align-items-center justify-content-center">
			<div class="col-6">
				<div class="card">
					<div class="card-header">
						<h5 class="text-center">Employee</h5>
					</div>
					<div class="card-body">
						<form:form action="${action}" method="post"
							modelAttribute="employee">
							<%
								if (request.getAttribute("action").equals("/update")) {
							%>
							<div class="form-group">
								<label id="emp-id">Employee Id</label>
								<form:input class="form-control" id="emp-id" path="empId"
									value="${employee.empId}" disabled="true" />
							</div>
							<%
								}
							%>
							<div class="form-group">
								<label id="emp-name">Employee Name</label>
								<form:input class="form-control" id="emp-name" path="empName"
									value="${employee.empName}" />
							</div>
							<div class="form-group">
								<label id="email">Email</label>
								<form:input class="form-control" id="email" path="email"
									value="${employee.email}" type="email" />
							</div>
							<div class="form-group">
								<label id="location">Location</label>
								<form:input class="form-control" id="location" path="location"
									value="${employee.location}" />
							</div>
							<div class="form-group">
								<label id="flight-date">Date of Birth</label>
								<form:input type="date" class="form-control" id="flight-date"
									path="dob" />
							</div>
							<button class="btn btn-primary btn-block" type="submit">Submit</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>

</body>
</html>