tc = input()
list =[]
for i in range(tc):
    c=0
    a = input()
    while a!=1:
        if a%2!=0 and a%3!=0 and a%5!=0:
            c = -1
            break 
        if a%2==0:
            a = a/2
            c+=1
        if a%3==0:
            a = (2*a)/3
            c+=1
        if a%5==0:
            a = (4*a)/5
            c+=1     
    list.append(c)
for i in range(len(list)):
    print list[i]

