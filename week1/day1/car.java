package week1.day1;



public class car {
	public  void applyBreak() {
		System.out.println("Break is applied ");
		
		

		
	}
public  void applygear() {
	System.out.println("gear is applied");
}
public  void switchonAC() {
	System.out.println("AC is applied" );
	
}
public  void applyAccletre() {
	System.out.println("accletre is applied");
}
public static void main(String[] args) {
	//className objectName = new ClassName();
	car obj=new car();
	//objectname.methodName(related)
	obj.applyBreak();
	obj.applygear();
	obj.switchonAC();
	obj.applyAccletre();
}
}
