package Difference_Between_Primitive_And_Local_Variables;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/9 10:50
 * Knowledge:
 *      - 局部变量在使用前必须初始化
 *      - 局部变量没有默认值！！！！
 */
public class Foo {
    public void go() {
        int x;

        /*
            无法编译，可以生命没有值的x，但若要使用时编译器就会 Error
                    int z = x + 2;
         */
    }
}
