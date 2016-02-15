public class ProjectEuler3{
    public boolean IsPrime(long number){
        int n = 2;
		while (n < (Math.sqrt(number) + 1)){
			if (number % n == 0){
				return false;
			}
			n += 1;
			}
		return true;
	}
	
	public static void main(String[] args){
	    ProjectEuler3 call = new ProjectEuler3();
		long largest = 0;
		long num = 600851475143L;
		for (int i = 2; i < (Math.sqrt(num)); i++){
			if (num % i == 0){
				if(call.IsPrime(i)){
					largest = i;
				}
				if(call.IsPrime(num/i)){
					largest = num/i;
				}
			}
		}
		System.out.println(largest);
	}
}
