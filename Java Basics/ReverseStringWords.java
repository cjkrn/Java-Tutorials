import java.io.*;
import java.util.Scanner;
class ReverseStringWords {

    static String reverseStringWordWise(String input) {
        int len= input.length();
        int wordEnd = len ;
        String ans = "";
        for ( int i = len -1; i>= 0 ; i --){
            char ch = input.charAt(i);
            if(ch == ' '){
                ans += input.substring( i+1 , wordEnd );
                wordEnd = i;
                ans += " ";
            }
            if( i == 0){
                ans += input.substring( i , wordEnd);
            }
        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String input = br.readLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}