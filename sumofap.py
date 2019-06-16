aa,dd, nn = map(int,input().split())
summ = 0
for i in range(1,nn+1):
  summ += (aa+(i-1)*dd)
print(summ)
