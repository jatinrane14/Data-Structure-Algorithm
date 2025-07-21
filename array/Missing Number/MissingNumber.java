public class MissingNumber {
    public static int findMissionNum(int arr[]){
        int expectedSum = (arr.length*(arr.length+1))/2;
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        return (expectedSum - sum);
    }
    public static void main(String args[]){
        int arr[] = {0,1,3,2,5};
        System.out.println(findMissionNum(arr));
    }    
}