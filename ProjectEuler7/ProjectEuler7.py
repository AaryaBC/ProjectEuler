def isPrime(number):
	for i in range(2, (int(number ** 0.5) + 1)):
		if number % i == 0:
			return False
	return True

def main():
	count = 0
	firstNumber = 1
	while count < 10002:
		if isPrime(firstNumber):
			count += 1
		firstNumber += 1
	firstNumber -= 1
	return firstNumber

print(main())