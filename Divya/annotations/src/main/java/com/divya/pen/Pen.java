package com.divya.pen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divya.book.Book;
//@Component Annotation creates object for this class(Instead of creating beanId in XML file)
//Spring bean Object Creation-@Component
@Component
public class Pen 
{
	//@Autowired byTpe(used as a property type)
	@Autowired
	private Book book;

	public final Book getBook() {
		return book;
	}
	//@Autowired(if we use here ,then it is byName)
	public final void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Pen [book=" + book + "]";
	}
	

}
