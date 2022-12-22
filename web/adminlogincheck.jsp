<%
  
 String username = request.getParameter("uname");
     String pass = request.getParameter("pass");
     
     if(username.equals("Yamini Namdev") && pass.equals("adminyamini")) 
     {
         
         response.sendRedirect("adminhome.jsp");
     }
     else
     {
           out.println("Login Fail");
     }
%>