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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	int positiveOccurrences = 0;
    	int negativeOccurrences = 0;
    	int zeroOccurrences = 0;
    	int elements = arr.size();
    	for(int number:arr) {
    		if(number>0) {
    			positiveOccurrences++;
    		}else if( number<0) {
    			negativeOccurrences++;
    		}else {
    			zeroOccurrences++;
    		}
    	}
    	DecimalFormat df = new DecimalFormat("0.000000");
    //	double positiveProportions = (double)Math.round(((double)positiveOccurrences/elements)*1000000d)/1000000d;
    	System.out.println(df.format((double)positiveOccurrences/elements));
   // 	double negativeProportions = (double)Math.round(((double)negativeOccurrences/elements)*1000000d)/1000000d;
    	System.out.println(df.format((double)negativeOccurrences/elements));
    //  double zeroProportions = (double)Math.round(((double)zeroOccurrences/elements)*1000000d)/1000000d;
    	System.out.println(df.format((double)zeroOccurrences/elements));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
