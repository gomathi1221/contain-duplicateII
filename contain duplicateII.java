class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i],i);
            }
            else{
               if(Math.abs(hash.get(nums[i])-i)<=k){
                   return true;
               }
               else{
                hash.put(nums[i],i);
               }
               
            }
        }
        return false;
    }
}