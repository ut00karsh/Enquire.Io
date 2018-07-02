<%-- 
    Document   : AskQuery
    Created on : 28 Aug, 2017, 3:45:50 PM
    Author     : Piyush Shukla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body style="background-color:#e1e1e1;">
   
    <h1 align="center"><font color="red" face="comic sans ms'">Expert-Exchange</h1><br><br><hr>
    <h3 align="left"><font color="red" face="comic sans ms'">choose subject :-</h3><br>
    <select class="new" name="t1">
        <option value="python">python</option><br>
<option value="java">java</option><br>
<option value="c-language">c-language</option><br>
    <option value="DS">Data-Structure</option><br>
<option value="DA">design and analysis of algorithms </option><br>
<option value="TAFL">AutoMata</option><br>
<option value="DBMS">DBMS</option><br>
</select><br><br> 
    <h3 align="left"><font color="red" face="comic sans ms'">Put Your Query :-</h3><br>
<form  class ="new" action="">
    <textarea name="h" rows="12" cols="100" bgcolor="#cacfd2"></textarea>
    <br><br>
<input type="submit" class="button" bgcolor="#cacfd2"  value="submit query"/> <input type="reset" class="button" value="RESET"/>
</form>
</body>

    