package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
	
	String number;
	StocksObservable observable;
	 
	public MobileAlertObserverImpl(String number,StocksObservable observable) {
		this.number=number;
		this.observable=observable;
	}

	@Override
	public void update() {
		sendMsg(number);
	}
	
	public void sendMsg(String number) {
		System.out.println("Message sent to:"+number);
	}

}
