
import java.util.Arrays;

// import org.apache.commons.lang3.ArrayUtils;

public class Doggies {

	private Dog[] pups;

	public Doggies(int size) {

		this.pups = new Dog[size];

// point pups at a new arry of Dog

	}

	public void set(int spot, int age, String name) {

		Dog d = new Dog(age, name);

		this.pups[spot] = d;

// put a new Dog in the array at spot

// make sure spot is in bounds

	}

	public String getNameOfOldest() {

		int index = 0;

		for (int i = 0; i < this.pups.length; i++) {

			if (this.pups[index].getAge() < this.pups[i].getAge()) {

				index = i;

			}

		}

		return this.pups[index].getName();

	}

	public String getNameOfYoungest() {

		int index = 0;

		for (int i = 0; i < this.pups.length; i++) {

			if (this.pups[index].getAge() > this.pups[i].getAge()) {

				index = i;

			}

		}

		return this.pups[index].getName();

	}

	public String toString() {

		return "" + Arrays.toString(pups);

	}

}