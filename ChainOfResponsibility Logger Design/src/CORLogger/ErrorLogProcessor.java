package CORLogger;

public class ErrorLogProcessor extends Logprocessor {

	public ErrorLogProcessor(Logprocessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}
	public void log(int logLevel,String message){

        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else{

            super.log(logLevel, message);
        }

    }

}
