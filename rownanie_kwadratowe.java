class Rownanie {
	private	double a, b, c;
	private double results[] = new double [0];
	private static final int SIZE = 3;
	
	/*Rownanie(double x, double y, double z) {
		if((a = x) == 0) {
			System.out.println("Argument a musn't be 0!");
			System.exit(3);
		}
		b = y;
		c = z;
	}*/
	
	Rownanie(String[] arguments) {
		double tab[] = new double[SIZE];
		if(arguments.length != SIZE) {
			System.out.println("Wrong amount of arguments!");
			System.exit(1);
		}
		try {
			for(int i=0; i < SIZE; i++){
				tab[i] = Double.parseDouble(arguments[i]);
			}
		}catch(NumberFormatException error1) {
			System.out.println("Wrong format of arguments");
			System.exit(2);
		}
		a = tab[0];
		if(a == 0) {
			System.out.println("Argument a musn't be 0!");
			System.exit(3);
		}
		b = tab[1]; 
		c = tab[2];
	}
		
	void oblicz() {
		double delta = b * b - (4 * a * c);
		
		if(delta == 0) {
			results = new double[1];
			results[0] = -b / (2 * a);
		}else if (delta > 0) {
			delta = Math.sqrt(delta);
			results = new double[2];
			results[0] = (-b - delta) / (2 * a);
			results[1] = (-b + delta) / (2 * a);
		}
	}	
		
	void printResults() {
		if(results.length == 1) {
			System.out.println("x = " + results[0]);
		}
		else if(results.length == 2) {
			System.out.println("x1 = " + results[0] + "    x2 = " + results[1]);
		}
		else {
			System.out.println("No results");
		}
	}		
}

public class rownanie_kwadratowe {
	public static void main(String []args) {
		Rownanie rownanie1 = new Rownanie(args);
		rownanie1.oblicz();
		rownanie1.printResults();
		
		return;
	}
}


