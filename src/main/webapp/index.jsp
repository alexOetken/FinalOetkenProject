<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String loggedInStatus = (String)session.getAttribute("status");
    String essayPage;
    String essayPageText;
    if(loggedInStatus == null){
        essayPage = "";
        essayPageText = "";
    }else{
        essayPage = "essays";
        essayPageText = "Essays";
    }
%>

<link href="styles/styles.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
<html>
<head>
    <title>Yield Giving</title>
    <a class="homeImg" href="index.jsp"><img src="Images/yield_giving_logo_trans.png" height="90" width="163"></a>
    <a class="linkGroup" href="gifts">Gifts</a>
    <a class="linkGroup" href="<%=essayPage%>"><%=essayPageText%></a>
    <a class="linkGroup" href="login">Login</a>
</head>

<body>
<div>
<img src="Images/yield_giving_logo_trans.png" height="176" width="323" class="center">
<h2>yield: (verb) 1. to increase 2. to give up control</h2></div>

<div class="mainPara">
    <h3>Established by MacKenzie Scott to share a financial fortune created through the effort of countless people, Yield is named after a belief in adding value by giving up control. To date, our network of staff and advisors has yielded over $14,000,000,000 to 1,600+ non-profit teams to use as they see fit for the benefit of others.
        <br />
        <br />
        Information has been shared publicly in this series of essays. </h3> </div>
</body>
</html>
