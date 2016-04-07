import java.util.HashMap;

public class ProjectEuler17{
	public String numberInEnglish(int number){
		
		HashMap<Integer, String> ones = new HashMap<Integer, String>(){{
			put(1, "one");
			put(2, "two");
			put(3, "three");
			put(4, "four");
			put(5, "five");
			put(6, "six");
			put(7, "seven");
			put(8, "eight");
			put(9, "nine");
		}};
		
		HashMap<Integer, String> elevens = new HashMap<Integer, String>(){{
			put(10, "ten");
			put(11, "eleven");
			put(12, "twelve");
			put(13, "thirteen");
			put(14, "fourteen");
			put(15, "fifteen");
			put(16, "sixteen");
			put(17, "seventeen");
			put(18, "eighteen");
			put(19, "nineteen");
		}};
		
		HashMap<Integer, String> tens = new HashMap<Integer, String>(){{
			put(10, "ten");
			put(20, "twenty");
			put(30, "thirty");
			put(40, "forty");
			put(50, "fifty");
			put(60, "sixty");
			put(70, "seventy");
			put(80, "eighty");
			put(90, "ninety");
		}};
		
		if (number == 0){
			return "";
		}
		else if (number < 10){
			return ones.get(number);
		}
		else if (number < 20){
			return elevens.get(number);
		}
		else if (number < 100){
			return tens.get(number);
		}
		else{
			return "hundred";
		}
	}

	public static void main(String args[]){
		ProjectEuler17 call = new ProjectEuler17();
		int number = 1;
		int numberSum = 0;
		while (number < 1000){
			if (number < 20){
				numberSum += call.numberInEnglish(number).length();
			}
			else if (number < 100){
				numberSum += call.numberInEnglish(number - number % 10).length();
				numberSum += call.numberInEnglish(number % 10).length();
			}
			else{
				numberSum += call.numberInEnglish(number/100).length();
				numberSum += call.numberInEnglish(100).length();
				if (number % 100 >= 20){
					numberSum += call.numberInEnglish(number % 100 - number % 10).length();
					numberSum += call.numberInEnglish(number % 10).length();
				}
				else{
					numberSum += call.numberInEnglish(number % 100).length();
				}
				numberSum += 3;
				if (number % 100 == 0){
					numberSum -= 3;
				}
			}
			number += 1;
		}
		numberSum += "onethousand".length();
		System.out.println(numberSum);
	}
}