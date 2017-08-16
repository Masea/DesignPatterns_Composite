import java.util.*;

public class Board extends Component {

	private Bus bus;
	private Vector cardlist = new Vector();

	@Override
	public double netPrice() {
		return 26.00;
	}

	@Override
	public double discountPrice() {
		return 6.00;
	}

	/*
	 * public void addComponent(Bus bus) { cardlist.addElement(bus); }
	 */

	@Override
	public double computePrice() {
		double tmp = discountPrice();
		if (bus != null) {
			System.out.println("temp in Board - bus price = " + bus.computePrice());
			tmp += bus.computePrice();
		}

		Iterator it = cardlist.iterator();
		Card card;
		while (it.hasNext()) {
			card = (Card) it.next();

			tmp += card.computePrice();

			System.out.println("temp in Board - card final = " + card.computePrice());
		}
		System.out.println("temp in Board - final = " + tmp);

		return tmp;
	}

	public void addComponent(Card d) {
		cardlist.addElement(d);
	}
	public void setBus (Bus b){
		    bus=b;
	}

}
