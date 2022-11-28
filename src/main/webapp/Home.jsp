

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

 
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Teja Valavala</title>
<link rel="stylesheet" href="styles.css"/>
</head>
<body>

<form action="Register" method="POST">
<div class="popup" id="popup">
        <button id="close" style="float: right;" onclick="closePopup()">submit</button>
        <h2>Add Employee</h2>
            <table >
            
                <tr>
                 <td><b>Employee Id :</b></td>
                 <td><input type="text" name="empid" id="empid"></td>
                </tr>
                <tr>
                    <td><b>Employee Name :</b></td>
                    <td><input type="text" name="empname" id="empname"></td>
                   </tr>
                <tr>
                    <td><b>DOJ :</b></td>
                    <td><input type="date" name="empdoj" id="empdoj"></td>
                </tr>
                <tr>
                    <td><b>YOE :</b></td>
                    <td><input type="text" name="empyoe" id="empyoe"></td>
                </tr>
                <tr>
                    <td><b>Designation :</b></td>
                    <td><input type="text" name="empDesignation" id="empDesignation"></td>
                </tr>
            </table>
        <button type="button" id="submit" value=submit onclick="closePopup()">close</button>
    </div>
    
<script>

let popup = document.getElementById("popup");

function openPopup(){
    popup.classList.add("open-popup");
}

function closePopup(){
    popup.classList.remove("open-popup");
}
</script>

</form>

<input type="text" placeholder="Search" class="srh">
<button type="submit" class="btn" onclick="openPopup()">Add</button>
<br>
<br>
<table border="1px solid black">
	
    <thead>
        <tr>
            <th>EId</th>
            <th>Employee Name</th>
            <th>YOJ</th>
            <th>YOE</th>
            <th>Designation</th>
        </tr>
        <tr>
        <td>1</td>
        <td>Teja Valavala</td>
        <td>17/05/2000</td>
        <td>4</td>
        <td>Java Developer</td>
        </tr>
        
</thead>
</table>
        
</body>
</html>