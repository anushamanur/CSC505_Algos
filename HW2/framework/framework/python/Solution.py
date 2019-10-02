class Solution:
    def __init__(self, input_array):
        self.sorting_array = input_array
        self.comparison_count = 0

    def merge(self, p,q, r):
        n1 = q - p + 1
        n2 = r - q
        L,R = [None]*n1, [None]*n2


        for i in range(n1):
            L[i]= (self.sorting_array[p+i])

        for j in range(n2):
            R[j]=(self.sorting_array[q+j+1])

        L.append(float('inf'))
        R.append(float('inf'))

        i, j = 0, 0

        for k in range(p, r+1):
            if (L[i] < R[j]):
                self.sorting_array[k] = L[i]
                i = i + 1
            else:
                self.sorting_array[k]=R[j]
                j = j + 1
            self.comparison_count+=1

    def merge_sort(self, p,r):
        if p < r:
            q = (p+r)//2

            self.merge_sort(p, q)
            self.merge_sort(q+1, r)
            self.merge(p, q, r)


    def Left(self,i):
        return 2*i +1


    def Right(self, i):
        return 2*i+2

    def Parent (self, i):
        return (i-1)//2

    def max_heapify(self,i, heap_size):

        l = self.Left(i)
        r = self.Right(i)

        if l < heap_size :
        	self.comparison_count+=1
        	if self.sorting_array[l] > self.sorting_array[i] :
        		largest = l
        	else:
        		largest=i

        else:
            largest=i

        if r< heap_size :
        	self.comparison_count+=1
        	if self.sorting_array[r] > self.sorting_array[largest] :
        	   	largest=r

        if largest!=i:
            self.sorting_array[i], self.sorting_array[largest]= self.sorting_array[largest], self.sorting_array[i]
            self.max_heapify(largest, heap_size)

    def build_max_heap(self, heap_size):
        n=len(self.sorting_array)
        for i in range((n//2) -1,-1,-1):
            self.max_heapify(i, heap_size)

    def heap_sort(self):
        heap_size=len(self.sorting_array)
        self.build_max_heap(heap_size)

        for i in range(len(self.sorting_array)-1,0,-1):

            self.sorting_array[0], self.sorting_array[i] = self.sorting_array[i], self.sorting_array[0]
            heap_size-=1
            self.max_heapify(0, heap_size)


    def insertion_sort(self):

    	for i in range(1, len(self.sorting_array)):
            x = self.sorting_array[i]
            j = i-1
            while (j >=0 and self.sorting_array[j] > x):
            		self.comparison_count+=1
            		self.sorting_array[j+1] = self.sorting_array[j]
            		j= j- 1
            if j>=0:
            	self.comparison_count+=1
            self.sorting_array[j+1] = x

         


