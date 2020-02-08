#DO NOT CHANGE ANY EXISTING CODE IN THIS FILE
class CoinChange:

	def NumberofCoins(self,denomination,value):
		 #Write your code here to find out minimum number of coins required to provide the change for given value.
		 #This method will have a denomination array and an int which specifies the value as inputs(Please see testcase file)
		 #This method should return the number of coins
		DP=[float('inf')]*(value+1)
		
		DP[0] = 0
		for i in range(1,value+1):
		     for d in denomination:
		         if d <= i :
		            temp = DP[i - d] +1
		            if ( temp < DP[i]): # Finding minimum
		                DP[i] = temp

		return DP[value]
		
		 


