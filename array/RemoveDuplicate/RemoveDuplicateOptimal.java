public class RemoveDuplicateOptimal {
    static int removeDuplicate(int[] arr){
        int i =0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,6,6,7,7};
        int ind = removeDuplicate(arr);
        for(int i =0;i<ind;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
