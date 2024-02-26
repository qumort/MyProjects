package observer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        BookStore bs = new BookStore();
        Scanner in = new Scanner(System.in);
        menu();
        int choice = in.nextInt();
        while (choice!=7){
            if(choice==1){
                System.out.print("Enter book title: ");
                String title = in.nextLine();
                title = in.nextLine();
                bs.addBook(title);
            } else if (choice==2) {
                System.out.print("Enter book title: ");
                String title = in.nextLine();
                title = in.nextLine();
                bs.removeBook(title);
            } else if (choice==3) {
                System.out.println("Enter Client name: ");
                String name = in.nextLine();
                name = in.nextLine();
                Observer observer = new Client(name);
                bs.addObserver(observer);
            } else if (choice==4) {
                System.out.println("Enter Client name: ");
                String name = in.nextLine();
                name = in.nextLine();
                Observer observer = new Client(name);
                bs.removeObserver(observer);
            } else if (choice==5) {
                System.out.println(bs.books);
            } else {
                System.out.println("Wrong input, try again: ");
            }
            menu();
            choice = in.nextInt();
        }
    }

    private static void menu() {
        System.out.println("1: Add Book");
        System.out.println("2: Remove Book");
        System.out.println("3: Add Client");
        System.out.println("4: Remove Client");
        System.out.println("5: View all books");
        System.out.println("6: Exit");
    }
}