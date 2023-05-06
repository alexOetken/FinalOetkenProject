package com.oetken;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO_CSV {

    public static List<Users> getAllUsers (HttpServletRequest request, HttpServletResponse response){
        List<Users> users = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(request.getServletContext().getRealPath("WEB-INF/users.csv")))) {
            int rowCount = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",", -1);
                rowCount++;
                if(rowCount != 1) {
                    String email = line[0];
                    String firstName = line[1];
                    String lastName = line[2];
                    String uniqueLogId = line[3];
                    String role = line[4];

                    Users user = new Users(email, firstName, lastName, uniqueLogId, role);
                    users.add(user);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return users;

    }


// https://stackoverflow.com/questions/8256389/appending-to-the-last-line-of-csv-file-in-java

    public void appendToCSV(ServletContext context, String fileName, String[] rowData) throws IOException {
        String filePath = context.getRealPath("/") + fileName;

        int lastID = 0;
        if (Files.exists(Paths.get(filePath))) {
            try {
                String lastLine = Files.readAllLines(Paths.get(filePath)).get(Files.readAllLines(Paths.get(filePath)).size() - 1);
                String[] parts = lastLine.split(",");
                lastID = Integer.parseInt(parts[0]);
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            }
        }
        int newID = lastID + 1;

        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(newID + ",");
            for (int i = 0; i < rowData.length; i++) {
            bufferedWriter.write(rowData[i]);
            if (i < rowData.length - 1) {
                bufferedWriter.write(",");
            }
        }
            bufferedWriter.newLine();

            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
    }

}
