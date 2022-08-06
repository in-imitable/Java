
public class Students {
	int id;
	String name;
	
	//creating a parameterised constructor.

	public Students(int i, String n) {
		id = i;
		name = n;
	}
	
	//method to display the values.

	void display(){
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		//creating objects and passing values
		Students s1 = new Students(123, "Aakash");
		Students s2 = new Students(102, "Rahul");
		
		//calling method to display the values of object.
		s1.display();
		s2.display();

	}

}

