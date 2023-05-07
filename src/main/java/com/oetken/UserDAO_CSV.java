package com.oetken;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO_CSV {

    public static List<Users> getAllUsers(HttpServletRequest request, HttpServletResponse response) {
        List<Users> users = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(request.getServletContext().getRealPath("WEB-INF/users.csv")))) {
            int rowCount = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",", -1);
                rowCount++;
                if (rowCount != 1) {
                    String email = line[0];
                    String uniqueLogId = line[1];
                    String role = line[2];
                    Users user = new Users(email, uniqueLogId, role);
                    users.add(user);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return users;
    }

// https://stackoverflow.com/questions/8256389/appending-to-the-last-line-of-csv-file-in-java
    //https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/io/FileWriter.html

    ///welp, couldnt get this to work

}
