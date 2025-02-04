import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Moveatlast {
    public static void main(String[] args) {

        // Brute force approach

        int arr[]={1,0,2,8,3,2,0,0,8};
        List<Integer> li = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++) {
            if(arr[i]!=0){
                li.add(arr[i]);
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i<li.size()){
                arr[i] = li.get(i);
            }
            else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // T.C. -> O(n)
        // S.C. -> O(n)
    }    

}
