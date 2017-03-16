public class rownanie_kwadratowe {
	private
		double a, b, c;
		double result1, result2;
		double delta; 
	public
		rownanie_kwadratowe(double x, double y, double z){
			a = x;
			b = y;
			c = z;
		}
	
		rownanie_kwadratowe(String[] args){
			final int size = 3;
			double tab[] = new double[size];
			if(args.length < size){
				System.out.println("Too few arguments!");
				System.exit(1);
			}
			try{
				for(int i=0; i < size; i++)
					tab[i] = Double.parseDouble(args[i]);
			}catch(NumberFormatException error1){
				System.out.println("Wrong format of arguments");
				System.exit(2);
			}
			a = tab[0];
			b = tab[1]; 
			c = tab[2];
		}
		
		void oblicz(){
			delta = Math.sqrt(b*b - (4*a*c));
						
			if(delta == 0)
				result1 = -b/(2*a);
			else{
				result1 = (-b-delta)/(2*a);
				result2 = (-b+delta)/(2*a);
			}
		}	
		
		void printResults(){
			if(delta < 0)
				System.out.println("No results");
			else if(delta == 0)
				System.out.printf("x = %f\n", result1);
			else
				System.out.printf("x1 = %f \nx2 = %f \n", result1, result2);
		}
		
		public static void main(String []args){
			rownanie_kwadratowe rownanie1 = new rownanie_kwadratowe(args);
			rownanie1.oblicz();
			rownanie1.printResults();
			
			return;
		}

}