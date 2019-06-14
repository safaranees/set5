x=int(input())
y=[int(i) for i in input().split()]
x=0
for i in range(x):
	for j in range(i):
		if y[j]<y[i]:
			x+=y[j]
print(x)
