import java.util.*;

class LeetCode {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        int i = 0;
        int j = i+1;
        int k = nums.length-1;
        while( i< nums.length-2){


            int total = nums[i]+nums[j]+nums[k];
            if(total<0){
                j+=1;
            } else if(total>0){
                k-=1;
            } else{
                List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                set.add(triplet);
                j+=1;
                k-=1;
            }


            if(j>=k){
                i++;
                j = i+1;
                k = nums.length-1;
            }

        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        threeSum(nums);
    }
}