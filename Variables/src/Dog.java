/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/7 11:16
 */
public class Dog {
    String name;
    public static void main(String[] args) {
//        创建Dog对象
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Baet";

//        创建Dog数组
        Dog[] myDogs = new Dog[3];
//        关门放狗
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

//        通过数组引用存取Dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

//        myDogs[2]的名字是
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);
//        逐个对Dog进行bark（）
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
    public void bark() {
        System.out.println(name + " says Ruff! ");
    }
//    one of two Functions
    public void eat() {      }
//    one of two Functions
    public void chaseCat() {      }
}

