package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 10:48
 * @Description 计算用户输入的数字的平均数,并输出所有大于平均数的数
 */
public class Array_Intro02 {
    public static void main(String[] args) {
        // 从键盘接收数据
        Scanner in = new Scanner(System.in);
        int x;

        // 定义 int 类型数组
        int[] numbers = new int[100];

        double sum = 0;
        int cnt = 0;
        x = in.nextInt();

        while (x != -1) {
            // 在 numbers[cnt] 的地方存入输入的值
            numbers[cnt] = x;   // 记录所有读入的数字, 对数组中元素赋值

            sum += x;
            cnt++;
            x = in.nextInt();
        }

        // 计算平均数
        if (cnt > 0) {
            double average = sum/cnt;
            for (int i = 0; i < cnt; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(average);
        }



    }

}
