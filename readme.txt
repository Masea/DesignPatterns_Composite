Composite is based on the principle that the composite element broadcasts a message to all of it’s components, which are all the same interface as itself.
Thus we can say: Composite ≈ collection + polymorphic broadcast

Applied Composite Pattern:
	- Created an Abstract Class Component
		- implements the computePrice method, and holds a list (Vector) of Component
		- implements addComponent(Component newComponent) - throws Exception();
				// We throw UnsupportedOperationException so that if
				// it doesn't make sense for leaf, or composite
				// to inherit a method they can just inherit the
				// default implementation

		- implements remove(Component newComponent) throw new UnsupportedOperationException();

	//operations
	public double computePrice() with method body
	public abstract double discountPrice();
	public abstract double netPrice();

		- Every class extends the Component Class
		- some classes override the addComponent method to apply the type constrain. 
		