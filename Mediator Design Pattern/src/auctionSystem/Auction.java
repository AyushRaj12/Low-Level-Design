package auctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
	
	List<Colleague> bidderList=new ArrayList<Colleague>();

	@Override
	public void addBidder(Colleague bidder) {
		// TODO Auto-generated method stub
		bidderList.add(bidder);
		
		
	}

	@Override
	public void placeBid(Colleague bidder, int bidAmount) {
		// TODO Auto-generated method stub
		//for(Colleague bid:bidderList) {
			//if(bidder.getName().equals(bid.getName())) {
				bidder.receiveBidNotification(bidAmount);
			//}
		//}
		
	}

}
