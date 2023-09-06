package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean great = (x < y << z);
		boolean less = (x > y >> z);
		String isOrdered = (great || less) ? "ordered" : "not ordered";
		System.out.print(isOrdered);
	}
}
