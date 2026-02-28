package wordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactor {
  
	public static Map<Character,ILetter> cache=new HashMap<Character, ILetter>();
	
	public static ILetter create(char ch) {
		if(cache.containsKey(ch)) {
			return cache.get(ch);
		}else {
			ILetter iLetter=new DocumentCharacter(ch, "Arial", 10);
			cache.put(ch, iLetter);
			return iLetter;
			
		}
	}
}
