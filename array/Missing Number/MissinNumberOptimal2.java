public class MissinNumberOptimal2 {
    public static int findMissingOne(int arr[],int n){
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor1 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }
        System.out.println(xor1);
        System.out.println(xor2);
        return xor1 ^ xor2;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6};
        System.out.println(findMissingOne(arr,6));
    }    
}