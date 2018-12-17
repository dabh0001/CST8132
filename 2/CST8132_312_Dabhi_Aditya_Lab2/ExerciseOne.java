public class ExerciseOne {                  	// class ExercsiseOne starts from here
	int[] myArray= new int [10];            // initialization of the 1D array
	public ExerciseOne() {                  // constructor for class ExerciseOne
		int number = 1;                	// initialization of number as a integer and assigning it value as 1 to fill up the 1D array
		for(int x=0; x<10; x++) {  	// for loop to assign the values to the 1D array
			myArray[x]=number; 	// assigning values to 1D array
			number++;           	// incrementing number by 1
		}
	}

	public void printArrayValues() {        	// method printArrayValues starts from here
		System.out.print("myArray = {");    	// printing the 1D array
		for(int x=0;x<10;x++) {
			System.out.print(myArray[x]);
			if(x<9)                         // use of "if" not to print "," after the last element
				System.out.print(",");
		}
		System.out.println("};");
	}

	public void displayArrayProduct() {         	// method displayArrayProduct()
		int total=1;
		for(int product: myArray){              // for loop to multiply each element of the array
			total*=product;                 // multiplying each array of 1D array
		}
		System.out.println("The product of all elements of myArray is " + total + ".");         //printing the product of the 1D array
	}
	
	public static void main(String[] args) {            	//main function
		ExerciseOne test = new ExerciseOne();           // creating object for the class ExerciseOne
		test.printArrayValues();                        // calling method printArrayValues() using the object
		test.displayArrayProduct();                     // calling method displayArrayProduct() using the object
	}                                                   	// end of main

}                                                       	// end of class