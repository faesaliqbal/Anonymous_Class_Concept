package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Anonymous classes are a way to extend the existing classes on the fly.
		 */
		
		
		 //When creating the Machine object, we can change the start nethod on the fly.
		 Machine m1 = new Machine(){
			 @Override
			 public void start(){
				 System.out.println("modified start");
			 }
		 };
		 m1.start(); //output would be "modified start"
		 
		 /*
		  * Above start method modification is applicable only to that object.
		  * It is not applicable to the Machine class itself.
		  * If we create another object of machine class, the start method's implementation will be the one defined in the class.
		  */
		 Machine m2 = new Machine();
		 m2.start(); //output will be "starting"

	}

}
