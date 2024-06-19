import java.util.Scanner;

class Book
{
    private String title;
    private int id;
    private String author;
    private boolean isBorrowed;

    public Book(String title,int id,boolean isBorrowed,String author)
    {
        this.title=title;
        this.id=id;
        this.author=author;
        isBorrowed= isBorrowed;
    }

    public Book(int id, String title, String author) 
    {
        this.title=title;
         this.id=id;
         this.author=author;
         isBorrowed= false;
    }

    public String getTitle()
    {
      return title;
    }
    public int getId()
    {
        return id;
    }
    public String getAuthor()
    {
        return author;
    }
    public boolean isBorrowed()
    {
        return isBorrowed;
    }
    public void borrowBook()
    {
        if (!isBorrowed) {
            isBorrowed=true;
            System.out.println("Your have borrowed"+" "+title);
        }
        else
        System.out.println("The Book Is Already Borrowed");
    }
    public void returnBook()
    {
        if (isBorrowed) {
            isBorrowed=false;
            System.out.println("You Have Returned The Book: "+title);
        }
        else
        System.out.println("This Book Was Not Borrowed");
    }

    public String toString()
    {
        return "Title:"+" "+title+","+"Id:" +" "+id+","+"Author:"+" "+author;
    }
}
