import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] a=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<=nums.length-1;i++){
            if(a[i]!=nums[i]){
                break;
            }
        }
        int j=0;
        for(j=nums.length-1;j>=0;j--){
            if(nums[j]!=a[j]){
                break;
            }
        }
        if(j-i>=0){
            return j-i+1;
        }
        //要考虑到如果本身有序，i会到最右边，j会到最左边，j-1就是赋值，这时无序长度为0；
        return 0;
    }
}
