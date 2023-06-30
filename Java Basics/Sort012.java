import java.util.* ;

import java.io.*; 
public class Sort012 
{
    public static void sort012(int[] arr, )
    {
        int low =0;
        int mid=0;
        int high = arr.size()-1;
        while(mid<= high){
            if(arr[mid]== 0){
                swap(arr[mid], arr[low]);
                low++;
                mid++;
            }
            else if ( arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr[mid], arr[high]);
                high--;
            }
        }
        for ( int i=0; i< arr.size()-1; i++){
            if( arr.size()- 1){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i=0 ; i< test; i++){
            ArrayList<Integer> arr= new ArrayList<>();
            int no = Integer.parseInt(br.readLine());
            String[] token= br.readLine().split();
            ArrayList<Integer> sorted = new ArrayList<>();
            for ( int j =0; j< no ; j++){
                arr.add(token[j]);
            }
            sort012(arr);           
        }
    }
}