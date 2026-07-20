public class P1_Book {

        String title;
        String author;

        void display() {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
    }

public static void main(String[] args){

            P1_Book b1 = new P1_Book();
            b1.title = "November 9";
            b1.author = "Collen Hoover";

            P1_Book b2 = new P1_Book();
            b2.title = "And then there were none";
            b2.author = "Agatha Christie";

            b1.display();
            b2.display();

    }

}
