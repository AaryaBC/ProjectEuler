public class ProjectEuler12{
	
	public int factorCount(long number){
		int factors = 0;
		for (long i = 1; i < (((int)Math.sqrt(number)) + 1); i++){			//we check until the square root of the number because all the factors of any number come within the square root
			if (number % i == 0){											//we add 2 to the factor count because if the number within the square root is a factor, then there has to be another number to multiply by which is also a factor of the number
				factors += 2;												//example, the number 32. Since it's square root is about 5.5, and I know that 2 is a factor of it, then 16 should also be a factor because 32/2 is 16
				if ((number / i) == i){										//some numbers only have one prime factor like 121. So considering those numbers, we have to subtract 1 from the total count of factor
					factors -= 1;
				}
			}
		}
		return factors;
	}

	public static void main(String[] args){
		ProjectEuler12 call = new ProjectEuler12();
		long sum = 0, number = 1;
		int count = 0;
		while (true){
			sum += number;
			count = call.factorCount(sum);
			if (count > 500){
				System.out.println(sum);
				break;														//breaks the loop once the factor count reaches above 500
			}
			number += 1;
		}
	}
}