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
      
            #astablee tr,#astablee td,#astablee th{
                border: 1px solid green;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <b>MEMORY TABLE</b>
        <hr>
        <table id="astablee">
            <tr>
                <th>\</th>
                <th>0</th>
                <th>1</th>
                <th>2</th>
                <th>3</th>
                <th>4</th>
                <th>5</th>
                <th>6</th>
                <th>7</th>
                <th>8</th>
                <th>9</th>
                <th>A</th>
                <th>B</th>
                <th>C</th>
                <th>D</th>
                <th>E</th>
                <th>F</th>
            </tr>
        <%
            Assembler o=(Assembler)session.getAttribute("o");
           trainer t=(trainer)session.getAttribute("t");
            for(int i=0;i<t.o.jTableMemory.length;i++){%>
                <tr>
           <%for(int j=0;j<17;j++){
               String s=t.o.jTableMemory[i][j];
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
