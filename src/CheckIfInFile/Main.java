package CheckIfInFile;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of file to be read: ");
        String fileName = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get("src/" + fileName))){
            while(reader.hasNextLine()){
                names.add(reader.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

        System.out.println("Enter names, an empty line quits: ");
        while(true){
            String name = scanner.nextLine();

            if(names.contains(name)){
                System.out.println("The name is on the list");
            } else {
                System.out.println("The name is not on the list");
            }
        }
    }
}
