package RecordsFromFile;

import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fileToRead = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get("src/" + fileToRead))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + " is " + age + " years old.");
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
