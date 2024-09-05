import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
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
