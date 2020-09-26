/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/7 11:36
 */
class Books {
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        int x = 0;

//        缺少的代码
//        仍然需要 Books() 对象的定义
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "lan";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" By ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}
