import java.util.ArrayList;
import java.util.Arrays;

public class unionArrayOptimal {
    public static ArrayList<Integer> union(int arr1[], int arr2[]){
        int i =0;
        int j =0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> unionArray = new ArrayList<>();
        while (i<n1 && j<n2) {
            if (arr1[i]<=arr2[j]) {
                if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr1[i] ) {
                    unionArray.add(arr1[i]);
                }
                i++;
            } else{
                if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr2[j] ) {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }
        while (i<n1) {
            if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr1[i] ) {
                unionArray.add(arr2[i]);
                i++;
            }
        }
        while (j<n2) {
            if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr2[j] ) {
                unionArray.add(arr2[j]);
                j++;
            }
        }
        return unionArray;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4,5};
        int arr2[]={1,2,2,6,7};
        int arr[] = new int[union(arr1,arr2).size()];
        int i=0;
        for(int elem : union(arr1,arr2)){
            arr[i++] =  elem;
        }
        System.out.println(Arrays.toString(arr));
    }
}