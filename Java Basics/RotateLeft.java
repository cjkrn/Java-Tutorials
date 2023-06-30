import java.util.* ;
import java.io.*; 
public class RotateLeft {
	
	public static void main(String args[]) throws IOException {
		
		// Write code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>(no);
		String[] token= br.readLine().split(" ");
		for (int i=0 ; i<no; i++){
			arr.add(Integer.parseInt(token[i]) );
		}
		int rotate= Integer.parseInt(br.readLine());
		for (int i =0 ; i< rotate; i++){
			int temp = arr.get(0);
			arr.add(temp);
			arr.remove(0);
		}
		for(int num: arr){
			System.out.print(num + " ");
		}
	}

}