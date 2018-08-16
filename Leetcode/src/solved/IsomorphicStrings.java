package solved;

import java.util.HashMap;

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {


		HashMap<Character, Character> map = new HashMap<Character, Character>();


		StringBuilder sb = new StringBuilder(s);


		for(int i = 0; i<t.length();i++){


			if((map.containsKey(t.charAt(i))) && (sb.charAt(i) != map.get(t.charAt(i)))){

				return false;
			}

			else if((!map.containsKey(t.charAt(i))) && map.containsValue(sb.charAt(i))){
				return false;
			}
			else if(!map.containsValue(sb.charAt(i)) && !map.containsKey(t.charAt(i))){

				map.put(t.charAt(i), sb.charAt(i));
				sb.setCharAt(i, t.charAt(i));

			}


			else if((map.containsKey(t.charAt(i))) && (sb.charAt(i) == map.get(t.charAt(i)))){
				sb.setCharAt(i, t.charAt(i));

			}


		}
		if((sb.toString()).equals(t)){

			return true;
		}



		return true;
	}

}
