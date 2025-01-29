public class SmallestNumber {
    public static void main(String[] args) {
        int arr[] = {12,3,6,17,40,5};
        System.out.println(smallestNum(arr));
    }

    static int smallestNum(int arr[]){
        int  smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
