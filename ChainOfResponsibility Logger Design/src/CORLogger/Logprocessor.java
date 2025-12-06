package CORLogger;

public class Logprocessor {
     
	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	Logprocessor nextLogProcessor;
	
	public Logprocessor(Logprocessor logProcessor) {
		this.nextLogProcessor=logProcessor;
		}
	
	public void log(int logLevel,String message) {
		
		if(nextLogProcessor!=null) {
			nextLogProcessor.log(logLevel, message);
		}
	}
	
}
