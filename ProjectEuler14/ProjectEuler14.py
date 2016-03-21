def checkEvenOdd(number):
	if number == 1:
		return 0
	elif number % 2 == 0:
		return number // 2
	else:
		return 3 * number + 1

def findSequence():
	count = 1
	number = 2
	needed_number = 0
	maxCount = 0
	while number < 1000000:
		checkingNumber = number
		while checkEvenOdd(checkingNumber) != 1:
			checkingNumber = checkEvenOdd(checkingNumber)
			count += 1
		if count > maxCount:
			needed_number = number
			maxCount = count
		count = 0
		checkingNumber = 0
		number += 1
	return needed_number
print(findSequence())