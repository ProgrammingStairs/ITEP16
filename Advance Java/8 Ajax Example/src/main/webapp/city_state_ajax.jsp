<%@page import="com.ajax.dto.City"%>
<%@page import="java.util.List"%>
<%@page import="com.ajax.dao.CityDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int stateid = Integer.parseInt(request.getParameter("stateId"));
		CityDao cityDao = new CityDao();
		List<City> list = cityDao.getCityList(stateid);
	%>
	<option value="">Select City</option>
	<%
		for(City city : list){
			System.out.println(city.getCityid()+" "+city.getStateid()+" "+city.getCityname());
	%>
		<option value="<%=city.getCityid()%>"><%=city.getCityname()%></option>
	<%} %>
</body>
</html>