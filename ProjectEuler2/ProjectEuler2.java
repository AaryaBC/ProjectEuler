public class ProjectEuler2 {
	public static void main(String[] args){
		int sum = 2;
		int first = 1, second = 2;
		int next = first + second;
		while (next < 4000000){
			if (next % 2 == 0){
				sum += next;
			}
			first = second;
			second = next;
			next = first + second;
		}
		System.out.println(sum);
	}
}