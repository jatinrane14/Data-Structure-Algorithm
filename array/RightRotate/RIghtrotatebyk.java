import java.util.Arrays;

public class RIghtrotatebyk {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k = 3;
        if(k>nums.length){
            k = k%nums.length;
        }
        int temp[] = new int[k];
        int index=0;
        for(int i= nums.length-k;i<nums.length;i++){
            temp[index] = nums[i];
            index++;
        }

        for(int i = nums.length-(k+1);i>=0;i--){
            nums[i + k] = nums[i];
        }

        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
