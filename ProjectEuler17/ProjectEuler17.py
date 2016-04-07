"""Created a dictionary to store the string representation of numbers that will be useful in the program"""

def numberInEnglish(number):
	ones = {1:'one', 2:'two', 3:'three', 4:'four', 5:'five', 6:'six', 7:'seven', 8:'eight', 9:'nine'}
	tens = {10:'ten', 20:'twenty', 30:'thirty', 40:'forty', 50:'fifty', 60:'sixty', 70:'seventy', 80:'eighty', 90:'ninety'}
	elevens = {10:'ten', 11:'eleven', 12:'twelve', 13:'thirteen', 14:'fourteen', 15:'fifteen', 16:'sixteen', 17:'seventeen', 18:'eighteen', 19:'nineteen'}
	hundred = {100:'hundred'}
	if number == 0:							#if the given number is 0, just return an empty string because we don't use zero when naming numbers
		return ''
	elif number < 10:						#for numbers less than 10, we can just return the string representation of numbers
		return ones[number]					
	elif number < 20:						#for numbers less than 20, since these are the special cases, we return from the dictionary accordingly
		return elevens[number]				 
	elif number < 100:						#for numbers less than hundred, we return the tens place first, then the ones place
		return tens[number]
	else:
		return hundred[number]				#for hundred, just return hundred and go back to tens and ones place accordingly

def printNumber():
	number = 1								#start the loop with number 1 as given in the question
	numberSum = 0							#to store the value of the sum
	while number < 1001:
		if number < 10:		#for numbers less than 10, we can just use the string representation of number and add the string length to number sum
			numberSum += len(numberInEnglish(number))
			print(numberInEnglish(number))
		elif number < 100:
			if number < 20:	#for numbers less than 20, we have special cases thus we handle it likewise
				numberSum += len(numberInEnglish(number))
				print(numberInEnglish(number))
			else:			#for numbers greater than 20, we first take the tens place and then the ones place
				numberSum += len(numberInEnglish(number - number % 10))	#for the tens place
				numberSum += len(numberInEnglish(number%10))			#for the ones place
				print(numberInEnglish(number - number % 10))
				print(numberInEnglish(number%10))
		elif number < 1000:	#for numbers less than 1000
			numberSum += len(numberInEnglish(number//100))	#for the hundreds place
			numberSum += len(numberInEnglish(100))			#to add that 'hundred'
			if (number % 100 >= 20):	#for numbers in tens place greater than 20, we break it down to tens and ones place and add accordingly
				numberSum += len(numberInEnglish(number%100 - number%10))	#tens place
				numberSum += len(numberInEnglish(number%10))				#ones place
				print(numberInEnglish(number%100 - number%10))
				print(numberInEnglish(number%10))
			else:
				numberSum += len(numberInEnglish(number%100))	#for numbers less than 20, we use the special cases and add them up
				print(numberInEnglish(number%100))
			print(numberInEnglish(number//100))
			print(numberInEnglish(100))
			numberSum += 3										#to add value for 'and' that occurs in every number after 100
			if (number % 100 == 0):
				numberSum -= 3			#to subtract the extra 3 which comes from 'and' in cases of perfect hundreds such as 100, 200 etc
		else:
			numberSum += len("onethousand")	#to add the one thousand value to number sum
		number += 1

	return numberSum

print(printNumber())