package solved;

public class StudentAttendanceRecordI {
	
	
	
	   public static boolean checkRecord(String s) {
	        
	       	        
	        int absent = 0;
	        int late = 0;
	        for(int i = 0; i< s.length()-2;i++){
	            if(s.charAt(i) == 'A'){
	                absent++;
	            }
	            if(s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L'){
	                late++;
	            }
	          
	        }
	        
	        if(s.charAt(s.length()-2)== 'A'){
	            absent++;
	        }
	        if(s.charAt(s.length()-1)== 'A'){
	            absent++;
	        }
	        
	        if(absent > 1 || late > 0){
	            return false;
	        }
	        
	        return true;
	    }

}
