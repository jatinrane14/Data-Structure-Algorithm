import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Removeduplicate {
    static ArrayList<Integer> removeDuplicate(int arr[]){
        Set<Integer> s = new HashSet<>(); 
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            s.add(arr[i]);
            arr[i] =0;
        }
        for(int it :s ){
            ls.add(it);
        }
        return ls;
    }
    public static void main(String args[]){
        int arr[] = {2, 2, 3, 3, 7, 5};
        System.out.println(removeDuplicate(arr));
        
    }    
}
