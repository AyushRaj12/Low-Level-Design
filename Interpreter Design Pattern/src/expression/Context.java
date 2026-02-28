package expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
  Map<Character, Integer> contextMap=new HashMap<Character, Integer>();
  
  public void setContext(char exp,int value) {
	  contextMap.put(exp, value);
  }
  
  public int getContext(char exp) {
	  return contextMap.get(exp);
  }
}
