import java.util.*;
class CountDaysSpentTogether {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(getDays(arriveAlice), getDays(arriveBob));
        int end = Math.min(getDays(leaveAlice), getDays(leaveBob));

        return Math.max(0, end - start + 1);
    }
    public static int getDays(String Date){
        int days[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
        int month = Integer.parseInt(Date.substring(0, 2));
        int day = Integer.parseInt(Date.substring(3, 5));

        return days[month - 1] + day;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        */

        String arriveAlice = sc.next();
        String leaveAlice = sc.next();
        String arriveBob = sc.next();
        String leaveBob = sc.next();

        System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));

        sc.close();
    }
}