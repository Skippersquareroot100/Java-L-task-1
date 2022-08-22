public class StoryBook extends Book
{
	
	String category;
	
    StoryBook( )
	{
		System.out.println("It's non parametrize constructor");
		
	}


   StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category)
	{
		 super(isbn,bookTitle,authorName,price,availableQuantity);
		 System.out.println("");
		 System.out.println("valued story book");
		 System.out.println("");
		 this.category=category;
		
	}
	 
	
	
	 void showDetails()
     {
        System.out.println(".......................DETAILS OF STORY BOOK.......................");
        System.out.println("ISBN :"+isbn);
        System.out.println("Book Title:"+bookTitle);
        System.out.println("AuthorName :"+authorName);
        System.out.println("Price:"+price);
        System.out.println("Available Quantity :"+availableQuantity);
        System.out.println("Category :"+category);

     }
	
	
}