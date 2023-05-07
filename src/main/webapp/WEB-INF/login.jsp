<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String logInStatus = request.getParameter("logInFailed");
    if(logInStatus == null || logInStatus == "please log in"){
        logInStatus = "";
    }else if (logInStatus == "unable to log in, wrong password or email"){
        logInStatus = "Wrong password or email";
    }

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
<!doctype html>
<html lang="en">
<link href="styles/styles.css" rel="stylesheet" type="text/css">
<head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        <a class="homeImg" href="index.jsp"><img src="Images/yield_giving_logo_trans.png" height="90" width="163"></a>
        <a class="linkGroup" href="gifts">Gifts</a>
    <a class="linkGroup" href="<%=essayPage%>"><%=essayPageText%></a>
</head>
<body>

<form method="POST" action="login" id="login-form" class="loginForm">
    <input type="text" class="form-control" name="email" id="email" placeholder="name@example.com">
    <label for="email">Email address</label>
    </div>
    <div class="form-floating">
        <input type="password" class="form-control" name="password" id="password" placeholder="Password">
        <label for="password">Password</label>
    </div>
    <button class="btn-primary" type="submit">Sign in</button>
</form>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>