package Exercise;

import java.io.IOException;

/*Question 1:

Given a string, reverse each word in it and reverse the entire string. For example, if the given

string is “hope you are doing well”, then the output should be “llew gniod era uoy epoh”.

Assume that all characters in the string are lower case.

Create a method called reverseEverything(String s) where ‘s’ is the input from the user in order

to solve this question.*/

public class ReverseEverything {

	public static void main(String[] args) throws IOException {

		String str = "hope you are doing well"; //“llew gniod era uoy epoh”.
		System.out.println("Original:" + str);

		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed #1:" + sb.reverse().toString());

		

	}

}