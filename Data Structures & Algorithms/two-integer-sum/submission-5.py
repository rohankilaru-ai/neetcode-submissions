class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        rohan = set()
        for i in range(len(nums)):
            needed = target - nums[i]

            if needed in rohan:
                return [nums.index(needed),i]
            
            rohan.add(nums[i])


        