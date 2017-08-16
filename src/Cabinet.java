import java.util.*;

public class Cabinet extends Component {

	private Board board;
	private Vector drivelist = new Vector();
	public void setBoard (Board b){
		    board=b;
	}
	@Override
	public double netPrice() {
		return 6.00;
	}

	@Override
	public double discountPrice() {
		return 3.00;
	}

	@Override
	public double computePrice() {
		double tmp = netPrice();
		if ( board!= null ){		
			tmp += board.computePrice();
			System.out.println("temp in Cabinet - board = " + board.computePrice());	
		}
		Iterator it = drivelist.iterator();
		Drive drive;
		while (it.hasNext()){
			drive = (Drive) it.next();			
			tmp += drive.computePrice();	
			System.out.println("temp in Cabinet - Drive = " + drive.computePrice());
		}
		return tmp;
	}

	
	public void addComponent(Drive drive) {
		drivelist.addElement(drive);		
	}
	

}
