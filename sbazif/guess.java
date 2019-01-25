class guess{
	public static void main(String[] args){
		System.out.println("Enter number");
		int number = Input.readInt();
		int secret = (int)(Math.random()*(100-1+1)+1);
		int tries = 0;
		while(!(number==secret)){
			System.out.println("Wrong");
			tries++;
			if(number<secret){
				System.out.println("Guess higher");
			}
			else{System.out.println("Guess higher");}
			System.out.println("Try again");
			number = Input.readInt();
		}
		System.out.println("You got the answer "+number+" in "+tries+"tries" );
	}
}