package IteratorDesign;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class main {
        public static void main(String args[]) {
        	//Book book=new Book(200, "Hindi");
        	List<Book> bookList=Arrays.asList(new Book(200, "Hindi"),new Book(400, "English"),new Book(600, "Chemistry"),new Book(800, "Maths"));
        	Library library=new Library(bookList);
        	Iterator iterator=library.createIterator();
        	while(iterator.hasNext()) {
        		Book book=(Book) iterator.next();
        		System.out.print(book.getName()+" "+book.getPrice());
        	}
      
        }
}
