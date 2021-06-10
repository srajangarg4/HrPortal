<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
<title>All Employees</title>
</head>
<body>

	<div class="container">
	<div class="d-flex">
	<a class="btn btn-link btn-outline-primary ml-auto" href="/new">Add Employee</a>
	</div>
		<h6 class="display-4 py-4">All Employees</h6>
		<div class="table-responsive-xl">
			<span style="color: red;" class="py-4">${error}</span>
			<table class="table table-striped table-hover">
				<thead class="thead-light">
					<tr>
						<th scope="col">Employee Code</th>
						<th scope="col">Employee Name</th>
						<th scope="col">Location</th>
						<th scope="col">Email</th>
						<th scope="col">Date of Birth</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employees}" var="employee">
						<tr>
							<td>${employee.empId}</td>
							<td>${employee.empName}</td>
							<td>${employee.location}</td>
							<td>${employee.email}</td>
							<td>${employee.dob}</td>
							<td><a class="btn btn-link" href="/${employee.empId}">Update</a>
								<a class="btnbtn-link" href="/delete/${employee.empId}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>

</body>
</html>