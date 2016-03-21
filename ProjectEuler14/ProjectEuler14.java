public class ProjectEuler14{
	public long evenOrOdd(long number){
		if (number == 1){
			return 0;
		}
		else if (number % 2 == 0){
			return number / 2;
		}
		else{
			return number * 3 + 1;
		}
	}
	public static void main(String[] args){
		long number = 1;
		ProjectEuler14 call = new ProjectEuler14();
		long neededNumber = 0;
		long checkingNumber;
		int maxCount = 0;
		int count = 0;
		while (number < 1000000){
			checkingNumber = number;
			while (call.evenOrOdd(checkingNumber) != 0){
				count += 1;
				checkingNumber = call.evenOrOdd(checkingNumber);
			}
			if (count > maxCount){
				maxCount = count;
				neededNumber = number;
			}
			number += 1;
			count = 0;
		}
		System.out.println(neededNumber);
	}
}