x=input()
y=[]
for i in x:
    if(i.isdigit())==True:
        y.append(i)
print(*y,sep="")
