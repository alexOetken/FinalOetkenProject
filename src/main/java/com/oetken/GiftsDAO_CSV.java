package com.oetken;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GiftsDAO_CSV {
    public static List<Gifts> getAll (HttpServletRequest request, HttpServletResponse response){
        List<Gifts> gifts = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(request.getServletContext().getRealPath("WEB-INF/gifts.txt")))) {
            int rowCount = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("\t", -1);
                rowCount++;
                if(rowCount != 1) {
                    String organization = line[0];
                    int giftYear = Integer.parseInt(line[1]);
                    String giftAmount = line[2];
                    String orgReportedStatement = line[3];
                    String website = line[4];
                    String orgReportedService = line[5];
                    String orgReportedArea = line[6];

                    gifts.add(new Gifts(organization, giftYear, giftAmount, orgReportedStatement, website, orgReportedService, orgReportedArea));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return gifts;
    }

}
