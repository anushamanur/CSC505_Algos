n=17
a=[50,25,10,5,1]
cnt=0
for c in a:
	if n>=c:
		d=n/c
		n=n-d*c
		cnt+=d
		print (c)

print (cnt)






