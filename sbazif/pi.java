class pi{
	public static void main(String[] args){
		double pos=0;
		double neg=0;
		System.out.println("Enter terms");
		int terms = Input.readInt();
		for(int i=1; i<=terms; i+=4){
			pos+=(4.0/i);
		}
		for(int x=3; x<=terms; x+=4){
			neg-=(4.0/x);
		}
		double pi=pos+neg;
		System.out.println(pi);
	}
}
