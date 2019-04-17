<%-- 
    Document   : converter
    Created on : 24-Mar-2019, 7:51:54 PM
    Author     : raushan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="index.js"></script>
        <style>
            body{
                text-align: center;
            }
             hr{
                padding: 0;
                margin: 0;
                border-color: green;
            }
            .valto{
                background-color: transparent;
                color: green;
                text-align: center;
                font-size: 30px;
                border:none;
                width: 100%;
            }
            .valto::placeholder{
                font-size: 20px;
            }
            #but{
                 color: white;
                        border-radius: 4px;
                        font-family: sans-serif;
                        font-weight:lighter;
                        font-size: 13px;
                        letter-spacing: 0.1em;
                        background-color: green;
                        border: none;
                        padding:5px 7px;
            }
            #but:active{
                background-color: #0C5900;
            }
            #l1{
                text-align: left;
            }
            #contable tr,#contable td,#contable th{
                border: 1px solid green;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <b>CONVERTER</b><hr><br><br>
        
        <table id="contable">
            <tr>
                <th>HEXADECIMAL</th>
                <td><input type="text"  class="valto"  id="hex" onkeyup="convert1();" placeholder="Enter value Here"/></td>
            </tr>
            <tr>
                <th>DECIMAL</th>
                <td><input type="number"  class="valto" id="dec" onkeyup="convert2();" placeholder="Enter value Here"/></td>
            </tr>
            <tr>
                <th>BINARY</th>
                <td><input type="number"  class="valto" id="bin" onkeyup="convert3();" placeholder="Enter value Here"/></td>
               
            </tr>
        </table>
        <br>
        
        
        <div id="conresult">
            
            
        </div>
    </body>
</html>
