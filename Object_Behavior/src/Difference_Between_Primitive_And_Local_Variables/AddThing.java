package Difference_Between_Primitive_And_Local_Variables;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/9 10:48
 * Knowledge:
 *      - 局部变量是生命在方法中的
 */
public class AddThing {
    int a;
    int b = 12;

    public int add() {

//        Local Variables
        int total = a + 5;

        return total;
    }
}
