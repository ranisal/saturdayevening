package saturdayEveningClass;

public class Encapsulation {
	/*  wrapping data into single unit is called encapsulation
	 * it uses setter and getter method
	 * both setter and getter method are  created outside main method and obj is created in main method to the methods
	 setter method is public void 
	 getter method is public return type
	 variables created are always private
	 */
 private String name = "sami";
	private int ssn =123456;
	private String username= "sami1234";

//setter method
	
	public void setName (String value) {
		name = value; 
		}
		// getter method = name
		public  String getName(){
			return name;
		}
		
		public void setSSN (int value) {
			ssn = value; 
		
		}
		public  String getUserName(){
			return username;
			}
		
		
		
		
		
		public static void main (String args[]) {
			Encapsulation obj = new Encapsulation ();
			obj.setName ("Sazzad");
			System.out.println(obj.getName());
			obj.setSSN(123456);
			System.out.println(obj.getUserName());
		
}}
