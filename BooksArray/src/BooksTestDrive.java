
class Books {
	String title;
	String author;
}

public class BooksTestDrive {

	public static void main(String[] args) {
		
		Books[] myBooks = new Books[3];
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		myBooks[0].title = "Rich Dad Poor Dad";
		myBooks[1].title = "The Signature of All Things";
		myBooks[2].title = "The Monk Who Sold His Ferrari";
		myBooks[0].author = "Robert t. Kiyoaki";
		myBooks[1].author = "Elizabeth Gilbert";
		myBooks[2].author = "RObin Sharma";
		
		int x = 0;
		
		while(x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
		
	}

}
