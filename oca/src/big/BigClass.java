package big;

 class BigClass {
	 static String let="abc";
	 static String xx= new String("abc");
	
	
	private boolean varInstance1 =false;
	protected String text = "floating";
	
	protected boolean isVarInstancePrivate (){
		return varInstance1;
	}
	
	public void isPublicMethod(){
		System.out.println("isPublicMethod");
	}
	
	public static String letters(String letters) {
		System.out.println(letters);
		
		letters=let;
		 letters += "d";
		 return letters;
		 }
	static Integer inT1=3;
	public static Integer getInt(Integer inT2) {
		System.out.println(inT1);
		System.out.println(inT2);
		
		
		 inT2 +=1;
		 System.out.println(inT2);
		 System.out.println(inT1);
		 return inT1;
		 }
	
		
		
		
		public static void speak2(StringBuilder s) {
			System.out.println(s);
		s.append("Webby");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xx= "dbc";
		System.out.println(xx);
		
		letters(let);
		System.out.println(let);
		
		getInt(inT1);
		System.out.println(inT1);
		
		
		StringBuilder name = new StringBuilder("lala");
		System.out.println(name);
		speak2(name);
		System.out.println(name); // Webby
		
	}

}
