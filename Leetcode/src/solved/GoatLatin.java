package solved;

public class GoatLatin {
	
    public String toGoatLatin(String S) {
        
        String words[] = S.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder newstr = new StringBuilder();

        for(int i = 0; i<words.length;i++){
            char first = words[i].toLowerCase().charAt(0);
            newstr.append("a");
            System.out.println(newstr);
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                if(i == 0){
                 
                sb.append(words[i].concat("ma")).append(newstr);
                }
                else{
                    sb.append(" ").append(words[i].concat("ma")).append(newstr);
                }
            } 
            else{
                if(i == 0){
                     sb.append(words[i].substring(1,words[i].length())).append(words[i].charAt(0)).append("ma").append(newstr);

                }
                else{
                sb.append(" ").append(words[i].substring(1,words[i].length())).append(words[i].charAt(0)).append("ma").append(newstr);
                }
            }

        }
        
        return sb.toString(); 
        
    }

}
