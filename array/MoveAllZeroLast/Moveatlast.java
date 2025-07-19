import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Moveatlast {
    public static void main(String[] args) {
        int arr[] ={1,0,0,2,0,4,7,0,4,0};
        List<Integer> li = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                li.add(arr[i]);
            }
        }
        for(int i =0;i<arr.length;i++){
            if(i<li.size()){
                arr[i] = li.get(i);
            }
            else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }    

}
