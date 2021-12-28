class Facto{
	static void printFactorial(){
		int fact=1;	
			for (int number=1; number<=5; number=number+1){
			fact=fact*number;
			
			}
				System.out.println(fact);
		
		
	}
	
	static void printFactorialSeries(){
		long facto=1; 
		long n=50;
			for(int number=1; number<n;number++){
				facto=facto*number;
					System.out.println(facto);
				
			}
			
		
	}
	
	static void printLeapYear(){
	int year=1964;
		if(year%4==0){
			System.out.println("Its a leap year");
		}
		else if(year%100==0){
			System.out.println("It is a leap year");
		}
		else if(year%400==0){
			System.out.println("This is a leap year");
		}
		else{
			System.out.println("Entered year is not a leap year");
		}
	}
	static void printFibonocci (){
		int first=0,second=1,third=2;
		long number=100;
			for(int i=1;i<number;i++){
				first=second;
				second=third;
				third=first+second;
					System.out.println(first);
					
			}
	}
	
	public static void main(String[]args){
		printFactorial();
			System.out.println();
		printFactorialSeries();
			System.out.println();
		printLeapYear();
			System.out.println();
		printFibonocci();
	
	} 
}