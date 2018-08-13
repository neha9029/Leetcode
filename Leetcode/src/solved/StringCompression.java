package solved;

import java.util.HashMap;

public class StringCompression {

	public int compress(char[] chars) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put(chars[0], 1);
		char[] s = new char[chars.length];
		s=chars;
		int j = 0;
		chars[j] = s[0];
		int repeat = 0;
		for(int i = 1; i<s.length;i++){

			if(!map.containsKey(s[i])){
				char prev = s[i-1];

				chars[j++] = s[i-1];

				repeat = map.get(s[i-1]);
				if(repeat > 1){
					for(char f : Integer.toString((int) repeat).toCharArray()){
						chars[j++] = f;
					}
				}
				map.remove((Character) prev);
				map.put(s[i], 1);
			}
			else
			{
				int count = map.get(s[i]);
				count++;
				map.put(s[i], count);
			}
		}


		chars[j++] = s[s.length-1];

		repeat = map.get(s[s.length-1]);
		if(repeat > 1){
			for(char f : Integer.toString((int) repeat).toCharArray()){
				chars[j++] = f;
			}
		}

		return j;
	}
}
