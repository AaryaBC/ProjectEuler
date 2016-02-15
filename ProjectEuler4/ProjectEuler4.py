def CheckPallindrome(number):
	if str(number) == str(number)[::-1]:
		return True
	return False

def GiveAnswer():
	max_pallindrome = 0 									#to store the max valued pallindrome
	for i in range(999,100,-1):
		for j in range(999,100,-1):
			if CheckPallindrome(i*j):
				if i*j > m:
					m = i*j
	return max_pallindrome

print(GiveAnswer())