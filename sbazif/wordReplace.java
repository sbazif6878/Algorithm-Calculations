class wordReplace{
	public static void main(String[] args){
		String msg = "The cat in the hat put his hat on the mat";
		String word="hat";
		String newWord="Cap";
		int pos =0;
		while(!(msg.indexOf(word)==-1)){
			String before = msg.substring(0,pos);
			String after = msg.substring(pos+word.length());
			msg=before+newWord+after;
			pos=msg.indexOf(word);
		}
		System.out.println(msg);
	}
}