/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/18 9:35
 */
public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
