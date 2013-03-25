<%@ page import="ob.cochelper.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
</head>

<body>

Aşağıdaki formda tüm bina seviyelerinizi virgüllerle ayırarak yazınız. Örneğin 3 tane cannon varsa, ve seviyeleri 3, 4 ve 6 ise. "Top seviyeleri:" yazan yere şöyle yazınız: 3,4,6
<br>
Eksik olan binanız varsa, sistem otomatik olarak onu 0 seviye olarak işaretleyecektir.

<hr>

<form action="/" method="post">

   <div>Ana Bina: <select id="townHall" name="townHall">
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.TOWN_HALL)) { %>
      <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>
   <div>Klan Kalesi: <select id="clanCastle" name="clanCastle">
      <option value="0">0</option>
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.CLAN_CASTLE )) { %>
      <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>
   <div>İşçi sayısı: <select id="builderCount" name="builderCount">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
   </select></div>

   <h4>Savunma Binaları</h4>
    <div>Top seviyeleri: <input type="text" name="cannons" value="<%=request.getAttribute("cannons") == null ? "0" : request.getAttribute("cannons")%>"/></div>
    <div>Okçu kule seviyeleri: <input type="text" name="archerTowers" value="<%=request.getAttribute("archerTowers") == null ? "0" : request.getAttribute("archerTowers")%>"/></div>
    <div>Havan topu seviyeleri: <input type="text" name="mortars" value="<%=request.getAttribute("mortars") == null ? "0" : request.getAttribute("mortars")%>"/></div>
    <div>Sihirbaz Kule seviyeleri: <input type="text" name="wizardTowers" value="<%=request.getAttribute("wizardTowers") == null ? "0" : request.getAttribute("wizardTowers")%>"/></div>
    <div>Hava savunma seviyeleri: <input type="text" name="airDefenses" value="<%=request.getAttribute("airDefenses") == null ? "0" : request.getAttribute("airDefenses")%>"/></div>
    <div>Gizli tesla seviyeleri: <input type="text" name="hiddenTeslas" value="<%=request.getAttribute("hiddenTeslas") == null ? "0" : request.getAttribute("hiddenTeslas")%>"/></div>
    <div>X-topu seviyeleri: <input type="text" name="xBows" value="<%=request.getAttribute("xBows") == null ? "0" : request.getAttribute("xBows")%>"/></div>

   <h4>Üretim Binaları</h4>

   <div>Eliksir Toplayıcıları: <input type="text" name="elixirCollectors" value="<%=request.getAttribute("elixirCollectors") == null ? "0" : request.getAttribute("elixirCollectors")%>"/></div>
   <div>Altın madenleri: <input type="text" name="goldMines" value="<%=request.getAttribute("goldMines") == null ? "0" : request.getAttribute("goldMines")%>"/></div>
   <div>Kara eliksir madenleri: <input type="text" name="darkElixirDrills" value="<%=request.getAttribute("darkElixirDrills") == null ? "0" : request.getAttribute("darkElixirDrills")%>"/></div>
   <div>Altın depoları: <input type="text" name="goldStorages" value="<%=request.getAttribute("goldStorages") == null ? "0" : request.getAttribute("goldStorages")%>"/></div>
   <div>Eliksir depoları: <input type="text" name="elixirStorages" value="<%=request.getAttribute("elixirStorages") == null ? "0" : request.getAttribute("elixirStorages")%>"/></div>
   <div>Kara iksir depoları: <input type="text" name="darkElixirStorages" value="<%=request.getAttribute("darkElixirStorages") == null ? "0" : request.getAttribute("darkElixirStorages")%>"/></div>

   <h4>Ordu Binaları</h4>

   <div>Kamplar: <input type="text" name="armyCamps" value="<%=request.getAttribute("armyCamps") == null ? "0" : request.getAttribute("armyCamps")%>"/></div>
   <div>Kışlalar: <input type="text" name="barracks" value="<%=request.getAttribute("barracks") == null ? "0" : request.getAttribute("barracks")%>"/></div>
   <div>İzbe Kışlalar: <input type="text" name="darkBarracks" value="<%=request.getAttribute("darkBarracks") == null ? "0" : request.getAttribute("darkBarracks")%>"/></div>
   <div>Laboratuvar: <select id="laboratory" name="laboratory">
      <option value="0">0</option>
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.LABORATORY)) { %>
         <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>
   <div>Büyü Fabrikası: <select id="spellFactory" name="spellFactory">
      <option value="0">0</option>
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.SPELL_FACTORY )) { %>
         <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>

   <h4>Kahramanlar</h4>

   <div>Barbar Kral: <select id="barbarKing" name="barbarKing">
      <option value="0">0</option>
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.BARBAR_KING)) { %>
      <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>
   <div>Okçu Kraliçe: <select id="archerQueen" name="archerQueen">
      <option value="0">0</option>
      <% for (Level level : ob.cochelper.LevelHelper.getLevels(BuildingType.ARCHER_QUENN)) { %>
      <option value="<%=level.getIndex()%>"><%=level.getIndex()%></option>
      <% }%>
   </select></div>

   <div><input type="submit" value="Hesapla"/></div>
</form>

<% Village village = (Village)request.getAttribute("village");
   if(village != null){
      ProductionStat stat = village.getProductionStat();
      SingleStat buildTimeStat = stat.getBuildTimeStat();%>
<br>

<table border="1">
   <tr>
      <td></td>
      <td colspan="2">Harcanan</td>
      <td colspan="2">Kalan</td>
      <td>Toplam</td>
   </tr>
   <tr>
      <td>Zaman</td>
      <td><%=StringUtil.makeTimeReadable(buildTimeStat.getElapsed())%></td>
      <td>%<%=buildTimeStat.getElapsedPercentage()%></td>
      <td><%=StringUtil.makeTimeReadable(buildTimeStat.getRemaining())%></td>
      <td>%<%=buildTimeStat.getRemainingPercentage()%></td>
      <td><%=StringUtil.makeTimeReadable(buildTimeStat.getTotal())%></td>
   </tr>

   <%
      for (Resource resource : Resource.values()) {
      SingleStat resourceStat = stat.getResourceSingleStat(resource);
   %>

   <tr>
      <td><%=resource.name()%></td>
      <td><%=StringUtil.makeResourceReadable(resourceStat.getElapsed())%></td>
      <td>%<%=resourceStat.getElapsedPercentage()%></td>
      <td><%=StringUtil.makeResourceReadable(resourceStat.getRemaining())%></td>
      <td>%<%=resourceStat.getRemainingPercentage()%></td>
      <td><%=StringUtil.makeResourceReadable(resourceStat.getTotal())%></td>
   </tr>
   <%}%>
</table>

<% } %>


<script type="text/javascript">
   document.getElementById("laboratory").value = <%=request.getAttribute("laboratory")%>;
   document.getElementById("spellFactory").value = <%=request.getAttribute("spellFactory")%>;
   document.getElementById("townHall").value = <%=request.getAttribute("townHall")%>;
   document.getElementById("clanCastle").value = <%=request.getAttribute("clanCastle")%>;
   document.getElementById("builderCount").value = <%=request.getAttribute("builderCount")%>;
   document.getElementById("barbarKing").value = <%=request.getAttribute("barbarKing")%>;
   document.getElementById("archerQueen").value = <%=request.getAttribute("archerQueen")%>;
</script>
</body>
</html>
