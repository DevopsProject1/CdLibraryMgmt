<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>CD Tracks</title>
</head>
<body>
	<h1 align="center">CD Tracks</h1>
	
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
            <th><font color="#FFFFFF">Title</font></th>
            <th><font color="#FFFFFF">Author/s</font></th>
            <th><font color="#FFFFFF">Playing Time</font></th>
        </tr>
        <c:forEach items="${cdTracks}" var="track">
            <tr>
                <td>${track.title}</td>
                <td>${track.authors}</td>
                <td align="center">${track.playingTime}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
