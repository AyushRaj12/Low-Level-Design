package Problem;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Directory directory=new Directory("Movies");
		File file1=new File("Dhoom");
		directory.add(file1);
        Directory comedyMovie=new Directory("Comedy Movie");
        File file2=new File("Hera Pheri");
        comedyMovie.add(file2);
        directory.add(comedyMovie);
        directory.ls();
	}

}
