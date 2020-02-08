def coin (n,a):
	if n==0:
		return 0

	c=a[0]
	if n>=c:
		d=n//c
		n=n-d*c
		print ( str(c)*d, sep='\t')
			
	coin(n,a[1:])

coin(19,[50,25,10,5,1])
