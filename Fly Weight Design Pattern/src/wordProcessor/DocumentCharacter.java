package wordProcessor;

public class DocumentCharacter implements ILetter {

	private char Character;
	private String fontSize;
	private int size;
	
	
	public DocumentCharacter(char character, String fontSize, int size) {
		super();
		Character = character;
		this.fontSize = fontSize;
		this.size = size;
	}


	public char getCharacter() {
		return Character;
	}


	public String getFontSize() {
		return fontSize;
	}
	
	
	public int getSize() {
		return size;
	}

	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
