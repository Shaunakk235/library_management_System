class Library
{
  private Book[]books=new Book[3];//Size can be of any number
  private int bookCount=0;

  
  public void addBook(Book book)
  {
    if (bookCount<books.length) {
      books[bookCount++]=book;
      System.out.println("Book added successfully");
    }
    else
    System.out.println("The Library Is Full");
  }
  
  
  
  public void searchBookById(int id)
  {
    for (int i=0;i<bookCount;i++)
    {
      if (books[i].getId()==id) {
        System.out.println(books[i]);
      }
    }
  }


  public void borrowBook(int id)
  {
    for (int i=0;i<bookCount;i++)
    {
      if (books[i].getId()==id) {
        books[i].borrowBook();
        return;
      }
    }
    System.out.println("Book Not Found");
  }


  public void returnBook(int id)
  {
    for (int i=0;i<bookCount;i++)
    {
        if (books[i].getId()==id) {
           books[i].returnBook(); 
           return;
        }
    }
    System.out.println("Book Not Found");
  }


  public void displayBook()
  {
    if (bookCount==0) {
        System.out.println("No Books Found In The Library");
    }
    else
        for (int i=0;i<bookCount;i++)
        {
            System.out.println(books[i]);
        }
    
  }
}
