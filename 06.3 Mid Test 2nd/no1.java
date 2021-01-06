
public class no1 {
    public static int Pushing(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            min=Math.min(min, nums[i]);
            max=Math.max(max, nums[i]);
            i++;
        }
        sum=sum-max-min;
        sum=sum/(nums.length-2);
        // System.out.println(nums.length);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Pushing(new int[]{18,-1,14,7,11,-2,-4}));
        System.out.println(Pushing(new int[]{12,11,-3,-6,21,2,17}));
        System.out.println(Pushing(new int[]{30,32,16,39,31,38,43}));
    }
}