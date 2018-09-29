package recursion;

public class OutputContestMatches {

    public String findContestMatch(int n) {
        String team[] = new String[n];
            int j = 0;
        for(int i = 1; i<=n;i++){
            team[j] = Integer.toString(i);
            j++;
        }
        
        
         String matches = "";
        int m = 0;
        int count = 0;
        while(n != 1){
            count++;
             m = n/2;
            n = m;
        }
        
        
        
        for(int i = 0; i<count;i++){
          
             matches = teamsPlaying(team);
             team = new String[team.length/2];

            team =matches.split("\\ ,");

        }
        
        matches = matches.replaceAll(" ","");
        return matches;
        
    }
    
    public String teamsPlaying(String [] team){
        
        StringBuilder sb = new StringBuilder();
        
        String matchesPlayed [] = new String[team.length/2];
        int j = 0;
        int left = 0;
        int right = team.length-1;
        while(left < right){
            sb.append('(' + team[left] + ',' + team[right]+ ") ");
            matchesPlayed[j] = sb.toString();
            sb.setLength(0);
            left++;
            right--;
            j++;
        }
        
        for(int i = 0; i<matchesPlayed.length;i++){
            sb.append(matchesPlayed[i]);
            if(i < matchesPlayed.length -1){
              sb.append(",");
            }
        }
        
        return sb.toString();
    }
    
    
    /*
       
        List<String> list1 = new ArrayList<String>();
        for(int i = 1; i<=n;i++){
            list1.add(i+"");
        }
        
        
        while(list1.size() != 1){
            
            List<String> list2 = new ArrayList<String>();
            int i = 0;
            int j = list1.size()-1;
            StringBuilder sb = new StringBuilder();
            while(i < j){
                sb.append('(' + list1.get(i) + ',' + list1.get(j) + ')');
                list2.add(sb.toString());
                i++;
                j--;
                sb.setLength(0);
            }
            
            list1 = list2;
        }
        
        return list1.get(0);
     */
}
