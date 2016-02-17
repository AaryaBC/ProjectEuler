def sumOfSquare():
	sumOfSquare = 0
	for i in range(1,101):
		sumOfSquare += (i ** 2)
	return sumOfSquare

def squareOfSum():
	squareOfSum = 0
	for i in range(1,101):
		squareOfSum += i
	squareOfSum = squareOfSum ** 2
	return squareOfSum

def main():
	return squareOfSum() - sumOfSquare()

print(main())