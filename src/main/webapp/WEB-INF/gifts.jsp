<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.oetken.Gifts" %>
<%@ page import="java.util.List" %>
<%
List<Gifts> giftsList = (List<Gifts>)request.getAttribute("giftsList");
%>
<link href="styles/styles.css" rel="stylesheet" type="text/css">

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gifts</title>
    <a class="homeImg" href="index.jsp"><img src="Images/yield_giving_logo_trans.png" height="90" width="163"></a>
    <a class="linkGroup" href="gifts">Gifts</a>
</head>
<body>


<h2 class="giftsHeader">Information in this database is updated periodically, following consultation with the
    organizations themselves to afford them an opportunity to share it in the ways that best serve their efforts.</h2>

<table>
<tr>
    <th>ORGANIZATION</th>
    <th>ORG-REPORTED FOCUS AREAS</th>
    <th>ORG-REPORTED GEOGRAPHIES OF SERVICE</th>
    <th>ORG-REPORTED MISSION STATEMENT</th>
</tr>
    <% for (Gifts gift: giftsList) { %>
    <tr>
        <td><%=gift.getOrganization()%> <br/> <%=gift.getGiftYear()%></td>
        <td><%=gift.getOrgReportedArea()%></td>
        <td><%=gift.getOrgReportedService()%></td>
        <td><%=gift.getOrgReportedStatement()%></td>
    </tr>
    <% } %>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

    <script src="scripts/gifts.js">
    </script>


</body>
</html>