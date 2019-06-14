value11=int(input())
value21=[int(i) for i in input().split()]
result=0
for i in range(value11):
	for j in range(i):
		if value21[j]<value21[i]:
			result+=value21[j]
print(result)
