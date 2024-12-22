import com.amit.book.inventory.model.Book;
import com.amit.book.inventory.model.Customer;
import com.amit.book.inventory.model.Supplier;
import com.amit.book.inventory.service.BookService;
import com.amit.book.inventory.service.CustomerService;
import com.amit.book.inventory.service.SupplierService;

import java.util.Scanner;

public class BookStoreInventorySystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("Welcome to the Book Store Inventory System");
            System.out.println("Please select option from below list :");
            System.out.println("1. Fill the book information");
            System.out.println("2. Fill customer information");
            System.out.println("3. Fill supplier information");
            System.out.println("0: Exit project");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    BookService bookService = new BookService();
                    Book books = bookService.acceptingBookInfo();

                    System.out.println("Books Information :: " + books);
                    System.out.println("-----------*****************-----------");
                    break;

                case 2:
                    CustomerService customerService = new CustomerService();
                    Customer customer = customerService.acceptingCustomerInfo();

                    System.out.println("Customer Information :: " + customer);
                    System.out.println("-----------*****************-----------");
                    break;

                case 3:
                    SupplierService supplierService = new SupplierService();
                    Supplier supplier = supplierService.acceptingSupplierInformation();

                    System.out.println("Supplier Information :: " + supplier);
                    System.out.println("-----------*****************-----------");
                    break;
            }
        }
            while (option != 0);
            System.out.println("THANK YOU!");
    }
}