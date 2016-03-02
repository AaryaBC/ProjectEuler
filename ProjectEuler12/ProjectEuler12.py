def factorCount(number):
	factor = 0
	for i in range (1, int(number ** 0.5) + 1):				#we check until the square root of the number because all the factors of any number come within the square root
		if number % i == 0:									#we add 2 to the factor count because if the number within the square root is a factor, then there has to be another number to multiply by which is also a factor of the number
			factor += 2										#example, the number 32. Since it's square root is about 5.5, and I know that 2 is a factor of it, then 16 should also be a factor because 32/2 is 16
			if (number / i) == i:							#some numbers only have one prime factor like 121. So considering those numbers, we have to subtract 1 from the total count of factor
				factor -= 1
	return factor

def main():
	number = 1
	sum = 0
	while True:
		sum += number
		count = factorCount(sum)
		if count > 500:										#breaks the loop once the factor count reaches above 500
			return sum
		number += 1

print(main())