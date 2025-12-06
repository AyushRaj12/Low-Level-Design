package Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
  
	List<Object> objectList;
	String directoryName;
	
	public Directory(String directoryName) {
		this.directoryName=directoryName;
		objectList=new ArrayList<>();
	}
	
	public void add(Object object) {
	     objectList.add(object);
	}
	
	public void ls() {
		
		System.out.println("DirectorName: "+directoryName);
		for(Object obj:objectList) {
			if(obj instanceof File) {                     //here we need to use instanceof to check the type of object receiving
				((File) obj).ls();
			}
			else if(obj instanceof Directory) {
				((Directory) obj).ls();
			}
		}
	}
}
