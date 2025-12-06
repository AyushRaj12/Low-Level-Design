package elevator;

import java.util.List;

public class Building {
    List<Floor> floorList;
    
    public Building(List<Floor> list) {
    	this.floorList=list;
    }
    public void addFloor(Floor floor) {
    	floorList.add(floor);
    }
    
    public void removeFloor(Floor floor) {
    	floorList.remove(floor);
    	
    }
    
    public List<Floor> getAllFloorList() {
    	return floorList;
    }
    
}
