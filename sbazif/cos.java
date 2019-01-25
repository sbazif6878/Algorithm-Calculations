class cos{
	public static void main(String[] args){
        double pos=0;
		double neg=0;
		System.out.println("Enter x");
		double x=Input.readDouble()*(3.1415926/180);
		System.out.println("\nActual cosine: "+Math.cos(20));
		double pnum = Math.pow(x,4);
		double nnum = Math.pow(x,2);
		double n = 10;
		for(int i=4;i>=n;i+=4){
			for(int g=i;g>=1;g--){
				i*=g;
			}
			System.out.println(i);
			pos+=(pnum/i);
			
			pnum*=Math.pow(x,4);
			
		}
		for(int r=2;r<=n;r+=4){
			for(int q=r;q>=1;q--){
				r*=q;
			}
			System.out.println(r);
			neg-=(nnum/r);
			nnum*=Math.pow(x,4);
		}
		double cos=pos+neg;
		System.out.println(cos);
		
	}
}