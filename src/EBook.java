import java.util.Scanner;

public class EBook extends Library{

    public void adminOption(Scanner scanner){

        l:while(true){
            System.out.print("1)Search\n2)Add\n3)Remove\n4)Borrow\n5)Download\n6)Exit\nEnter your choice: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    search(scanner);
                    break;
                case 2:
                    add(scanner);
                    break;
                case 3:
                    remove(scanner);
                    break;
                case 4:
                    borrow(scanner);
                case 5:
                    download(scanner);
                    break;
                case 6:
                    break l;
            }
        }
    }
    public void download(Scanner scanner){

        System.out.println("Enter book name to download: ");
        String booknamed=scanner.nextLine();
        if(libraryHashMap.containsKey(booknamed)){
            System.out.println("Book Downloaded Successfully...");
            return;
        }
        System.out.println("No Book Found...");
    }
}

