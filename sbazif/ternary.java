class ternary{
	public static void main(String[]args){
		int exp =4;
		String build="ABCD";
		String build1 = "";
		for(int i=0;i<build.length();i++){
			while(exp>=0){
				int ascii=(int)build.charAt(i);
				int num=1;
				while(num<=5){
					if(ascii/(int)Math.pow(3,exp)==2){
						build1+="2";
						ascii=ascii-(int)Math.pow(3,exp)*2;
					}
					else if(ascii/(int)Math.pow(3,exp)==1){
						build1+="1";
						ascii=ascii%(int)Math.pow(3,exp);
					}
					else if(ascii/(int)Math.pow(3,exp)==0){
						build1+="0";
					}
					num+=1;
					exp-=1;
				}	
			}
			exp=4;
		}
		System.out.println(build1);
	}
}
