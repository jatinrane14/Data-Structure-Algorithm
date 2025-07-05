public class LargestElementRecursiveForce {
    static int largest(int arr[]){
        int largetElem = arr[0];
        for(int i =1;i<arr.length;i++){
            if (largetElem < arr[i]) {
                largetElem = arr[i];
            }
        }
        return largetElem;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,50,8,9,10};
        int lar = largest(arr);
        System.out.println("Largets  Element is: "+lar);
    }
}