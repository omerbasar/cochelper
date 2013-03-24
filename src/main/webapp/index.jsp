<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
</head>

<body>

Aşağıdaki formda tüm seviyeleri virgüllerle ayırarak yazınız.

<form action="/" method="post">
    <div>Cannons: <input type="text" name="cannons" value="<%=request.getAttribute("cannons") == null ? "0" : request.getAttribute("cannons")%>"/></div>
    <div>Archer towers: <input type="text" name="archerTowers" value="<%=request.getAttribute("archerTowers") == null ? "0" : request.getAttribute("archerTowers")%>"/></div>
    <div>Mortars: <input type="text" name="mortars" value="<%=request.getAttribute("mortars") == null ? "0" : request.getAttribute("mortars")%>"/></div>
    <div>Wizard Towers: <input type="text" name="wizardTowers" value="<%=request.getAttribute("wizardTowers") == null ? "0" : request.getAttribute("wizardTowers")%>"/></div>
    <div>Air Defenses: <input type="text" name="airDefenses" value="<%=request.getAttribute("airDefenses") == null ? "0" : request.getAttribute("airDefenses")%>"/></div>
    <div>Hidden Teslas: <input type="text" name="hiddenTeslas" value="<%=request.getAttribute("hiddenTeslas") == null ? "0" : request.getAttribute("hiddenTeslas")%>"/></div>
    <div>XBows: <input type="text" name="xBows" value="<%=request.getAttribute("xBows") == null ? "0" : request.getAttribute("xBows")%>"/></div>
    <div><input type="submit" value="Hesapla"/></div>
</form>

<br>
Kalan inşaat süresi: <%= request.getAttribute("remainingBuildTime") == null ? "" : request.getAttribute("remainingBuildTime")%>
<br>
Altın ihtiyacı     : <%= request.getAttribute("goldRequired") == null ? "" : request.getAttribute("goldRequired")%>
<br>
İksir ihtiyacı     : <%= request.getAttribute("elixirRequired") == null ? "" : request.getAttribute("elixirRequired") %>
<br>
Koyu iksir ihtiyacı : <%= request.getAttribute("darkElixirRequired") == null ? "" : request.getAttribute("darkElixirRequired")%>

</body>
</html>
