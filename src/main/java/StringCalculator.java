package main.java;

import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    }

	    String delimiter = ",|\n";
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("\n");
	        delimiter = Pattern.quote(numbers.substring(2, delimiterIndex));
	        numbers = numbers.substring(delimiterIndex + 1);
	    }

	    String[] nums = numbers.split(delimiter);
	    int sum = 0;
	    for (String num : nums) {
	        sum += Integer.parseInt(num.trim());
	    }
	    return sum;
	}
}
