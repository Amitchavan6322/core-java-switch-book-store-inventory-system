package inventory;

import com.amit.book.inventory.model.BookInfo;
import com.amit.book.inventory.model.InventoryInfo;
import com.amit.book.inventory.model.StoreInfo;
import com.amit.book.inventory.service.BookService;
import com.amit.book.inventory.service.InventoryService;
import com.amit.book.inventory.service.StoreService;

import java.util.Scanner;

public class BookStoreInventorySystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("Welcome to the Book Store Inventory System");
            System.out.println("Please select option from below list :");
            System.out.println("1. Fill the book information");
            System.out.println("2. Fill the book inventory information");
            System.out.println("3. Fill the book store information");
            System.out.println("0: Exit project");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    BookService bookService = new BookService();
                    BookInfo books = bookService.acceptingBookInfo();

                    System.out.println("Books Information :: " + books);
                    System.out.println("-----------*****************-----------");
                break;


                case 2:
                    InventoryService invService = new InventoryService();
                    InventoryInfo info = invService.acceptingInventory();

                    System.out.println("Book Inventory Information :: " + info);
                    System.out.println("-----------*****************-----------");
                    break;


                case 3:
                    StoreService storeService = new StoreService();
                    StoreInfo store = storeService.acceptingStoreInfo();

                    System.out.println("Store Information :: " + store);
                    System.out.println("-----------*****************-----------");
                    break;
            }
        }
            while (option != 0);
            System.out.println("THANK YOU!");
    }
}