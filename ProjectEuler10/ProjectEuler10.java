public class ProjectEuler10{
	
	public boolean isPrime(long number){
		int squareRoot = (int)Math.pow(number,0.5) + 1;
		for (int i = 2; i < squareRoot; i ++){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		long sum = 0;
		ProjectEuler10 call = new ProjectEuler10();
		for (long i = 2; i < 2000000; i++){
			if (call.isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}