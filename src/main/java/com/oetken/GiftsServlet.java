package com.oetken;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GiftsServlet",
            urlPatterns = {"/gifts"},
        loadOnStartup = -1)

public class GiftsServlet extends HttpServlet {

    private static List<Gifts> giftsList;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(giftsList == null) {
            giftsList = GiftsDAO_CSV.getAll(request, response);
        }
    List<Gifts> newGiftList = new ArrayList<Gifts>(giftsList.size());
        for(Gifts gifts : giftsList) {
            try {
                newGiftList.add((Gifts)gifts.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        request.setAttribute("giftsList", newGiftList);

        request.getRequestDispatcher("/WEB-INF/gifts.jsp").forward(request, response);
    }
}
