<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="com.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<%Employee e1 =(Employee) request.getAttribute("employee"); %>>
<center>
    <h2>Employee Details</h2>
    <hr>
    <form action="req3" method="get">
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="eid" value="<%= e1.getEid() %>"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="ename" value="<%= e1.getEname() %>"></td>
            </tr>
            <tr>
                <td>Designation:</td>
                <td><input type="text" name="edesignation" value="<%= e1.getEdesignation() %>"></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><input type="text" name="esalary" value="<%= e1.getEsalary() %>"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
