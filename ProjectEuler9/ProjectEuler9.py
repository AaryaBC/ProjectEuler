def Sum(a, b, c):
	if a + b + c == 1000:
		return True
	return False

def Square(a, b, c):
	if a ** 2 == b ** 2 + c ** 2:
		return True
	return False

"""here, we start the value of a from 997 because that is the max value a can have as we should also account for "b" and "c". Additionally, we run the loop of a till 400 because that is the least value "a" can have. If it goes below 400, "b" or "c" will be more than "a" which can't be true. We do similar things for "b" and "c"."""

def main():
	for a in range(997, 400, -1):
		for b in range(499, 1, -1):
			for c in range(325, 1, -1):
				if Sum(a,b,c) and Square(a,b,c):
					print(a, b, c)
					return a * b * c

print(main())