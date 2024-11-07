package main.java;

import java.util.ArrayList;
import java.util.List;
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
	    List<String> negativeNumbers = new ArrayList<>();

	    for (String num : nums) {
	        int number = Integer.parseInt(num.trim());
	        if (number < 0) {
	            negativeNumbers.add(num);
	        } else {
	            sum += number;
	        }
	    }

	    if (!negativeNumbers.isEmpty()) {
	        throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(", ", negativeNumbers));
	    }

	    return sum;
	}
}
