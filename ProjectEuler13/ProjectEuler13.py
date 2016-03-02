def main():
	with open("infile.txt") as file:
		numbers = file.read()
	numbers = numbers.split('\n')
	
	sumOfAll = 0
	for number in numbers:
		sumOfAll += long(number)
	sumOfAll = str(sumOfAll)			#converted number to string, then sliced the string to get the first 10 digits
	return sumOfAll[0:10]

print(main())