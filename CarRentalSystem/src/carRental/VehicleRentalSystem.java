package carRental;

import java.util.List;

public class VehicleRentalSystem {
	 List<Stores> storeList;
	    List<User> userList;

	    VehicleRentalSystem(List<Stores> stores, List<User> users) {

	        this.storeList = stores;
	        this.userList = users;
	    }


	    public Stores getStore(Location location){

	        //based on location, we will filter out the Store from storeList.
	        return storeList.get(0);
	    }



	    //addUsers

	    //remove users


	    //add stores

	    //remove stores

}
