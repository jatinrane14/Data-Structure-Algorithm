public class binarySearch {
    public static int search(int ar[],int target,int low,int high){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(ar[mid] == target){
            return mid;
        }
        if(ar[mid]<target){
            return search(ar,target,mid+1,high);
        }
        return search(ar,target,low,mid-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int srchIndx = search(arr,4, 0, arr.length-1);
        if(srchIndx!=-1){
            System.out.println("Element found at index: "+srchIndx);
        } else{
            System.out.println("Element is not found");
        }
    }
}
