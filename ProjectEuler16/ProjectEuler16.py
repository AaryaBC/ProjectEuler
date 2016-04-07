def sumOfDigits(number):
	s = 0
	while number > 0:
		s += number % 10
		number = number // 10
	return s

def main():
	number = 2 ** 1000
	sumNumber = sumOfDigits(number)
	return sumNumber

print(main())