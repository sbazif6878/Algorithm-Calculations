class encrypt{
	public static void main(String[]args){
		String msg="Hypothetically";
		String build="";
		//1b - 
		for(int i=0;i<msg.length();i++){
			int add=i%2;
			build+= (char)(msg.charAt(i)+add);
		}
		//2 - Switching Order
		String build2="";
		String build3="";
		for(int i=0;i<=1;i++){
			int last= (build.length()-1);
			int first= 0;
			while(first<build.length()&& last>=0&& !(first>=last)){
				if(i==0)
					build2+=Character.toString(build.charAt(first))+ build.charAt(last);
				else if(i==1)
					build3+=Character.toString(build2.charAt(last))+ build2.charAt(first);
				first+=1;
				last-=1;
			}
		}
		//3 - Ternary
		int exp =4;
		String build4="";
		for(int i=0;i<build3.length();i++){
			while(exp>=0){
				int ascii=(int)build3.charAt(i);
				int num=1;
				while(num<=5){
					if(ascii/(int)Math.pow(3,exp)==2){
						build4+="I";//2
						ascii=ascii-(int)Math.pow(3,exp)*2;
					}else if(ascii/(int)Math.pow(3,exp)==1){
						build4+="l";//1
						ascii=ascii%(int)Math.pow(3,exp);
					}else if(ascii/(int)Math.pow(3,exp)==0){
						build4+="|";//0
						
					}
					num+=1;
					exp-=1;
				}
				
			}
			exp=4;
		}
		
		
		System.out.println(build);
		System.out.println(build2);
		System.out.println(build3);
		System.out.println(build4);
	}
}