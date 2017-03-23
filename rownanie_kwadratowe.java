class Rownanie{
	private	double a, b, c, result1, result2, delta;
	private static final int SIZE = 3;
	
	Rownanie(double x, double y, double z){
		if((a = x) == 0){
			System.out.println("Argument a musn't be 0!");
			System.exit(3);
		}
		b = y;
		c = z;
	}
	
	Rownanie(String[] args){
		double tab[] = new double[SIZE];
		if(args.length < SIZE){
			System.out.println("Too few arguments!");
			System.exit(1);
		}
		try{
			for(int i=0; i < SIZE; i++)
				tab[i] = Double.parseDouble(args[i]);
		}catch(NumberFormatException error1){
			System.out.println("Wrong format of arguments");
			System.exit(2);
		}
		if((a = tab[0]) == 0){
			System.out.println("Argument a musn't be 0!");
			System.exit(3);
		}
		b = tab[1]; 
		c = tab[2];
	}
		
	void oblicz(){
		delta = Math.sqrt(b*b - (4*a*c));
						
		if(Double.isNaN(delta))
			result1 = -b/(2*a);
		else{
			result1 = (-b-delta)/(2*a);
			result2 = (-b+delta)/(2*a);
		}
	}	
		
	void printResults(){
		if(result1 == 0.0D)
			System.out.println("No results");
		else if(result2 != 0.0D)
			System.out.println("x1 = " + result1 + "    x2 = " + result2);
		else
			System.out.println("x = " + result1);
	}		
}

public class rownanie_kwadratowe{
	public static void main(String []args){
		Rownanie rownanie1 = new Rownanie(args);
		rownanie1.oblicz();
		rownanie1.printResults();
		
		return;
	}
}


