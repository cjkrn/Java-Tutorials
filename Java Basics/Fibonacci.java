import java.util.*;
import java.io.*;

public class Fibonacci {
    private static Map<Integer, Long> FiboList = new HashMap<>();

    public static long fibonacciNumber(int no) {
        if (no < 1)
            return 0;
        if (no == 1 || no == 2)
            return 1;
        if (FiboList.containsKey(no)) {
            return FiboList.get(no);
        }
        long fib = fibonacciNumber(no - 1) + fibonacciNumber(no - 2);
        FiboList.put(no, fib);
        return fib;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            long no = Long.parseLong(br.readLine());
            if (no < 0) {
                long sum = fibonacciNumber((int) no);
                System.out.println(sum);
            }
        }
    }
}
