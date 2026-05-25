


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {  
    public static void main(String[] args) {
    	System.out.println("Akshara Gupta \n CS 2A(ELITE) \n 2401640100125");
        FileReader reader = null;
        FileWriter writer = null;

        try {
           
            reader = new FileReader("input.txt");

           
            writer = new FileWriter("output.txt");

            int data;

         
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}