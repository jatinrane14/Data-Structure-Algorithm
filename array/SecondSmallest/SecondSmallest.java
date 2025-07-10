public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={12,3,6,17,40,5};
        System.out.println(secondSmallest(arr));
    }
    static int secondSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        int secondSmall=0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]<smallest) {
                secondSmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<secondSmall ){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
}