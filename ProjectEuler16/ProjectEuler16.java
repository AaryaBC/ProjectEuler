import java.math.BigInteger;

public class ProjectEuler16{

	public int sumOfDigits(BigInteger number){
		String digits = number.toString();
		int sum = 0;
		int check = 0;
		int singleNumber = 0;
		while (check < digits.length()){
			singleNumber = (int)(digits.charAt(check) - '0');
			sum += singleNumber;
			check += 1;
		}
		return sum;
	}

	public static void main(String[] args){
		int sumNumber = 0;
		BigInteger number = new BigInteger("2").pow(1000);
		ProjectEuler16 call = new ProjectEuler16();
		sumNumber = call.sumOfDigits(number);
		System.out.println(sumNumber);
	}
}