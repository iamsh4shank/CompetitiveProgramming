s = raw_input()
mssg = "hello"
count = 0
for i in range(0,len(s)):
    if count==5:
        break
    if s[i]== mssg[count]:
        count+=1

if count<5:
    print 'NO'
else:
    print 'YES'
