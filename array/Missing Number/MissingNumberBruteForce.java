public class MissingNumberBruteForce {
    public static int findMissionNum(int arr[]){
        for(int i =1;i<=arr.length;i++){
            boolean flag = false;
            for(int j =0;j<arr.length-1;j++){
                if(arr[j] == i ){
                    flag = true;
                    break;
                }
                if(!flag){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {0,1,3,2,5};
        System.out.println(findMissionNum(arr));
    }   
}
