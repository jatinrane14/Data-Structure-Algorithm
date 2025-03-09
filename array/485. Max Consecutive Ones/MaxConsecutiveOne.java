class Solution{
    public static int maxConsecutiveOne(int arr[]){
        int count =0;
        int maxCount = 0;
        for (int digit : arr) {
            if (digit==1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}
public class MaxConsecutiveOne{
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {1,1,0,1,1,1,1,1,1,1,1,0,1,1,1};
        int res = s.maxConsecutiveOne(arr);
        System.out.println(res);
    }

}
