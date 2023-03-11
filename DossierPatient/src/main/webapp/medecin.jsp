<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
      <%@page import="dp.patient.db.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link  href="css/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h2 align="center">
      <a href="addDoctor.jsp">Add New Doctor</a><br>
    </h2>
<form action="">
  <table class="table">
  <thead>
    <tr>
      <th scope="col">CodeMedecin</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Specialite</th>
      <th scope="col">Nom hopital</th>
      <th scope="col">Ville</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    
      <%
		        Connection con=DBConnection.getConn();
		        Statement statement = con.createStatement();
		        ResultSet resultSet=statement.executeQuery("select * from doctor");
                while (resultSet.next()) {
       %>
      <tr>
        <th scope="row">
          <%
            out.print(resultSet.getInt(1));
          %>
        </th>
        <td>
          <%
            out.print(resultSet.getString(2));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(3));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(4));
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(5));
          %>
        </td>
         <td>
          <%
            out.print(resultSet.getString(6));
          %>
        <form action="MyServlet" method="post">
          <td><a value="Edit" name="Action"
            href="edit-doctor.jsp?id=<%=resultSet.getInt(1)%> ">Edit</a>
             
            <a href="delete.jsp">Delete</a>&nbsp;&nbsp;&nbsp;</td>
      </tr>
      </form>
      <%
}
%>
      
  </tbody>
</table>
   </form>
</body>
</html>