public class ProjectEuler6 {

	public long squareOfSum(){
		int sum = 0;
		for (int i = 1; i < 101; i++){
			sum += i;
		}
		return sum * sum;
	}

	public long sumOfSquare(){
		int sum = 0;
		for (int i = 1; i < 101; i++){
			sum += i * i;
		}
		return sum;
	}

	public static void main(String[] args){
		long difference, squareOfSum, sumOfSquare;
		ProjectEuler6 call = new ProjectEuler6();
		squareOfSum = call.squareOfSum();
		sumOfSquare = call.sumOfSquare();
		difference = squareOfSum - sumOfSquare;
		System.out.println(difference);
	}

}