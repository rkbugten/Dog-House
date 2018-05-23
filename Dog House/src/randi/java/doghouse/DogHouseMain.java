package randi.java.doghouse;
/**
 * 
 * @author R.K.Bugten
 * @version 1.0
 * 
 *
 */

public class DogHouseMain {

		public static void main(String[]args) {
			/*
			 * Creating three objects: 
			 */
			Dog fabian = new Dog();
			fabian.setSize(40);
			Dog hercules = new Dog();
			hercules.setSize(70);
			Dog lucy = new Dog();
			lucy.setSize(8);
//			
//			/*Making a dog array*/
//			Dog[] myDogs = new Dog[3];
//			//putting some dogs into it
//			myDogs[0] = new Dog();
//			myDogs[1] = new Dog();
//			myDogs[2] = new Dog();
//			
//			// What is the name of dog 2?
//			System.out.print("Last dogs name is: ");
//			System.out.println(myDogs[2].getName());
//			
//			//looping through the array telling
//			// all the dogs to bark
//			int x = 0;
//			while(x < myDogs.length) {
//				myDogs[x].bark();
//				x = x+1;
//			}
			
			System.out.println("Fabian: " + fabian.getSize());
			System.out.println("Lucy: " + lucy.getSize());
			System.out.println("Hercules: " + hercules.getSize());
			fabian.bark();
			hercules.bark();
			lucy.bark();
		}
	}

			