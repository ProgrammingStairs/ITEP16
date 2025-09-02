// example showing the concept of composition
import java.util.Scanner;
class Book{
    int pages;
    String bookName;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of pages : ");
        pages = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter bookName : ");
        bookName = sc.nextLine();
    }
}
class Library{
    Book book[];
    Library(Book book[]){
        this.book = book;
    }
    void showData(){
        System.out.println("\nShow books Details\n");
        System.out.println("BookName\t\tPage Number");
        for(Book bk : book){
            System.out.println(bk.bookName+"\t"+bk.pages);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of books : ");
        int num = sc.nextInt();
        Book book[]=new Book[num];
        for(int i=0;i<num;i++){
            book[i] = new Book();
            book[i].getData();
        }
        Library library = new Library(book);
        library.showData();
    }
}