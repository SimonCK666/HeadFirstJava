/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/7 11:46
 */
public class Habbits_myEdited {

    String name;

    public static void main(String[] args) {
        Habbits_myEdited[] h = new Habbits_myEdited[3];
        int x = 0;

//        Error
//        while (x < 4) {
//            h[x] = new Habbits();
//            x++;
//        }
        h[0] = new Habbits_myEdited();
        h[1] = new Habbits_myEdited();
        h[2] = new Habbits_myEdited();

        int z = 0;

        while (z < 3) {
            // Error
                // z++;
                // h[z] = new Habbits();
                // z++;
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "fodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z++;
        }
    }
}
