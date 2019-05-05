import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class filetoaray {
    public static void main(String[] args) throws IOException {

        
        PrintWriter pw = new PrintWriter("number1.txt");
        for (int i = 1; i <= 10; i++) {
            pw.println(i);

        }
        System.out.println("Proccessing complete...");
        pw.close();


        // Read from text
        File file = new File("number1.txt");

        Scanner sc = new Scanner(file);

        if (!sc.hasNext()) {
            System.out.println("Empty txt");
            System.exit(0);
        }

        int count = 0;
        int number;

        while (sc.hasNext()) {
            number = sc.nextInt();
            count++;
            System.out.print(number + " ,");

        }

        System.out.println();
        System.out.println("Beggins array");


            int count2 =0;
            int size = 10 + 1;
            int[] array = new int[size];

            for (int a = 0; a < array.length; a++) {

                array[a] = sc.nextInt();
                count2++;
                System.out.println(array[a]);
            }

            sc.close();




    }



}
