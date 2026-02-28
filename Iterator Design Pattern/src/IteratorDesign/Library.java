package IteratorDesign;

import java.util.List;

public class Library implements Aggregate{
	
	List<Book> bookList;
	

	public Library(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}


	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		
		return new BookIterator(bookList);
	}

}
