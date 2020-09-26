package Encapsulation;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/9 10:37
 * Knowledge:
 *      - 无需初始化实例变量
 *      - Number Primitive (including char): 0   ps: floating points: 0.0
 *      - Boolean Primitive: false
 *      - Object Reference: Null
 */
public class PoorDog {
//    声明实例变量但是不初始化
    private int size;
    private String name;

    public int getSize() {
//        return 0
        return size;
    }

    public String getName() {
//        return null
        return name;
    }
}

class PoorDogTestDrive {
    public static void main(String[] args) {
//        创建 PoorDog 对象
        PoorDog one = new PoorDog();

        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}
