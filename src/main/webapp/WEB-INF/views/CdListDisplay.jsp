<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>CD Library</title>
</head>
<body>
	<h1 align="center">CD Library</h1>
	
	<style>
	  table {
	    border-collapse: collapse;
	  }
	  td {
	  	border: 1px solid #ccc;
	    padding: 10px;
	  }
	  th {
	    border: 1px solid #ccc;
	    padding: 10px;
	    text-align: center;
	    background-color: teal;
	  }
	  tr:nth-child(even) {
	  	background-color: silver;
	  }
	  tr:nth-child(odd) {
	    background-color: white;
	  }            
	</style>
	
	<table align="center">
        <tr>
        	<th><font color="#FFFFFF">Sr. No.</font></th>
            <th><font color="#FFFFFF">Title</font></th>
            <th><font color="#FFFFFF">Artist/s</font></th>
            <th><font color="#FFFFFF">Year Of Release</font></th>
            <th><font color="#FFFFFF">Number Of Tracks</font></th>
            <th><font color="#FFFFFF">Total Playing Time</font></th>
            <th><font color="#FFFFFF">Display Tracks</font></th>
        </tr>
        <c:forEach items="${cdList}" var="cd">
            <tr>
            	<td align="center">${cd.id}</td>
                <td>${cd.title}</td>
                <td>${cd.artists}</td>
                <td align="center">${cd.yearOfRelease}</td>
                <td align="center">${cd.numberOfTracks}</td>
                <td align="center">${cd.totalPlayingTime}</td>
                <td align="center"><a href="<c:url value="/cdTracks/${cd.id}" />" >Tracks</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
