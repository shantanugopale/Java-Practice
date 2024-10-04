package ClassPrograms;

import java.io.*;
import java.io.InputStreamReader;

public class Q4BufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two numbers :");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int result = num1 + num2;
		System.out.println(result);
	}

}
