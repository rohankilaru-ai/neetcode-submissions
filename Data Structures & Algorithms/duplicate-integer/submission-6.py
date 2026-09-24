class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        rohan = set()
        for i in nums:
            rohan.add(i)
        return len(nums) != len(rohan)

        