public interface BookShopOperation
{
    boolean insertBook(Book b) ;
    boolean removeBook(Book b) ; 
    void showAllBooks() ;
    Book searchBook(String isbn);
    
}

