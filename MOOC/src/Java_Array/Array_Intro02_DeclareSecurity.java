package Java_Array;

import java.util.Scanner;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/2 11:04
 */
public class Array_Intro02_DeclareSecurity {
    public static void main(String[] args) {
        // 从键盘接收数据
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt;

        // 读入一个cnt
        System.out.print("The number of inputting: ");
        cnt = in.nextInt();

        if (cnt > 0) {
            // 定义 int 类型数组
            int[] numbers = new int[cnt];

            for (int i = 0; i < numbers.length; i++) {
                // 在 numbers[cnt] 的地方存入输入的值
                numbers[i] = in.nextInt();   // 记录所有读入的数字, 对数组中元素赋值
                sum += numbers[i];
            }

            // 计算平均数
            double average = sum/cnt;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(average);

        }





    }
}
