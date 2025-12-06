package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailId;
	StocksObservable observable;
	
	public EmailAlertObserverImpl(String emailId,	StocksObservable observable) {
		this.emailId=emailId;
		this.observable=observable;
	}
	
	@Override
	public void update() {
		sendEmail(emailId);
	}
	
	public void sendEmail(String emailId) {
		System.out.println("Mail sent to:"+emailId);
	}

}
