/**
 * Dog
 */
class DogT {

    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}


class DogTestDrive {
    public static void main(String[] args) {
        DogT one = new DogT();
        one.size = 70;
        DogT two = new DogT();
        two.size = 8;
        DogT three = new DogT();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }    
}
