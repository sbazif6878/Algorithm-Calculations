class egg{
	public static void main(String[] args){
		int egg=7;
		while(!(egg%2 == 1  &&egg%3 == 1 && egg%4 == 1 && egg%5 == 1 && egg%6 == 1 && egg%7 == 0)){
			egg+=7;
		}
		System.out.println("Number of Eggs: " + egg);
	}
}
