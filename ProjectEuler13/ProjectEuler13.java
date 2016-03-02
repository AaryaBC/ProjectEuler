import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class ProjectEuler13{
	
	public BigInteger[] numberList() throws IOException{
		BigInteger[] list = new BigInteger[100];
		int i = 0;
		Scanner scanner = new Scanner(new File("infile.txt"));
		while (scanner.hasNextBigInteger()){
			list[i] = scanner.nextBigInteger();
			i += 1;
		}
		return list;
	}

	public static void main(String[] args) throws IOException{
		String sumString;
		BigInteger numbers[];
		ProjectEuler13 call = new ProjectEuler13();
		numbers = call.numberList();
		BigInteger sum = numbers[0];
		System.out.println(numbers[0]);
		for (int i = 1; i < 100; i++){
			sum = sum.add(numbers[i]);
		}
		sumString = String.valueOf(sum);
		System.out.println(sumString.substring(0,10));
	}
}