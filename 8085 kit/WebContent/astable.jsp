<%-- 
    Document   : astable
    Created on : 24-Mar-2019, 3:49:11 PM
    Author     : raushan
--%>

<%@page import="files.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                text-align: center;
            }
            hr{
                padding: 0;
                margin: 0;
                border-color: green;
            }
      
            #astablee tr,#astablee td{
                border: 1px solid green;
            }
        </style>
    </head>
    <body>
        <b>ASSEMBELER TABLE</b>
        <hr>
        <table id="astablee">
        <%
            Assembler o=(Assembler)session.getAttribute("o");
           trainer t=(trainer)session.getAttribute("t");
            int begin=t.o.engine.Hex2Dec(t.o.jTextFieldBeginFrom);
            for(int i=begin;i<t.o.jTableAssembler.length && t.o.jTableAssembler[i][4]!=null;i++){%>
                <tr>
           <%for(int j=0;j<6;j++){
               String s=t.o.jTableAssembler[i][j];
               try{
               if(s.isEmpty()){
                   
               }}catch(Exception e){
                   s="";
               }
           %>
           <td><%=s%></td>
         <%  }%>
         
                </tr>
                <%
       }
        %>
        </table> 
        
    </body>
</html>
