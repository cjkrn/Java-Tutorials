class FirstLastPosition {

    // Brute force
    public int[] searchRange(int[] nums, int target) {
        int[] positions = new int[2];
        int start =0 ;
        int end=  nums.length -1;
        int mid = (start+end) /2;
        int count =0;
        for ( int i =0; i<= end; i++){
            if (nums[i] == target){
                count++ ;
                if (count == 1) positions[0]= i;
                if (count > 1) positions[1] = i;
            }
        }
   
        if ( count == 1 ){
            positions[1] = positions[0];
        }
        if ( count ==0 ){
            positions[0] = -1;
            positions[1] = -1;
        }
        return positions;
    }


    // public int BinSearch( int[] nums, int start, int mid, int end, int target){

    //     if ( nums[mid] > target ){
    //         Search( nums, start, (start+mid)/2 , mid, target);
    //     }
    //     else if ( nums[mid] < target){
    //         Search( nums, mid, (end+mid)/2 , end, target);
    //     }
    //     else if (target == nums[mid]) {
    //         return mid;
    //     }
    // }
}