import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Redirect standard input and output
        try {
            // Redirect standard input
            System.setIn(new FileInputStream(inputFilePath));
            // Redirect standard output
            System.setOut(new PrintStream(new FileOutputStream(outputFilePath)));

            // Your code goes here

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int m = sc.nextInt();
                int[] arr = new int[m];

                for (int j = 0; j < m; j++) {
                    arr[j] = sc.nextInt();
                }

                solution(arr, m);
            }

            sc.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void solution(int[] arr, int m) {

        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int a : arr) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }
        int mxct = 0;
        for (Integer key : mp.keySet()) {
            mxct = Math.max(mxct, mp.get(key));
        }

        System.out.println(m - mxct);
        
    }
}