package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 11:43
 * @Description 在一组给定的数据中，找出某个数据是否存在
 */
public class Array_GoThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] data = {3,2,5,7,4,6,7,88,11,45};

        int x = in.nextInt();
        int loc = -1;
        for (int i = 0; i < data.length; i++) {
            if (x == data[i]) {
                loc = 1;
                break;
            }
        }
        if (loc > -1) {
            System.out.println("Founded!!");
            System.out.println(x + " is the " + (loc + 1) + " one.");
        } else {
            System.out.println(x + " is not in there.");
        }
    }
}
