import math
x,y=map(int,input().split())
c=math.gcd(x,y)
print((x*y)//c)
