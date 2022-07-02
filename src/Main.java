import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        task1();
        task2();
        task3();
    }

public static void task1() throws IOException {

        File f1 = new File("Война и Мир.txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input = "страдан";
        int count = 0;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            for (String word : words) {
                if (word.toLowerCase().startsWith(input)) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println("The given word is present for "+count+ " Times in the file");
        } else {
            System.out.println("The given word is not present in the file");
        }
        fr.close();

    }

    public static void task2() throws IOException {
        File f1 = new File("Война и Мир.txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        System.out.println("Type text to find: ");
        String input = new Scanner(System.in).nextLine();
        int count = 0;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");

            for (String word : words) {
                if (word.toLowerCase().startsWith(input)) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println("The given word is present for "+count+ " Times in the file");
        } else {
            System.out.println("The given word is not present in the file");
        }
        fr.close();
    }

    public static void task3() {

        for (int i = 1; i < 11; i++) {
            for(int k = 1; k < 11; k++) {
                System.out.printf("%4d", (i * k));
            }
            System.out.println(" ");
        }
    }
        }