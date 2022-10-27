package DiagonalDifference;
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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
		int leftToRigth = 0;
		int rigthToLeft = 0;
		for (int row = 0; row < arr.size(); row++) {
			List<Integer> rowList = arr.get(row);
					leftToRigth = leftToRigth + rowList.get(row);
					rigthToLeft = rigthToLeft + rowList.get(rowList.size() - row - 1);
		}

		return Math.abs(leftToRigth - rigthToLeft);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);
        System.out.println("Result:"+result);

      //  bufferedWriter.write(String.valueOf(result));
     //   bufferedWriter.newLine();

        bufferedReader.close();
     //   bufferedWriter.close();
    }
}
