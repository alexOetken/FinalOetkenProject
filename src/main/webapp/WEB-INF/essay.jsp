<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
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


<!doctype html>
<html lang="en">
<link href="styles/styles.css" rel="stylesheet" type="text/css">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Essays</title>
    <a class="homeImg" href="index.jsp"><img src="Images/yield_giving_logo_trans.png" height="90" width="163"></a>
    <a class="linkGroup" href="gifts">Gifts</a>
    <a class="linkGroup" href="<%=essayPage%>"><%=essayPageText%></a>
    <a class="linkGroup" href="login">Login</a>
</head>
<body>

<h2>Giving Pledge</h2>
<h4> MacKenzie Scott  •  May 25, 2019 </h4>
<p>
    Thinking about the Giving Pledge, my mind kept searching its folds for a passage I once read about writing, something about not saving our best ideas for later chapters, about using them now.

    I found it this morning on a shelf of my books from college, toward the end of Annie Dillard’s The Writing Life. It was underlined and starred like all of the words that have inspired me most over the years, words that felt true in context, and also true in life:

    “Do not hoard what seems good for a later place in the book, or for another book… The impulse to save something good for a better place later is the signal to spend it now. Something more will arise for later, something better… Anything you do not give freely and abundantly becomes lost to you. You open your safe and find ashes.”

    I have no doubt that tremendous value comes when people act quickly on the impulse to give. No drive has more positive ripple effects than the desire to be of service. There are lots of resources each of us can pull from our safes to share with others — time, attention, knowledge, patience, creativity, talent, effort, humor, compassion. And sure enough, something greater rises up every time we give: the easy breathing of a friend we sit with when we had other plans, the relief on our child’s face when we share the story of our own mistake, laughter at the well-timed joke we tell to someone who is crying, the excitement of the kids in the school we send books to, the safety of the families who sleep in the shelters we fund. These immediate results are only the beginning. Their value keeps multiplying and spreading in ways we may never know.

    We each come by the gifts we have to offer by an infinite series of influences and lucky breaks we can never fully understand. In addition to whatever assets life has nurtured in me, I have a disproportionate amount of money to share. My approach to philanthropy will continue to be thoughtful. It will take time and effort and care. But I won’t wait. And I will keep at it until the safe is empty.
</p>

</body>
</html>