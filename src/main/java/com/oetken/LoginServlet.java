package com.oetken;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("logInFailed", "please log in");
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {String logInStatus;
      String email = request.getParameter("email");
      String uniqueLogId = request.getParameter("password");

      UserDAO_CSV userDao = new UserDAO_CSV();

      List<Users> allUsers;

      allUsers = userDao.getAllUsers(request, response);


        for(Users user : allUsers){
            if(user.getEmail().matches(email) && user.getUniqueLogId().matches(uniqueLogId)){
                 HttpSession session = request.getSession();
                session.setAttribute("status", "loggedIn");
                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        }

       request.getRequestDispatcher("/WEB-INF/gifts.jsp").forward(request, response);

    }
}
