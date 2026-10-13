class Solution {
    private void func(int nums[],int i,ArrayList<Integer> currSubset,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(currSubset));
            return;
        }
        //pick the current element
        currSubset.add(nums[i]);
        func(nums,i+1,currSubset,ans);
        //remove the last element before backtracking
        currSubset.remove(currSubset.size()-1);
        //skip the duplicate elements, as it will lead to repeated subsets
        int index = i+1;
        while(index<nums.length  && nums[index]==nums[index-1]){
            index++;
        }
        func(nums,index,currSubset,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> currSubset = new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,currSubset,ans);
        return ans;
    }
}
