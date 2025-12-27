<%@page import="com.ajax.dto.State"%>
<%@page import="java.util.List"%>
<%@page import="com.ajax.dao.StateDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
// ajax code
	function getCities(){
		var stateId = document.getElementById("state").value;
		const METHOD = "GET";
		const URL = "city_state_ajax.jsp?stateId="+stateId;
		const ASYNC = true;
		
		var xhttp = new XMLHttpRequest();
		xhttp.open(METHOD, URL, ASYNC);
		xhttp.send();
		
		xhttp.onreadystatechange = function(){
			if(xhttp.readyState==4 && xhttp.status==200){
				console.log(xhttp.responseText);
				document.getElementById("city").innerHTML=xhttp.responseText;
			}
		}
	}
</script>
</head>
<body>
	<h2>Example showing the concept of Ajax | State-City</h2>
	
	<%
		StateDao stateDao = new StateDao();
		List<State> list = stateDao.getStateList();
	%>
	<b>Select State</b>
	<select name="state" id="state" onchange="getCities()">
		<option value="">Select State</option>
		<% 
			for(State state : list){
		%>
		<option value="<%=state.getStateid()%>"><%=state.getStatename()%></option>
		<% }%>
	</select> <br>
	<b>Select City</b>
	<select name="city" id="city">
		<option value="">Select City</option>
	</select>
	
</body>
</html>