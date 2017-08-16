import java.util.Vector;

/**
 * 
 */

/**
 * This acts as an interface for every Bus, Card or Drive (Leaf) and Board
 * (Composite) we create
 *
 * @author Diana Yamaletdinova Jan 23, 2017
 */
public abstract class Component {

	protected Vector<Component> components = new Vector<Component>();
	// We throw UnsupportedOperationException so that if
	// it doesn't make sense for leaf, or composite
	// to inherit a method they can just inherit the
	// default implementation

	// This allows me to add components
	public void addComponent(Component newComponent) {
		throw new UnsupportedOperationException();
	}

	// This allows me to remove components
	public void remove(Component newComponent) {
		throw new UnsupportedOperationException();
	}

	//operations
	public double computePrice() {
		double tmp = netPrice();
		for (Component c : components) {
			tmp += c.computePrice();
		}
		return tmp;
	}

	public abstract double discountPrice();
	public abstract double netPrice();

}
