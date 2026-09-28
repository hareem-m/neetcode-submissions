from math import prod

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        my_list = []
        product = int(prod(nums))
        for x in range(len(nums)):
            if nums[x] == 0:
                copy = nums.copy();
                copy.remove(0)
                my_list.append(int(prod(copy)))
            else:
                my_list.append(int(product/nums[x]))

        return my_list
        