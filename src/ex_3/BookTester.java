package ex_3;

public class BookTester {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println("Start properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());
        book.setAuthor("Platina");
        book.setDate(2017);
        book.setName("Eto-ne-lubov");
        System.out.println("New properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());
    }

}