import java.util.HashMap;
import java.util.Scanner;

public class Library {

    public HashMap<String,Book> libraryHashMap= new HashMap<>();

    public void search(Scanner scanner){

        System.out.println("Enter book name to search: ");
        String bookToSearch=scanner.nextLine();
        if(libraryHashMap.containsKey(bookToSearch)){
            Book cur=libraryHashMap.get(bookToSearch);
            System.out.println(cur.toString());
        }
        else{
            System.out.println("No Books Found...");
        }
    }

    public void search(Scanner scanner,long isbm){

        System.out.println("Enter Isbm number to search: ");
        long num=Long.parseLong(scanner.nextLine());
        for(String book:libraryHashMap.keySet()){
            Book cur=libraryHashMap.get(book);
            if(cur.getIsbm()==num){
                System.out.println(cur);
                return;
            }
        }
        System.out.println("Isbm Not Found...");
    }

    public void add(Scanner scanner){

        System.out.println("Enter book name to add: ");
        String booktoAdd=scanner.nextLine();
        if(!libraryHashMap.containsKey(booktoAdd)){
            System.out.println("Author: ");
            String author=scanner.nextLine();
            System.out.println("ISBM: ");
            long isbm=Long.parseLong(scanner.nextLine());
            System.out.println("Rate: ");
            int rate=Integer.parseInt(scanner.nextLine());
            System.out.println("Availability: ");
            String availability=scanner.nextLine();
            Book newobj=new Book(booktoAdd,author,isbm,rate,availability);
            libraryHashMap.put(booktoAdd,newobj);
            System.out.println("Book Added Successfully,,,");

            for(String bok:libraryHashMap.keySet()){
                System.out.println(bok);
            }
            return;
        }
        System.out.println("Book Already exists...");
    }

    public void remove(Scanner scanner){

        System.out.println("Enter book name to remove: ");
        String bookToRemove=scanner.nextLine();
        if(libraryHashMap.containsKey(bookToRemove)){
            Book cur=libraryHashMap.get(bookToRemove);
            libraryHashMap.remove(bookToRemove,cur);
            System.out.println("Book Removed Successfully...");
            return;
        }
        System.out.println("No Book Found...");
    }
    public void borrow(Scanner scanner){

        System.out.print("Enter book name to borrow: ");
        String bookToBorrow=scanner.nextLine();
        if(libraryHashMap.containsKey(bookToBorrow)){
            Book book=libraryHashMap.get(bookToBorrow);
            if(book.getAvailability().equals("Yes")){
                System.out.println("Book Borrowed Successfully...");
                book.setAvailability("No");
                return;
            }
            System.out.println("Book Not Available...");
            return;
        }
        System.out.println("No Book Found...");
    }
}
