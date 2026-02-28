package auctionSystem;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionMediator auctionMediator=new Auction();
		Colleague colleague1=new Bidder("Ayush", auctionMediator);
		Colleague colleague2=new Bidder("Suresh", auctionMediator);
		Colleague colleague3=new Bidder("Raj", auctionMediator);
		colleague1.placeBid(3000);
		colleague2.placeBid(3001);
		colleague3.placeBid(3002);

	}

}
