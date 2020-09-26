/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/8 9:45
 */
public class Habbits_Books {
    String name;

    public static void main(String[] args) {
        Habbits_Books [] h = new Habbits_Books[3];

//        Edit Error
        int z = -1;
        while (z < 2) {
            z++;
            h[z] = new Habbits_Books();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
