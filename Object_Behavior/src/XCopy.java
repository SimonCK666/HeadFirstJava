/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/18 9:33
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
