public class Client {
	static public void main(String args[]) {
		Cabinet cab = new Cabinet();
		Board board = new Board();

		Drive d1 = new Drive();
		Drive d2 = new Drive();
		Drive d3 = new Drive();
		Bus bus = new Bus();

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();

		board.setBus(bus);
		board.addComponent(card1);
		board.addComponent(card2);
		board.addComponent(card3);
		
		cab.setBoard(board);
		cab.addComponent(d1);
		cab.addComponent(d2);
		cab.addComponent(d3);

		System.out.println("Total price of computer is: " + cab.computePrice());
	}
}
