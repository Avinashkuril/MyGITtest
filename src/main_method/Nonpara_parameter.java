package main_method;

public class Nonpara_parameter {
	
	public void nonpara() {
		String Name="Avinash";
		int rollno=17;
		char grade='A';
		float percentage=80.28f;
		System.out.println("Students name is "+Name);
		System.out.println("Stuents roll no. is "+rollno);
		System.out.println("Students grade is "+grade);
		System.out.println("Students percentage is "+percentage);
	}
	
	public static void main(String[] args) {
		Nonpara_parameter nonpara= new Nonpara_parameter();
		nonpara. nonpara();
		nonpara.para("AK", 10, 'B', 72.85f);
		nonpara.para("am", 89, 'F', 56.43f);
		
	}
	public void para(String Name, int rollno, char grade, float percentage) {
		System.out.println("==============");
		System.out.println("Students name is "+Name);
		System.out.println("Students roll no. is "+rollno);
		System.out.println("Students grade is "+grade);
		System.out.println("Students percentage is "+percentage);
		System.out.println("==============");
	}
}
