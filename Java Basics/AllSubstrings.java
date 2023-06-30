import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class AllSubstrings {
	
    static void printSubstrings(String input) {
        // Write your code here
        Set<String> substrings = new HashSet<String>();
        int len = input.length();
        if( len !=0){
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j<= len; j++) {
                    System.out.println(input.substring(i, j));
                }
            }
        }
        else{
            System.out.println("-1");
        }
    }
    
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =br.readLine();
        printSubstrings(input);
	}
}
