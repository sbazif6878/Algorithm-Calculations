class wordCount{
	public static void main(String[] args){
		System.out.println("Enter path");
		String textfile = Input.readFile(Input.readString());
		int count = 0;
		for(int i = 0; i<textfile.length();i++){
			if(textfile.substring(i,i+1).equals(" ")){
				count++;	
			}
		}
		count++;
		System.out.println(count);
	}
}