<<<<<<< HEAD
package momento;

import java.util.ArrayList;
import java.util.List;

public class configurationCaretaker {
   List<configurationMemento> history=new ArrayList<configurationMemento>();
   
   public void addMemento(configurationMemento memento) {
	   history.add(memento);
   }
   
   public configurationMemento undo(){
	   int n=history.size();
	   if(n>0) {
		   configurationMemento memento1= history.get(n-1);
		   history.remove(n-1);
		   return memento1;
	   }
	   return null;
	   
   }
   
   
}
=======
package momento;

import java.util.ArrayList;
import java.util.List;

public class configurationCaretaker {
   List<configurationMemento> history=new ArrayList<configurationMemento>();
   
   public void addMemento(configurationMemento memento) {
	   history.add(memento);
   }
   
   public configurationMemento undo(){
	   int n=history.size();
	   if(n>0) {
		   configurationMemento memento1= history.get(n-1);
		   history.remove(n-1);
		   return memento1;
	   }
	   return null;
	   
   }
   
   
}
>>>>>>> cbfd9401efec7493aba68a80a94fb096083f2565
