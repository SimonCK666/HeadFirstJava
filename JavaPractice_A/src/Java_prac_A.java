import java.util.Random;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/8/7 15:17
 * @Description
 */
public class Java_prac_A {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(randMonth());
//        System.out.println(sub(100));
//        System.out.println(judge(3));
//        division(5);
//        print99();
//        System.out.println(sigma());
//        rand88();
//        printNo3();
//        printSolidANDHollowSquare();
        printSolidANDHollowDiamond();
    }

    /* 递归算阶乘 */
    public static int factorial(int x) {
        if (x < 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }


    /* 根据随机生成的的月份，打出该月份的天数.（不考虑闰年、闰月）*/
    public static String randMonth() {
        int dayCount = 31;
        Random rndMonth = new Random();
//        System.out.println("random number: " + rndMonth);

        int month = rndMonth.nextInt(12) + 1;
//        System.out.println("random number real: " + month);

        // 选择只有 30 天的月份
        int[] shortMonth = {2, 4, 6, 6, 11};

        for (int i : shortMonth) {
            if (month == i) {
                dayCount = 30;
                break;
            }
        }

        return month + " has " + dayCount + " days.";
    }

    /* 用 while 和 for 循环分别计算 100 以内奇数和偶数的和，并输出。*/
    public static String sub(int x) {
//        奇数和
        int subOdd = 0;
//        偶数和
        int subEven = 0;

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                subEven += i;
            } else {
                subOdd += i;
            }
        }

        return x + " 以内偶数和为:" + subEven + ";  奇数和为:" + subOdd;
    }

    /* 判断奇偶数 */
    public static boolean judge(int x) {
//        偶数 true 奇数 false
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }

//        Simplified if
//        return x % 2 == 0;
    }

    /* 用 while 和 for 循环输出 1-1000 之间能被 5 整除的数，且每行输出 3 个。*/
    public static void division(int x) {
//        count
        int j = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % x == 0) {
                j++;
                System.out.print(i + " ");
//                每行输出三个
                if (j == 3) {
                    j = 0;
                    System.out.println();
                }
            }
        }

        System.out.println();
    }


    /* 打印出九九乘法表 */
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " * " + j + " = " + (i * j) + "  ");
            }
            System.out.println();
        }
    }

    /* 编程求：∑1+∑2+……+∑100 */
    public static int sigma() {
        int count = 0;
        for (int i = 100; i > 0; i--) {
            count = count + add(i);
        }

        return count;
    }
    public static int add(int x) {
        int count = 0;
        for (int i = x; i > 0; i--) {
            count += i;
        }

        return count;
    }

    /* 生成 0-100 随机数，直到生成 88 为止，停止循环！*/
    public static void rand88() {
//        count
        int j = 0;
        Random rand = new Random();
        int s = rand.nextInt(100);

        while (s != 88) {
            j++;
            System.out.print(s + " ");

//            每行输出10个数字
            if (j % 10 == 0) {
                System.out.println();
            }

            s = rand.nextInt(100);
        }

        System.out.println(s);
        System.out.println("总共随机次数： " + j);
    }

    /* 把 100~150 之间不能被 3 整除的数输出 */
    public static void printNo3() {
        int j = 0;
        for (int i = 100; i <= 150; i++) {
            if (i % 3 != 0) {
                j++;
                System.out.print(i + " ");
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }


    /* 打印出实心 10*10 正方形、空心 10*10 正方形 */
    public static void printSolidANDHollowSquare() {
//        print Solid Square
        System.out.println("Print Solid Square:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Cut Line
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

//        print Hollow Square
        System.out.println("print Hollow Square: ");
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }


    /* 打印出实习 9*9 菱形， 空心 9*9 菱形 */
    public static void printSolidANDHollowDiamond() {
        int n = 9;
//        Solid
        System.out.println("Solid Diamond: ");
//        上部分
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < (n - (2 * i +1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - (2 * i + 1)) / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
//        中部
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
//        下部
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - (i + 1) * 2); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
//        空心


    }
}


