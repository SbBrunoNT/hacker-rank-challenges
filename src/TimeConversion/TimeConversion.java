package TimeConversion;

public class TimeConversion {
    public static String timeConversion(String s) {
        int hrs = 12;
        String[] split = s.split(":");
        String originalAMPM = split[2].substring(2,4);
        String hours = split[0]; String minutes = split[1]; String seconds = split[2].substring(0,2);
        if(originalAMPM.equals("PM")) {
            if(!hours.equals("12"))
                hrs = Integer.parseInt(hours) + 12;
            return hrs + ":" + minutes + ":" + seconds;
        }
        else {
            if(hours.equals("12"))
                hours = "00";
            return hours + ":" + minutes + ":" + seconds;
        }
    }

    public static void main(String[] args) {

    }
}
