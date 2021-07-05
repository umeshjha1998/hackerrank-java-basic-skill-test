import java.util.*;
import java.util.regex.*;

// Write your code here. DO NOT use an access modifier in your class declaration.

class Parser{
    static Boolean isBalanced(String s) 
    {
        while(s.length()!= (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}","")).length());
        return s.isEmpty();
    }
    
}
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
