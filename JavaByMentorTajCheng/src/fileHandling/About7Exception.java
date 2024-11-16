package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class About7Exception {
    public static void main(String[] args) {
        // Assuming the date might be null
        Date date = null; // Simulating a null date, replace with actual date retrieval logic
        String formattedDate = null;

        // Check if date is null before formatting
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
            formattedDate = df.format(date);
        } else {
            // Handle the null date case appropriately, e.g., assign a default value or log the issue
            formattedDate = "Date not provided";
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Formatted Date: " + formattedDate);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
