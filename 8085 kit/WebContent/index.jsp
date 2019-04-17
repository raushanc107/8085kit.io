<%-- 
    Document   : index
    Created on : Feb 20, 2019, 8:16:34 AM
    Author     : raush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="files.*"%>

<%

%>
<!DOCTYPE html>

<html>
    <head>
     
    </head>
    <body>
        <%
        Assembler o=new Assembler();
        trainer t=new trainer(o);
        session.setAttribute("o",o);
        session.setAttribute("t",t);
        response.sendRedirect("main.jsp");
        
        %>

    </body>
</html>
