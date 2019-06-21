package book;

public class Test {

	public static void main(String[] args) {
		Book[] books=new Book[5];
		
		Book book1=new Book();
		book1.setName("国学");
		book1.setPrice(40);
		books[0]=book1;

		Book book2=new DiscountBook();
		book2.setName("美学");
		book2.setPrice(80);
		books[1]=book2;
		
		Book book3=new Book();
		book3.setName("体学");
		book3.setPrice(35);
		books[2]=book3;
		
		Book book4=new DiscountBook();
		book4.setName("音学");
		book4.setPrice(50);
		books[3]=book4;
		
		for(Book b : books) {
			if(b instanceof DiscountBook) {
				DiscountBook book=(DiscountBook)b;
				book.setDiscount(0.85);
				 book.getPrice();
				System.out.println("***************************");
				System.out.println(book.getName());
				System.out.println(book.getOriginalPrice());
				System.out.println(book.getPrice());
			}else {
				System.out.println("***************************");
				System.out.println(b.getName());
				System.out.println(b.getPrice());
			}
		}
	}

}
