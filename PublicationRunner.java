import java.util.Scanner;


public class PublicationRunner {
 public static void main(String[] args) {
         
         Scanner myVar = new Scanner( System.in);
         
         System.out.println("Enter title");
         String title=myVar.next();
         
         System.out.println("Enter price");
         int price=myVar.nextInt();
         
         System.out.println("Enter page count");
         int pagecount=myVar.nextInt();
         
         System.out.println(" Enter time duration");
         
         int time=myVar.nextInt();
         
         Book book=new Book(price,title,pagecount);
         Audio tape=new Audio(price,title,time);
         
          book.display();
          tape.display();
       
     }
}
