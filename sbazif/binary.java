class binary{
	public static void main(String[]args){
		String build3="abcd";
		int exp =7;
		String build="";
		for(int i=0;i<build3.length();i++){
			while(exp>=0){
				int ascii=(int)build3.charAt(i);
				int num=1;
				while(num<=8){
					if(ascii/(int)Math.pow(2,exp)==1){
						build+="x";//1
						ascii=ascii%(int)Math.pow(2,exp);
					}else if(ascii/(int)Math.pow(2,exp)==0){
						build+="z";//0
						ascii=ascii%(int)Math.pow(2,exp);
					}
					num+=1;
					exp-=1;
				}
				
			}
			exp=7;
		}
		System.out.println(build);
	}
}

