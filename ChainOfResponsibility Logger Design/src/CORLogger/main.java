package CORLogger;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logprocessor logObject=new InfoLogprocessor(new ErrorLogProcessor(new DebugLogprocessor(null)));
		
		logObject.log(Logprocessor.ERROR, "this is error log");
		logObject.log(Logprocessor.DEBUG, "this is debug log");
		logObject.log(Logprocessor.INFO, "this is info log");


	}

}
