
public class WeekThreeNotes {

	public static void main(String[] args) {
		
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println("First Print:");
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		//Arrays group data together
		//Syntax: first word (variable declaration) "declares" your data type, brackets define the data as an array, 3rd word is the title,
		// 		the = is the assigning operator, "new", same verbage as the variable declaration, then the number of elements that will 
		//      exist in the array
		
		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println("Second Print:");
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		//Now it is possible to loop through the array or act on as if it's an object
		
		System.out.println("Third Print:");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		//enhanced for loop 
		System.out.println("Fourth Print:");
		for (String student : students) {
			//read as for each student in the array, students...
			System.out.println(student);
		}
		
		
		String[] products = new String[5];
		
		products[0] = "carrots";
		products[1] = "pineapples";
		products[2] = "tomatoes";
		products[3] = "potatoes";
		products[4] = "cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);	
		}
		
		int[] multiplesOf3 = new int[10];
		//rather than writing out each individual value, we can use a loop to create it for us
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("Multiple: " + multiplesOf3[i - 1]);
		}
		
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf3.length; i++) {
			multiplesOf5[i]= (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}

	}
}
