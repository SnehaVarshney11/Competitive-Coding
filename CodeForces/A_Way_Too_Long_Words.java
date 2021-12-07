package CodeForces;

import java.util.Scanner;

public class A_Way_Too_Long_Words{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String word = in.nextLine();
			if (word.length() > 10)
				sb.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1)).append("\n");
			else
				sb.append(word).append("\n");
		}
		System.out.print(sb.toString());

		in.close();
	}

}