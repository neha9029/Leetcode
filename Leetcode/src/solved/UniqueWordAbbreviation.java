package solved;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueWordAbbreviation {

	HashMap<String, Integer> set = new HashMap<String, Integer>();
	HashSet<String> wordSet = new HashSet<String>();
	public UniqueWordAbbreviation(String[] dictionary) {
		StringBuilder sb = new StringBuilder();
		for(String s : dictionary){
			if(s.length() > 2){
				int len = s.length();
				int middle = s.length() -2;
				sb.append(s.charAt(0)).append(middle).append(s.charAt(len-1));
				if(!set.containsKey(sb.toString())){
					set.put(sb.toString(), 1);

				}
				else{
					int count = set.get(sb.toString());
					count++;
					set.put(sb.toString(), count);
				}
				wordSet.add(s);
				sb.setLength(0);
			}


		}
	}

	public boolean isUnique(String word) {
		StringBuilder sb = new StringBuilder();
		if(word.length() < 1){
			return true;
		}
		int len = word.length();
		int middle = word.length() -2;
		sb.append(word.charAt(0)).append(middle).append(word.charAt(len-1));



		if(!set.containsKey(sb.toString())){
			sb.setLength(0);

			return true;
		}
		else{
			if(set.get(sb.toString()) < 2 && wordSet.contains(word) ){
				sb.setLength(0);
				return true;
			}
			else{
				sb.setLength(0);

				return false;

			}



		}
	}






}


/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */

