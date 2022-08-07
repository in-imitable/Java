
public class MovieTestDrive {

	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "Once Upon a Time in Hollywood.";
		one.genre = "Documentary";
		one.rating = 10;
		
		Movie two = new Movie();
		two.title = "Iron Man";
		two.genre = "Sci-Fi";
		two.rating = 8;
		
		Movie three = new Movie();
		three.title = "Crazy Stupid Love";
		three.genre = "Romantic & Comedy";
		three.rating = 7;
		
		two.playIt();

	}

}
