package llab2;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author c1 = new Author("Grigoriy Popov","grig@email.com",'M');
        Author c2 = new Author("Kirill Mrak","kir333@email.com",'M');
        Author c3 = new Author("Eva Kim","29evalog38@email.com",'F');
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
