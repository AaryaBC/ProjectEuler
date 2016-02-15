public class ProjectEuler4{
	
	public boolean IsPallindrome(int number){
		String old_number = "", new_number = "";
		old_number = Integer.toString(number);
		new_number = new StringBuilder(old_number).reverse().toString();
		if (old_number.equals(new_number)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args){
		ProjectEuler4 call = new ProjectEuler4();
		int max = 0;
		int combo = 0;
		for (int i = 999; i > 99; i--){
			for (int j = 999; j > 99; j--){
					combo = i * j;
					if (call.IsPallindrome(combo)){
						if (combo > max){
						    max = combo;
						}
					}
			}
		}
		System.out.println(max);
	}
}

