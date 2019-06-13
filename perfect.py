import math
num1,num2=map(int,input().split())
product=num1*num2
root=math.sqrt(product)
if root*root==product:
    print("yes")
else:
    print("no")
