import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatenf {
     static void removeDuplicate(int arr[]){
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (ls.isEmpty()) {
                ls.add(arr[i]);
            }
            else{
                boolean flag = false;
                for (Integer elem : ls) {
                    if (elem!=arr[i]) {
                        flag = true;
                        continue;
                    }
                    flag = false;  
                    break;
                }
                if (flag) {
                    ls.add(arr[i]);
                }
            }
        }
        for (Integer integer : ls) {
            System.out.print(integer + " ");
        }
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,4};
        removeDuplicate(arr);
    }
}
