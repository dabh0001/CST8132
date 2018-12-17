public class ExerciseTwo {                  		// class ExerciseTwo starts from here
	int[][] myArray = new int [8][10];      	//initialization of the 2D array
	public ExerciseTwo(){                   	// constructor for the class ExerciseTwo
		int number = 0;                     	// initialization of number as a integer and assigning it value as 0 to fill up the 2D array
		for(int row= 0; row <8;row++){         	// for loop to go through the rows of myArray
			for(int column = 0; column <10; column++){          	// for loop to go through the columns of myArray
				myArray[row][column]=number;                    // assigning the values to each element of the 2D array
				number=number+1;                                // incrementing the integer number to increase the value by 1
			}                                                   	// end of for loop of the row
		}                                                       	// end of for loop for the column

	}                                                           	// end of the constructor
	public void printArrayValues(){                         	// method printArrayValues starts from here

		System.out.print("myArray = {" +"\n");              	// printing the values of myArray
		for(int row = 0; row<8; row++){
			System.out.print("\t{");
			for (int column = 0; column<10; column ++){
				System.out.print(myArray[row][column]);
				if(column<9)                            // use of "if" not to print "," after the last element in the row
					System.out.print(",");
			}
			System.out.println("},");
		}
		System.out.println("};");
	}

	public double getArrayAverage(int[] a) {                	// method getArrayAaverage with integer "a" as a parameter returning the double

		double sumget=0.0;
		for ( int x: a){                                    	// enhanced for loop to calculate the sum of each row
			sumget += x;

		}    
		return (sumget * 1.0 )/ (a.length);                     // returning the average of each row as a double
	}

	public void displayArraySumOfAverages() {               	// method displayArraySumOfAverages starts from here

		double results=0.0;
		for (int[] a : myArray){                            	// enhanced for loop to go through each row of the myArray
			results += getArrayAverage(a);                  // calculating the returned value from getArrayAverage and adding it to results
		}
		System.out.println("The sum of the average value of each array in myArray is "+ results);           // printing the average value

	}

	public static void main(String[] args){                 // main function
		ExerciseTwo test = new ExerciseTwo();               // creating object for the class ExerciseTwo
		test.printArrayValues();                            // calling method printArrayValues() using the object
		test.displayArraySumOfAverages();                   // calling method displayArraySumOfAverages() using the object
	}                                                       // end of main


}                                                           // end of class
