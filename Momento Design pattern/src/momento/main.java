<<<<<<< HEAD
package momento;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		configurationCaretaker caretaker=new configurationCaretaker();
		configurationOriginator originator=new configurationOriginator(10,2);
		configurationMemento snapshot1 =   originator.createMemento();
		caretaker.addMemento(snapshot1);
		
		originator.setHeight(8);
		originator.setWeight(5);
		configurationMemento snapshot2 =   originator.createMemento();
		caretaker.addMemento(snapshot2);
		
		configurationMemento restoredMemento=caretaker.undo();
		
		originator.restoreMemento(restoredMemento);
		
		System.out.println(originator.height+" "+originator.weight);
		
		
	}

}
=======
package momento;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		configurationCaretaker caretaker=new configurationCaretaker();
		configurationOriginator originator=new configurationOriginator(10,2);
		configurationMemento snapshot1 =   originator.createMemento();
		caretaker.addMemento(snapshot1);
		
		originator.setHeight(8);
		originator.setWeight(5);
		configurationMemento snapshot2 =   originator.createMemento();
		caretaker.addMemento(snapshot2);
		
		configurationMemento restoredMemento=caretaker.undo();
		
		originator.restoreMemento(restoredMemento);
		
		System.out.println(originator.height+" "+originator.weight);
		
		
	}

}
>>>>>>> cbfd9401efec7493aba68a80a94fb096083f2565
