package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 11:24
 */
public class Copy_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] a = {1,2,3,4,5};
//        int [] b = {2,3,4,5,6};
        int [] b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        boolean isEqu = true;

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            if (a[i] != b[i]) {
                isEqu = false;
                break;
            }
        }

        System.out.print(isEqu);
    }
}
