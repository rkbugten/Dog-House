/**
 * 
 */
package randi.java.doghouse;

/**
 * @author R.K. Bugten
 * @version 1.0
 *
 */
public class Dog {
	/*Variables
	 * What the Object KennelDog knows
	 */
	private String name;
	private int size;
	private String breed;
	String myDogs[] = {"Ole","Dole","Doffen"};
	
	/*GETTERS AND SETTERS
	 * Encapsulation are important!!
	 */

	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		size = s;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String b) {
		breed = b;
	}


	/*METHODS
	 * What the dogs can do
	 */
	public void bark() {
		// TODO Auto-generated method stub
		if (size > 60) {
			System.out.println("Woof! Woof!");
		}else if (size < 14) {
			System.out.println("Ruff! Ruff!");
		}else {
			System.out.println("Yip! Yip!");
		}
		
		public void display() {
			for(int i=0; i < myDogs.length; i++) {
				System.out.println("");
			}
		}
	  }
	}

