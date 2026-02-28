package AcONOFF;

import java.util.Stack;

public class MyRemoteControl {
  Icommand icommand;
  Stack<Icommand> acCommandHistory=new Stack<Icommand>();

public MyRemoteControl(Icommand icommand) {
	super();
	this.icommand = icommand;
}

public void pressButton() {
	icommand.execute();
	acCommandHistory.add(icommand);
}
 
public void undo() {
	if(!acCommandHistory.isEmpty()) {
		Icommand lasIcommand=acCommandHistory.pop();
		lasIcommand.undo();
	}
	
}
}
