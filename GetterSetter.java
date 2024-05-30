public class GetterSetter{
	public static void main(String[] args){
		Student s1 = new Student("Chathuni","20230146");
		System.out.println(s1.getName());
		System.out.println(s1.getID());
		s1.setName("Anjitha");
		s1.setID("20230052");
		System.out.println(s1.getName());
		System.out.println(s1.getID());
		

		Module m1= new Module("SD1","68","67.75");
		System.out.println(m1.getCode());
		System.out.println(m1.getMarksCW());
		System.out.println(m1.getMarksTest());

		System.out.println("Pass module? " + m1.pass());
		
	}

	

	
}