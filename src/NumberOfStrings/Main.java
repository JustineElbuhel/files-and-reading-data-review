package NumberOfStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while(true){
            String line = scanner.nextLine();

            if(line.equals("end")){
                break;
            }

            counter++;
        }
        System.out.println("Lines read: " + counter);
    }
}