class string{
	public static void main(String[] args){
		String msg = "This is a sentence?";
		int p = 0;
		while(!(p>=msg.length())){
			System.out.println(msg.substring(p,p+1));
			p++;
		}
	}
}