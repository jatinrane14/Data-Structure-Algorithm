public class SecondLargestBetter {
    public static int findSecondLargest(int arr[]){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest= arr[i];
            }
        }
        int sLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>sLargest && arr[i]!=largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,3,7,2,4,9,5};
        System.out.println(findSecondLargest(arr));
    }
}