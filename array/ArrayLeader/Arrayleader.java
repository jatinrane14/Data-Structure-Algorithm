import java.util.ArrayList;

public class Arrayleader {
    public static ArrayList<Integer> findLeader(int arr[]){
        ArrayList<Integer> leaderList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    flag = false;
                    break;
                } else if(arr[i]>=arr[j]){
                    flag = true;
                    continue;
                }
            }
            if (flag) {
                leaderList.add(arr[i]);
            }
        }
        leaderList.add(arr[arr.length-1]);
        return leaderList;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        System.out.println(findLeader(arr));
    }
}
