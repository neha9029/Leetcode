package solved;

import java.util.Arrays;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		if(strs.length < 1){
			return "";
		}
		if(strs.length < 2){
			return strs[0];
		}
		Arrays.sort(strs);
		String minString = strs[0];



		StringBuilder sb = new StringBuilder();

		int j = 0;
		for(int i = 1; i<strs.length;i++){
			for( j = 0; j<minString.length();j++){
				if(j < strs[i].length()){
					if(minString.charAt(j) == strs[i].charAt(j)){

						if(i == strs.length-1){
							sb.append(minString.charAt(j));
						}
					}
					else{
						break;
					}
				}



			}



		}

		return sb.toString();



	}

}
