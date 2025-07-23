public class MissingNumberOptimal1 {
    public static int findMissingOne(int arr[],int n){
        int nSum = (n*(n+1))/2;
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return nSum - sum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(findMissingOne(arr,6));
    }    
}
