public class librarymanagement
{
    public static void main(String[] args) {
        Library Library=new Library();
        Scanner Scanner=new Scanner(System.in);
        

        int choice;
        while (true) {
            
        
        System.err.println("WELCOME TO THE LIBRARY MANAGER");
        
        System.out.println("1. Add a book");
        System.out.println("2. Search a book by book Id");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println("5. Display all Available Books");
        System.out.println("6. Exit The Menu");
        System.err.println("Pls select the action you want to perform");
        choice=Scanner.nextInt();
        Scanner.nextLine();
        
        switch (choice) 
        {
         case 1:
         System.out.println("Enter Book ID: ");
         int id= Scanner.nextInt();
         Scanner.nextLine();

         System.out.println("Enter Title Of The Book:");
         String title=Scanner.nextLine();

         System.out.println("Enter Name Of The author: ");
         String author=Scanner.nextLine();

         Library.addBook(new Book(id,title,author));
         break;
        

        case 2:
        System.out.println("Enter Book Id");
        id=Scanner.nextInt();
        Library.searchBookById(id);
        break;

        case 3:
        System.out.println("Enter Book Id");
        id= Scanner.nextInt();
        Library.borrowBook(id);
        break;

        case 4:
        System.out.println("Enter Book Id");
        id=Scanner.nextInt();
        Library.returnBook(id);
        break;
        
        case 5:
        Library.displayBook();
        break;

        case 6:
        System.out.println("Exiting.....");
        break;

        default:
        System.out.println("Enter A Valid Option");
    }
   }
}
}
