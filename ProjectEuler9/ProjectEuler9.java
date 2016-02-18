public class ProjectEuler9{
    
    public boolean sum(int a, int b, int c){							//to check if the sum equals 1000
        if (a + b + c == 1000){
            return true;
        }
        return false;
    }
    
    public boolean square(int a, int b, int c){							//to check if the squares satisfy pythagorean triplet
        if (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
            return true;
        }
        return false;
    }
    
	public static void main(String[] args){
		int a = 997, b = 499, c = 325;									//here, we take a = 997 because that is the max value a can have as b should also have a value and so should c
		ProjectEuler9 call = new ProjectEuler9();								//also, b = 499 because if b is bigger than that, it will be more than a which is not possible and similarly for c
		out:
		for (a = 997; a > 400; a --){									//we run the loop for a till 400 because the value of a can't go below 400, if it does, it will be less than b or c which is false
		    for (b = 499; b > 1; b--){									//similarly for b and c
		        for (c = 325; c > 1; c--){
		            if(call.sum(a,b,c) && call.square(a,b,c)){
		                break out;
		            }
		        }
		    }
		}
		System.out.println(a);											//to print out what the different numbers are
		System.out.println(b);
		System.out.println(c);
		System.out.println(a * b * c);
	}
}