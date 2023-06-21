import java.util.*;
import java.io.*;

public class Fibonacci {
    
    private static Map<Integer, Integer> FiboList = new HashMap<>(); 
    public static int fibonacciNumber(int no){
        // Write your code here.
        if (no < 1 )
            return 0;
        if ( no == 1 || no ==2 )
            return 1;
        if( FiboList.containsKey(no)){
            return FiboList.get(no);
        }
        int a =1;
        int b =1;
        int fib = 0;
        for ( int i=3; i<= no; i++){
            fib = (a+b)% 1000000007;
            a =b;
            b =fib;

        }

        // int fib = (fibonacciNumber( no-1 ) + fibonacciNumber(no - 2)) % 1000000007 ;
        FiboList.put(no, fib);
        return fib;


    }
    public static void main ( String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i=0 ; i< test; i++){
            int no = Integer.parseInt(br.readLine());
            if (no < 0){
                int sum = fibonacciNumber(no);
                System.out.println(sum);
            }
        }
        
    }

}