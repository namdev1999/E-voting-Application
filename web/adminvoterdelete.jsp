<%-- 
    Document   : adminvoterdelete
    Created on : april 20, 2021, 3:09:23 PM
    Author     : Yamini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
 
<% 
        String Id = request.getParameter("Id");
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/voting","root","");
        pst = con.prepareStatement("delete from voter where Id = ?");
         pst.setString(1, Id);
        pst.executeUpdate();  
        
        %>
        
        <script>
            
            alert("Record Deleted");
            
       </script>
       
       <p><a href="adminvoter.jsp">Click Back</a></p>