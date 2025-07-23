public class MissingNumberBetter {
    public static int findMissingOne(int arr[],int n){
        int hashArr[] = new int[n+1];
        for(int i =0;i<n-1;i++){
            hashArr[arr[i]]++;
        }
        for(int j =1;j<hashArr.length;j++){
            if(hashArr[j] == 0){
                return j;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,5};
        System.out.println(findMissingOne(arr,5));
        
    }    
}
