/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/18 9:17
 */
class Foo {
//    数组需要这样声明
    String [] name = new String[20];
    int age;
}

public class Var_Compare {
    public static void main(String[] args) {
        //    两个 primitive 主数据类型是否相等的判断使用  “ == ”
        int a = 3;
        int b = 3;
        if (a == b) {
            // true
        }

        //        使用 “ == ” 来判别两个引用是否都指向同一对象
        Foo one = new Foo();
        Foo two = new Foo();
        Foo three = one;
        if ( one == two) {
            // false
        }
        if ( one == three) {
            // true
        }
        if ( two == three) {
            // false
        }

    }
}


