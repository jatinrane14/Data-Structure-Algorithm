public class Solution {
    public static int missinNumber(int arr[]){
        for(int i =1;i<=arr.length;i++){
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    flag =true;
                    break;
                }
            }
            if (flag==false) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
     {
        int arr[]={1,2,3,4};
        System.out.println(missinNumber(arr));
    }
}
