public class TextBook extends Book
{
	int standard;
    TextBook( )
	{
		System.out.println("It's non parametrize constructor");
		System.out.println("\n\n");
	}
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,int standard)
    {
		super(isbn,bookTitle,authorName,price,availableQuantity);
		System.out.println("");
		System.out.println("It's  valued textbook");
		System.out.println("");
		this.standard=standard;
		
		  
	}

	 
	void setStandard(int standard)
	{
		this.standard=standard;
	}
    int getStandard( )	
	{
		return standard;
	}
    	 void showDetails()
     {
        System.out.println(".......................DETAILS OF TEXT BOOK.......................");
        System.out.println("ISBN :"+isbn);
        System.out.println("Book Title:"+bookTitle);
        System.out.println("AuthorName :"+authorName);
        System.out.println("Price:"+price);
        System.out.println("Available Quantity :"+availableQuantity);
        System.out.println("Standard :"+standard);
      
     }
	
	
}