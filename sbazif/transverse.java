class transverse{
	public static void main(String[] args){
		String msg = "Hello";
		char tmp=' ';
		for(int x=0;x<msg.length();x++){
			tmp = (char)((int)msg.charAt(x)+1);
			System.out.println(tmp);
		}
	}
}