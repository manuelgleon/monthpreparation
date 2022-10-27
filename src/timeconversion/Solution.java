package timeconversion;
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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    	StringBuffer militaryTime = new StringBuffer();
    //	System.out.println(s.substring(0, 2));
    	int militaryHour = Integer.parseInt(s.substring(0, 2));
    	String ampm = s.substring(8); 
    	if(ampm.equals("PM")&&militaryHour!=12) {
    		militaryHour = militaryHour+12;
    		if (militaryHour > 23) {
    			militaryHour = 0;
    		}
    	}else if(militaryHour==12&&ampm.equals("AM")) {
    		militaryHour=0;
    		
    	}
    	if(militaryHour<10) {
    		militaryTime.append("0");
    	}
    	militaryTime.append(militaryHour);
    	militaryTime.append(s.substring(2,s.length()-2));
    	return militaryTime.toString();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        System.out.println(result);

   //     bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
  //      bufferedWriter.close();
    }
}