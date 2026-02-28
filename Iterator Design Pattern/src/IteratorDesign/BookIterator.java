package IteratorDesign;

import java.util.List;

public class BookIterator implements Iterator {
	
	List<Book> books;
	private int index=0;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (index<books.size());
	}

	public BookIterator(List<Book> books) {
		super();
		this.books = books;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
	     if(this.hasNext()) {
	    	 return books.get(index++);
	     }
	     return null;
	}
 
}
