/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/7 12:09
 */
public class TestArrays_Error {
    public static void main(String[] args) {
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 2;
        index[2] = 3;
        index[3] = 4;
        String [] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
//            y = y + 1;
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
