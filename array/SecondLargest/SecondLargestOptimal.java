public class SecondLargestOptimal{
    static int findSecondLargest(int arr[]){
        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,6,5,9,8};
        System.out.println(findSecondLargest(arr));
    }
}