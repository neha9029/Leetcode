package solved;

import java.util.ArrayList;
import java.util.List;

public class LongPressedName {

	public boolean isLongPressedName(String name, String typed) {

		char first = name.charAt(0);
		ArrayList<Integer> nameList = new ArrayList<Integer>();
		int count = 1;
		for(int i = 1; i<name.length();i++){
			char next = name.charAt(i);
			if(first != next ){
				nameList.add(count);
				first = next;
				count = 1;
			}
			else{
				count++;
			}
		}
		nameList.add(count);

		char firstTyped = name.charAt(0);
		if(name.indexOf(firstTyped) == -1){
			return false;
		}
		ArrayList<Integer> typedList = new ArrayList<Integer>();
		int countTyped = 1;
		for(int i = 1; i<typed.length();i++){
			char nextTyped = typed.charAt(i);
			if(name.indexOf(nextTyped) == -1){
				return false;
			}
			if(firstTyped != nextTyped ){
				typedList.add(countTyped);
				firstTyped = nextTyped;
				countTyped = 1;
			}
			else{
				countTyped++;
			}
		}
		typedList.add(count);


		int len = 0;
		if(typedList.size() != nameList.size()){
			return false;
		}


		for(int i = 0; i<typedList.size();i++){
			if(typedList.get(i) < nameList.get(i)){
				return false;
			}

		}
		return true;
	}


}
