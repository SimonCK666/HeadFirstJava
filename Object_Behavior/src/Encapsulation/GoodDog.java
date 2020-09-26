package Encapsulation;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/9 10:26
 * ps:  Getter: 返回实例变量
 *      Setter: 去用一个参数来设定实例变量的值
 */
class GoodDog {
    private int size;

//    将 Getter 设定为 public
    public int getSize() {
        return size;
    }

//    将 Setter 设定为 public
    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}


class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());

        one.bark();
        two.bark();
    }
}