package lonelyInteger;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'lonelyinteger' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int lonelyinteger(List<Integer> a) {
		Collections.sort(a);
		int lastNumber = a.indexOf(0);
		int lonelyNumber = 0;
		for (int i = 0; i < a.size(); i++) {
			//System.out.println("i:" + i);
			//System.out.println("element:" + a.get(i));
			lonelyNumber = a.get(i);
			if (lastNumber != a.get(i)) {
				if (a.size() > (i+1)) {
					if (a.get(i) != a.get(i + 1)) {
						return a.get(i);
					}
				} else {
					return a.get(i);
				}
				lastNumber = a.get(i);
			}

		}
		return lonelyNumber;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = Result.lonelyinteger(a);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedReader.close();
//        bufferedWriter.close();
	}
}
