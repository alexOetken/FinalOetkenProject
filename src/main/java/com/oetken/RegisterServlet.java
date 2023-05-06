package com.oetken;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = new Users();
        String[] rowData = { user.getEmail(), user.getFirstName(), user.getLastName(), user.getUniqueLogId(), user.getRoles()};
        UserDAO_CSV userDAO = new UserDAO_CSV();

        try {
            userDAO.appendToCSV(getServletContext(), "/WEB-INF/users.csv", rowData);

        } catch (IOException e) {
            e.printStackTrace();
            throw new ServletException("Error writing data to CSV file", e);
        }

    }
}
