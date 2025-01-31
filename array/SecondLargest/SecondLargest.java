public class SecondLargest {
    static int SecondLar(int arr[]){
        int lar = arr[0],Slag=-1;
        for(int i =0;i<arr.length;i++){
            if (lar<arr[i]) {
                lar = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if (arr[i] > Slag && arr[i] < lar ) {
                Slag = arr[i];
            }
        }
        return  Slag;
    }
    public static void main(String[] args) {
        int arra[]={12,8,5,2,6,9,13};
        System.out.println(SecondLar(arra));
    }
}
