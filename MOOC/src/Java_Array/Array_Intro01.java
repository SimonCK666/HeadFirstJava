package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 10:40
 * @Description 计算用户输入的数字的平均数
 */
public class Array_Intro01 {
    public static void main(String[] args) {
        // 从键盘接收数据
        Scanner in = new Scanner(System.in);
        int x;
        double sum = 0;
        int cnt = 0;
        x = in.nextInt();

        // 不需要记录输入的每一个数字
        while (x != -1) {
            sum += x;
            cnt++;
            x = in.nextInt();
        }

        // 计算平均数
        if (cnt > 0) {
            System.out.println(sum/cnt);
        }
    }
}
