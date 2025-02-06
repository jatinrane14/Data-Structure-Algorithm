public class linerSearch {
    static int search(int ar[],int target){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        if(search(arr, 55)!=-1){
            System.out.println("Element is present at index: "+search(arr, 55));
        }else{
            System.out.println("Element is not found in list");
        }

    }
}
