<<<<<<< HEAD
package momento;

public class configurationOriginator {
	public int height;
  public configurationOriginator(int height, int weight) {
	super();
	this.height = height;
	this.weight = weight;
}

  public int weight;
public void setHeight(int height) {
	this.height = height;
}
public void setWeight(int weight) {
	this.weight = weight;
}

public configurationMemento createMemento() {
	return new configurationMemento(this.height,this.weight);
}

public void restoreMemento(configurationMemento mementoToBeRestored){
	this.height=mementoToBeRestored.height;
	this.weight=mementoToBeRestored.weight;
}
  
}
=======
package momento;

public class configurationOriginator {
	public int height;
  public configurationOriginator(int height, int weight) {
	super();
	this.height = height;
	this.weight = weight;
}

  public int weight;
public void setHeight(int height) {
	this.height = height;
}
public void setWeight(int weight) {
	this.weight = weight;
}

public configurationMemento createMemento() {
	return new configurationMemento(this.height,this.weight);
}

public void restoreMemento(configurationMemento mementoToBeRestored){
	this.height=mementoToBeRestored.height;
	this.weight=mementoToBeRestored.weight;
}
  
}
>>>>>>> cbfd9401efec7493aba68a80a94fb096083f2565
