from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        checkingMap ={}
        for i in range (len(nums)):
            n = nums[i]
            dif = target - n
            if dif in checkingMap:
                return [checkingMap[dif],i]
            checkingMap[n] = i

    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        while i < len(nums):
            if nums[i] == val:
                nums.pop(i)  # Don't increment i, because list shifts left
            else:
                i += 1
        print(len(nums))
    