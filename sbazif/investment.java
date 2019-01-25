class investment{
	public static void main(String[] args){
		double principle,rate,x;
		x=0;
		principle = Input.readDouble();
		rate = Input.readDouble()/100;
		int year = Input.readInt();
		for(int i=1; i<=year; i++){
			x=principle*rate;
			System.out.println("Interest Earn: "+x+"Investment: "+ "Total: " +(x+p));
			principle+=x;
	}
	}
}