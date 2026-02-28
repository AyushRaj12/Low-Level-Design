package auctionSystem;

public class Bidder implements Colleague {

	String name;
	AuctionMediator auctionMediator;
	@Override
	public void placeBid(int bidAmount) {
		// TODO Auto-generated method stub
		auctionMediator.placeBid(this, bidAmount);
		
	}

	public Bidder(String name, AuctionMediator auctionMediator) {
		super();
		this.name = name;
		this.auctionMediator = auctionMediator;
		auctionMediator.addBidder(this);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		// TODO Auto-generated method stub
		System.out.println("Bidder : "+name+" has put the amount "+bidAmount);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
		//return null;
	}

}
