<%-- 
    Document   : calculadora
    Created on : 25/08/2021, 20:19:49
    Author     : jefte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>resultado</title>
    </head>
    <body>
        <form action="CalcBasica" method="get"> 
            <label> Valor A: </label>
            <input type="text" name="valorA">
            <br>
            <label> Valor B: </label>
            <input type="text" name="valorB">
            <br>
            <select name="opcao">
                <option value="+"> + </option>
                <option value="/"> - </option>
                <option value="/"> / </option>
                <option value="*"> * </option>
            </select>
            <input type ="submit" value="calcular">
            <br>
            <label> Resultado = </label>
                <%= request.getAttribute("resultado") %>
            
        </form>          
    </body>
</html>