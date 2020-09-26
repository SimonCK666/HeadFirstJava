package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 11:29
 * @Description 输入数量不确定的 [0,9] 范围内的整数，统计每一种数字出现的次数，输入 -1 表示结束
 */
public class Array_Calculus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        int [] numbers = new int[10];

        x = in.nextInt();
        while (x != -1) {
            if (x >= 0 && x <=9) {
                numbers[x] ++;
            }
            x = in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " : " + numbers[i]);
        }
    }
}
