class et{
	public static void main(String[] args){
		System.out.println("Enter path");
		String textfile = Input.readFile(Input.readString());
		char letter = ' ';
		int ascii=0;
		String build ="", build2="";
		for (int x=0; x<textfile.length(); x++){
			letter = textfile.charAt(x);
			ascii = (int)letter + 1;
			letter = (char)ascii;
			System.out.println(build+=letter);
		}
		// Start decryption programn  
    
	}
}