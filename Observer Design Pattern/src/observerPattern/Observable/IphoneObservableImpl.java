package observerPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import observerPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable{
  List<NotificationAlertObserver> observerlist=new ArrayList<>();
  int stockCount=0;
  
  public void add(NotificationAlertObserver observer) {
	  observerlist.add(observer);
  }
  
  public void remove(NotificationAlertObserver observer) {
	  observerlist.remove(observer);
  }
  
  public void notifySubscribers() {
	  for(NotificationAlertObserver ob:observerlist) {
		  ob.update();
		  }
  }
  
  public void setStockCount(int newStockAdded) {
	  stockCount=stockCount+newStockAdded;
	  if(stockCount!=0) {
		  notifySubscribers();
	  }
	  
  }
  
  public int getStockCount() {
	  return stockCount;
  }

  
}
