package NumbersFromFile;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File: ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get("src/" + file))){
            while(reader.hasNextLine()){
                numbers.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.print("Lower bound: ");
        int lower = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound: ");
        int upper = Integer.valueOf(scanner.nextLine());

        int count = 0;
        for(int number : numbers){
            if(number <= upper && number >= lower){
                count++;
            }
        }

        System.out.println("Numbers within bounds: " + count);
    }
}
