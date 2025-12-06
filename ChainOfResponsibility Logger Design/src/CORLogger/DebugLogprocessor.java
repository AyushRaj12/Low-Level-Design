package CORLogger;

public class DebugLogprocessor extends Logprocessor {

	public DebugLogprocessor(Logprocessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}
	public void log(int logLevel,String message){

        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else{

            super.log(logLevel, message);
        }

    }

}
