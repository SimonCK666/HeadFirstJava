/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/8 9:50
 */
public class Triangle {
    double area;
    float height;
    float length;

    public static void main(String[] args) {
        int x = 0;
        Triangle [] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
//            set the height and length
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
//            set the area and calculus the area
            ta[x].setArea();
//            print out the area
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }

        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 = area = " + t5.area);

    }

    void setArea() {
        area = (height * length) / 2;
    }
}
