class reduce{
	public static void main(String[] args){
		System.out.println("Enter numerator");
		int numerator = Input.readInt();
		System.out.println("Enter denominator");
		int denominator = Input.readInt();
		int min = Math.min(numerator,denominator);
		while(!(numerator%min==0 && denominator%min==0)){
			min--;
			
		}
		numerator/=min;
		denominator/=min;
		System.out.println("Numerator: "+numerator+"\nDenominator: "+denominator);
	}
}
