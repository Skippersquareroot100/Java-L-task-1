public class BookShop implements BookShopOperation
{

    String name;
    int count;

    Book listOfBooks[ ]=new Book[100];

    BookShop( ) 
    {
    }
    BookShop(String name)
    {
        this.name=name;
    }
   public void setName(String name) 
    {
     this.name=name;
    }
   public String getName( )
    {
        return name;
    }

   public boolean insertBook(Book b) 
    {
     if(listOfBooks.length>count)
        {
            listOfBooks[count]=b;
             count++;
            return true;
        }
             return false;
    }

  public  boolean removeBook(Book b)
    {
        for(int i=0;i<count;i++)
        {
            if(listOfBooks[i]==b)
            {
               listOfBooks[i]=null; 
               return true;
            }
          
        }
          return false;
    }
  public  void showAllBooks( )
    {
        for(int i=0;i<count;i++)
        {
            if(listOfBooks[i]!=null)
            {
                listOfBooks[i].showDetails();
                System.out.println("\n");
            }
        }
    }
  public  Book searchBook(String isbn)
    {
        for(int i=0;i<count;i++)
        {
            if(listOfBooks[i]!=null)
            {
             if(listOfBooks[i].getIsbn().equals(isbn))
                {
                    return listOfBooks[i];
                }
            }
        }
       return null;
    }
}

