class gradeAvg{
	public static void main(String[]args){
		int[] grades = {95,85,50,45,75};
		int x =grades[0];
		int count = 0;
		int sum=0;
		for(int i=0; i<grades.length;i++){
			sum+=grades[i];
			if(x<grades[i]){
				x=grades[i];	
			}
			if(grades[i]<65){
				count++;
			}
		}
		System.out.println("First Element: "+ grades[0]);
		System.out.println("Last Element: "+grades[grades.length-1]);
		System.out.println("Average:"+sum/grades.length);
		System.out.println("Highest Grade:"+x);
		System.out.println("Number of Students failing:"+count);
		System.out.println("Number of Elements:"+grades.length);
		

	}
}

