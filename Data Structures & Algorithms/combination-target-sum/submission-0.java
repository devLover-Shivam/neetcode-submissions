class Solution {
    private void findCombinations(int ind,int nums[],int target,List<List<Integer>> ans, List<Integer> ds){
        if(ind == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        if(nums[ind]<= target){
            ds.add(nums[ind]);
            findCombinations(ind,nums,target-nums[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1,nums,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinations(0,nums,target,ans,ds);
        return ans;
    }
}
