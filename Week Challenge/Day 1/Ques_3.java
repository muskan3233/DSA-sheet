

public class Ques_3 {
    public static String timeConversion(String s) {
        // Write your code here
        String ampm = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        int hour = Integer.parseInt(time.substring(0, 2));    
        
        if (ampm.equals("PM") && hour < 12) {
            int rez = hour+12;
            time = rez + time.substring(2);
        } else if (ampm.equals("AM") && hour == 12){
            time = "00" + time.substring(2);        
        } 
        
        return time;
        
        }
}
