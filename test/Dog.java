public class Dog {
    String name;
    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDog = new Dog[3];

        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = dog1;
        
        myDog[0].name = "Fred";
        myDog[1].name = "Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDog[2].name);

        int x = 0;
        while (x < myDog.length) {
            myDog[x].bark();
            x += 1;
        }

    }

    
}

