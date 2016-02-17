public class ProjectEuler7{
	public boolean isPrime(long number){
		int root = (int)Math.pow(number, 0.5) + 1;
		for (int i = 2; i < root; i++){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		int count = 0;
		long firstNumber = 1;
		ProjectEuler7 call = new ProjectEuler7();
		while (count < 10002){
			if (call.isPrime(firstNumber)){
				count += 1;
			}
			firstNumber += 1;
		}
		firstNumber -= 1;							//since first number value is still incremented by one at the end so remove that extra one
		System.out.println(firstNumber);
	}
}