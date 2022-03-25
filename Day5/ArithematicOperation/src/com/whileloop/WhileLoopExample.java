package com.whileloop;

public class WhileLoopExample {

	private int limit;

	public WhileLoopExample(int range) {
		this.limit = range;

	}

	public void printSquaresUptolimit() {
		int i = 1;
		// it goes up to limit
		while (i * i < limit) {
			// for(int i=1;i<=limit;i++) {
			System.out.print(i * i + " ");

			// }
			i++;
		}
 System.out.println("\n");
	}

	public void printCubeUptoLimit() {
		int j = 1;
		// it goes up to limit
		while (j * j * j < limit) {
			System.out.print(j * j * j + " ");

			j++;
		}
	}

}
