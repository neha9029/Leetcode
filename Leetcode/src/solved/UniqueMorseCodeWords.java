package solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] encoding = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

		String[] words = {"gin", "zen", "gig", "msg"};


		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i<words.length;i++){
			Function<String,String> f = s-> {              StringBuilder sb = new StringBuilder();                                                                    
														  for(int k = 0; k<s.length();k++ ){
															  	char eachChar = s.charAt(k);

															  	sb.append(encoding[eachChar - 'a']);
														  }
														  return sb.toString(); 


										  };
			set.add(f.apply(words[i]));
		}

		System.out.println(set.size());
	}
}


