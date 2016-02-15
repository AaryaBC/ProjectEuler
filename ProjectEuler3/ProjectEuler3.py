def IsPrime(n):
	for i in range(2, int(n**0.5) + 1):
		if n % i == 0:
			return False
	return True

def ProjectEuler3(num):
	largest = 0
	for i in range(2, int(num**0.5) + 1):
		if num % i == 0:
			if IsPrime(i):
				largest = i
			if IsPrime(num / i):
				largest = num / i
	return largest

print(ProjectEuler3(600851475143))