package gameDesign;

public class DogRobot implements Robot{
	
    private String type;
	private Sprites body;
	
	public DogRobot(String type,Sprites body) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.body=body;
	}

	public String getType() {
		return type;
	}

	public Sprites getBody() {
		return body;
	}

	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
