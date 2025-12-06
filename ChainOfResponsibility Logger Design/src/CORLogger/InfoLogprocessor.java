package CORLogger;

public class InfoLogprocessor extends Logprocessor {

	public InfoLogprocessor(Logprocessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}
	public void log(int logLevel,String message){

        if(logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else{

            super.log(logLevel, message);
        }

    }


}
