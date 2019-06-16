i11=int(input())
j1=list(map(int,input().split()))
k1=j1[:]
k1.sort()
for v in range(0,len(j1)):
  if(j1[v]!=k1[v]):
    print(v)
    break
