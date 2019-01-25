class fibonacci{
	public static void main(String[] args){
		int term =0;
		System.out.println("Enter term");
		term = Input.readInt(); 
		int f1=1, f2=1,temp = 0;
		for(int i=3;i<=term;i++){
			f1=f2;
			f2=temp;
		}
		
			System.out.println(term);
	}
}