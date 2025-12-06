package observerPattern;

import observerPattern.Observable.IphoneObservableImpl;
import observerPattern.Observable.StocksObservable;
import observerPattern.Observer.EmailAlertObserverImpl;
import observerPattern.Observer.MobileAlertObserverImpl;
import observerPattern.Observer.NotificationAlertObserver;

public class main {
	
	public static void main(String args[]) {
		
		// if stock is updated notify all the consumer who has subscribed publisher subscriber model
         StocksObservable observable=new IphoneObservableImpl();
         NotificationAlertObserver observer1=new EmailAlertObserverImpl("xyz@gmail.com",observable);
         NotificationAlertObserver observer2=new EmailAlertObserverImpl("abc@gmail.com",observable);
         NotificationAlertObserver observer3=new MobileAlertObserverImpl("82342872438",observable);
         
         observable.add(observer1);
         observable.add(observer2);
         observable.add(observer3);
         
         observable.setStockCount(10);
	}
         
         
}
