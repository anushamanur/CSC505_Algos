#DO NOT CHANGE ANY CODE IN THIS FILE
#YOU DO NOT HAVE TO SUBMIT THIS FILE. IT IS MEANT FOR TESTING OF YOUR CODE
import unittest
from CoinChange import CoinChange as CC

class TestCases(unittest.TestCase):
	def testcase1(self):
		cc_instance = CC()
		denomination = [1,5,10,25]
		value = 37
		answer = 4
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

	def testcase2(self):
		cc_instance = CC()
		denomination = [1,6,10]
		value = 11
		answer = 2
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

	def testcase3(self):
		cc_instance = CC()
		denomination = [1,6,10]
		value = 13
		answer = 3
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

	def testcase4(self):
		cc_instance = CC()
		denomination = [1,6,10]
		value = 17
		answer = 3
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

	def testcase5(self):
		cc_instance = CC()
		denomination = [1,9,15]
		value = 37
		answer = 5
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

	def testcase6(self):
		cc_instance = CC()
		denomination = [1,9,15]
		value = 54
		answer = 4
		self.assertEqual(cc_instance.NumberofCoins(denomination,value),answer)

if __name__ == '__main__':
    unittest.main()