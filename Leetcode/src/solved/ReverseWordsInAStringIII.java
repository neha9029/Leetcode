package solved;

public class ReverseWordsInAStringIII {

	public String reverseWords(String s) {

		String words[] = s.split(" ");
		StringBuilder str = new StringBuilder();
		String getReverse ="";
		for(int i = 0; i<words.length; i++){
			getReverse = reverse(words[i]);
			str.append(getReverse);
			if(i < words.length-1){
				str.append(" ");
			}

		}


		return str.toString();

	}

	public String reverse(String s){
		char str[] = new char[s.length()];
		int j = 0;
		for(int i = s.length()-1; i>=0;i--){
			str[j] = s.charAt(i);
			j++;

		}

		return String.valueOf(str);




	}

}
