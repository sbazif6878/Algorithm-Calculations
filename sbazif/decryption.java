class decryption{
	public static void main(String[]args){
		String msg="lll|||II||l|I|IllllIl|II|llllIl|II|ll|||l|I|lll|llll|IIll||ll|lIlll|ll";
		String build="";
		for(int i=0;i<msg.length();i++){
			char g = msg.charAt(i);
			if(g=='I'){
			build+="2";
			}
			else if(g=='l'){
				build+="1";
			}
			else if(g=='|'){
				build+="0";
			}
		}
		String build1="";
		String build2="";
		String build3="";
		for(int x=0;x<build.length();x+=5){
			String fivel=build.substring(x,x+5);
			int ascii=0;
			int exp=4;
			for(int i=0;i<5;i++){
				ascii+=Character.getNumericValue(fivel.charAt(i))*(int)Math.pow(3,exp);
				exp--;
			}
			build1+=(char)ascii;
		}
		//
		int first=0;
		int last= build1.length()-1;
		for (int i=1;i<build1.length();i+=2){
			build2+=build1.charAt(i);
		}
		for(int i=last;i>=0;i-=2){
			if(i%2!=0&i!=0) i--;
			build2+=build1.charAt(i);
		}
		//
		for(int i=0;i<build2.length();i+=2){
			build3+=build2.charAt(i);
		}
		for (int i=last;i>=0;i-=2){
			if(i%2==0) i--;
			build3+=build2.charAt(i);
		}
		//
		String build4="";
		for(int i=0;i<build3.length();i++){
			int minus=i%2;
			build4+= (char)(build3.charAt(i)-minus);
		}
		
		
		System.out.println(build);
		System.out.println(build1);
		System.out.println(build2);
		System.out.println(build3);
		System.out.println(build4);
	}
}