xx=int(input())
yy=list(map(int,input().split()))
zz=[]
for x in range(xx):
    for i in range(x+1,len(yy)):
        if(yy[i]==yy[x]):
          zz.append(yy[x])
if (len(zz)==0):
    print("unique")
else:
    zz.sort()
    li2=set(zz)
    for x in li2:
        print(x,end=" ")
