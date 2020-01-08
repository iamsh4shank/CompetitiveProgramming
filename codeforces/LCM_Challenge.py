num = input()
i = 1
ans = 1
while (i<num):
    if num == 1:
        ans = 1
        break
    if num == 2:
        ans = 2
        break
    if num == 3:
        ans =6
        break
    if num%2 == 0:
        if num%3 == 0:
            ans = (num-1)*(num-2)*(num-3)
        else:
            ans = num*(num-1)*(num-3)
    else:
        ans = num*(num-1)*(num-2)
    i+=1
print ans