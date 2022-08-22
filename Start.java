class Start 
{
  public static void main(String [] args)
  {
    StoryBook obj=new StoryBook();
		obj.setIsbn("##jgsjlo");
		obj.setBookTitle("Harry Potter");
		obj.setAuthorName("JK Rowling");
		obj.setPrice(750.65);
		obj.setAvaiableQuantity(7855);
		//obj.setCategory("Story Book");
		StoryBook obj1= new StoryBook("#@nskldn","Tin goyenda","Rokib",100,5000,"Story Book");
		StoryBook obj2= new StoryBook("@jbsck#","Caplar 22b","Jafor Iqbal",450,500,"Story Book");
		StoryBook obj3= new StoryBook("@@fkjas#","Vowtik Rokto pipasha","Mostak Ahmed",750,50,"Story Book");
		StoryBook obj4= new StoryBook("##gordjdf","The Alchemist","Paulo Coelho",100,5000,"Story Book");
		
		
		
	    TextBook obj5=new TextBook();
		obj5.setIsbn("##ohnkdn");
		obj5.setBookTitle("Physics");
		obj5.setAuthorName("Shahjahan");
		obj5.setPrice(550.65);
		obj5.setAvaiableQuantity(8855);
		obj5.setStandard(11);
		TextBook obj6= new  TextBook("##gkdsfgd","Chemestry", "Kabir",645, 500,11);
		TextBook obj7= new  TextBook("#@dsnk","Biology", "Hazari",655, 500,11);
		TextBook obj8= new  TextBook("#@asnl","Math", "Aziz",445, 500,11);
		TextBook obj9= new  TextBook("@@bjsa","English", "Chawdhury",500,5000,8);
		
		
		
		BookShop obj10 = new BookShop();
		obj10.setName("Boi-Pustok");
		
		obj10.insertBook(obj5);
	    obj10.insertBook(obj6);
		obj10.insertBook(obj7);
		obj10.insertBook(obj8);
		obj10.insertBook(obj9);
		
		obj10.insertBook(obj);
		obj10.insertBook(obj1);
		obj10.insertBook(obj2);
		obj10.insertBook(obj3);
		obj10.insertBook(obj4);
		
		obj10.removeBook(obj7);
		
		obj10.removeBook(obj3);
		
		obj10.showAllBooks( );
		
		
		
		Book b = obj10.searchBook(obj4.getIsbn());
		if(b != null)
		{ 
			System.out.println("Found..."); 
			b.showDetails();
		}
		else 
		{ 
		System.out.println("Can Not be Found..."); 
		}


       /* Book b1 = obj10.searchBook(obj3.getIsbn());
        if(b1 != null)
        {
            System.out.println("Found.....");
            b1.showDetails();
        }
        else
        {
           System.out.println("Can Not be Found...");
        }	*/
	
  }
}
