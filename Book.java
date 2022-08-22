public abstract class Book implements BookOperation
{
     String isbn;
     String bookTitle;
     double price;
     int availableQuantity;
     String authorName;
	 
	 Book()
	 {
	  System.out.println("It's non parametrize constructor"); 
	 }
	 Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
	 {
		this.isbn=isbn;
	    this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
	 }
	 
	public  void setIsbn(String isbn)
	 {
		 this.isbn=isbn;
	 }
    public  void setBookTitle(String bookTitle)
    {
		 this.bookTitle=bookTitle;
	 }
    public  void setAuthorName(String authorName)
    {
		 this.authorName=authorName;
	 }
 	 public   void setPrice(double price)
    {
		 this.price=price;
	 }
   public  void setAvaiableQuantity(int availableQuantity)
    {
		 this.availableQuantity=availableQuantity;
    }
    String getIsbn( )
    {
	return isbn;
    }
    String getBookTitle( )
    {
	return bookTitle;
    }
    String getAuthorName( )
    {
	 return authorName;
    }
    double getPrice( )
    {
	return price;
    }
    int getAvailableQuantity( )
    {
	return availableQuantity;
    }

	public void addQuantity(int amount)
   {
	if(amount>0)
	{
	 availableQuantity=availableQuantity+amount;
	}
	else
	{
		System.out.println("Entered wrong amount");
	}	
   }
    public void sellQuantity(int amount)
    {
	 if(availableQuantity>=amount)
	 {
	   availableQuantity=availableQuantity-amount;
	 }
	 else
	 {
		System.out.println("Entered wrong amount");
	 }
    }  

       abstract void showDetails();
}

	
