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
                overflow: hidden;
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
            #btn3{
                background-color: green;
                color: white;
            }
            #tcont{
                
                overflow-x: hidden;
                overflow-y: scroll;
                height: 85%;
            }
        </style>
    </head>
    <body>
        <hr>
        
         <ul class="btngrp">
                <li class="btnn2" id="btn3" onclick="document.getElementById('btn2').click();">USED MEMORY ADDRESS</li>
                <li class="btnn2" id="btn4" onclick="mem1();">ALL MEMORY ADDRESS</li>
                
            </ul>
        <br><br>
        <div id="tcont">
        <b>MEMORY TABLE</b>
        <hr>
        
        <table id="astablee">
            <tr>
                <th>ADDRESS</th>
                <th>VALUE</th>
                
            </tr>
        <%
            Assembler o=(Assembler)session.getAttribute("o");
           trainer t=(trainer)session.getAttribute("t");
            for(int i=0;i<t.o.jsTableMemory.length && t.o.jsTableMemory[i][0]!=null;i++){%>
                <tr>
           <%for(int j=0;j<2;j++){
               String s=t.o.jsTableMemory[i][j];
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
        </div>
    </body>
</html>
