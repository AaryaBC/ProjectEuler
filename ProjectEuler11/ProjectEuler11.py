def main():
	with open("infile.txt") as file:
		data = file.read()
	
	maximum = 0																												#to store the max product
	data = data.split('\n')																									#split the data according to line separation
	numbers = []
	
	for values in data:
		numbers.append(values.split(' '))																					#split the line with respect to space and hence create a 2D list
	
	for i in numbers:																										#to get the maximum horizontal product
		for j in range(0, len(i) - 4):
			product = int(i[j]) * int(i[j+1]) * int(i[j+2]) * int(i[j+3])
			if product > maximum:
				maximum = product
	
	for i in range (0, len(numbers) - 4):																					#to get the maximum vertical product
		for j in range(0, len(numbers[i])):
			product = int(numbers[i][j]) * int(numbers[i+1][0]) * int(numbers[i+2][j]) * int(numbers[i+3][j])
			if product > maximum:
				maximum = product

	for i in range(0, len(numbers) - 4):																					#to get the maximum diagonal(positive direction) product
		for j in range(0, len(numbers[i]) - 4):
			product = int(numbers[i][j]) * int(numbers[i+1][j+1]) * int(numbers[i+2][j+2]) * int(numbers[i+3][j+3])
			if product > maximum:
				maximum = product

	for i in range(0, len(numbers) - 4):																					#to get the maximum diagonal(negative direction) product
		for j in range(len(numbers[i]) - 1, 3, -1):
			product = int(numbers[i][j]) * int(numbers[i+1][j-1]) * int(numbers[i+2][j-2]) * int(numbers[i+3][j-3])
			if product > maximum:
				maximum = product

	return maximum

print(main())