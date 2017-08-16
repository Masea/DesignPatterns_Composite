public class Bus extends Component{
	@Override
	public double netPrice() {
		return 5.00;
	}
	
	@Override
	public double discountPrice() {
		return 1.00;
	}
	
	@Override
	public double computePrice() {
		return netPrice();
	}
}
