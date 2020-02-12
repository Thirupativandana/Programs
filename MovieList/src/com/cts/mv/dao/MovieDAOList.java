package com.cts.mv.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.bscp.exception.BookStoreException;
import com.cts.bscp.model.Book;

public class MovieDAOList implements IMovieDAO {
	public class BookDAOCollectionImpl implements IMovieDAO {
		
		private Map<String, movie> movie;
		
		public movieDAOList() {
			movie = new TreeMap<>();

}
		@Override
		public String add(Movie movie) throws MovieListException {
			String bcode = null;
			if (movie != null) {
				bcode = movie.getBcode();
				movie.put(bcode, movie);	
			}
			return bcode;
		}
		
		@Override
		public boolean delete(String bcode) throws MovieListException {
			boolean isDone = false;
			if (bcode != null) {
				movie.remove(bcode);
				isDone = true;
			}
			return isDone;
		}
		
		@Override
		public Movie get(String bcode) throws MovieListException {
			return movie.get(bcode);
		}
		

		@Override
		public List<Book> getAll() throws BookStoreException {
			return new ArrayList<>(books.values());
		}
		
		@Override
		public boolean update(Book book) throws BookStoreException {
			boolean isDone = false;
			if (book != null) {
				String bcode = book.getBcode();
				books.replace(bcode, book);
				
			}
			return isDone;
		}

		@Override
		public void persist() throws BookStoreException {
			/* no implementation is required */
		}
		
		
	}
