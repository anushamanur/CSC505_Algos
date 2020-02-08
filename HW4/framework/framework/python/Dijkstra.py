#DO NOT CHANGE ANY EXISTING CODE IN THIS FIL
class PriorityQ:
    def __init__(self, dist):
        self.dist_array = dist

  

    def Left(self,i):
        return 2*i +1


    def Right(self, i):
        return 2*i+2

    def Parent (self, i):
        return (i-1)//2

    def extract_min(self, heap_size):


    	min_node=self.dist_array[0]
    	if heap_size==1:
    		del self.dist_array[0]
    		return min_node
    	self.dist_array[0]=self.dist_array[heap_size-1]
    	#heap_size-=1
    	del self.dist_array[-1]
    	self.min_heapify(0,len(self.dist_array))
    	return min_node


    def update_heap(self, ind):
    	if  ind:
	    	pat=self.Parent(ind)
	    	if self.dist_array[pat][1] > self.dist_array[ind][1]:
		    	self.dist_array[ind], self.dist_array[pat]= self.dist_array[pat], self.dist_array[ind]
		    	if pat:
		    		self.update_heap(pat)


    def insert(self, node, val):
    	for i, edge in enumerate(self.dist_array):
    		if edge[0]==node:
    			self.dist_array[i]=(node,val)
    			#print (i)
    			self.update_heap(i)
    			break
    def min_heapify(self,i, heap_size):

        l = self.Left(i)
        r = self.Right(i)

        if l < heap_size and self.dist_array[l][1] < self.dist_array[i][1] :
        	smallest = l
        else:
        	smallest=i

        if r< heap_size :
        	if self.dist_array[r][1] < self.dist_array[smallest][1] :
        	   	smallest=r

        if smallest!=i:
            self.dist_array[i], self.dist_array[smallest]= self.dist_array[smallest], self.dist_array[i]
            self.min_heapify(smallest, heap_size)

    def build_min_heap(self, heap_size):
        n=heap_size
        for i in range((n//2) -1,-1,-1):
            self.min_heapify(i, heap_size)

    def heap_sort(self):
        heap_size=len(self.dist_array)
        self.build_min_heap(heap_size)

        for i in range(len(self.dist_array)-1,0,-1):

            self.dist_array[0], self.dist_array[i] = self.dist_array[i], self.dist_array[0]
            heap_size-=1
            self.min_heapify(0, heap_size)


class Dijkstra:

	def relax(self,u,wt, tup,pq):
		#print (pq.dist_array)
		for t in pq.dist_array:
			if t[0]==tup[0]:
				if (wt+ tup[1])< t[1]:
					val= wt + tup[1]
					pq.insert(tup[0], val)
					self.usp[tup[0]]=self.usp[u]
				elif (wt+ tup[1] == t[1]):
					self.usp[tup[0]]=0

	def Dijkstra_alg(self, n, e, mat, s):

		self.graph = {u:[] for u in range(1, n+1)}
		

		for li in mat:
			self.graph[li[0]].append((li[1], li[2]))
			self.graph[li[1]].append((li[0], li[2]))
		#print(self.graph)


		dist = []
		for vertex in range(1, n+1):
			if vertex==s:
				dist.append((vertex,0))
			else:
				dist.append((vertex,float("inf")))
		
		SP=[s]
		DT=[]
		pq=PriorityQ(dist)
		pq.build_min_heap(len(pq.dist_array))
		#print (pq.dist_array)

		self.usp=[0]*(n+1)
		self.usp[s]=1
		DT=[0]*(n+1)
		while len(pq.dist_array) !=0:
			u,dt = pq.extract_min(len(pq.dist_array))
			#print (pq.dist_array)
			SP.append(u)
			DT[u]=dt
			for tup in self.graph[u]:
				if tup[0] not in SP:
					self.relax(u,dt, tup,pq)
		#print (SP, DT)

		res=[]

		for i in range(1,n+1):
			res.append([DT[i], self.usp[i]])
		return res