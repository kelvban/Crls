def twoSum(nums,target):
	for i in range(len(nums)):
		print(type(nums[i]))
		for j in range(i+1,len(nums)):
			if(nums[i]+nums[j]==target):
				return [i,j]
	return [0]
nums=raw_input().split(" ")
print(nums)
nums=map(int,nums)
print(nums)
target=input()
print(target)
result=twoSum(nums,target)
print(type(result))
#for i in range(len(result)):
#	print(result[i])
print(result)				
