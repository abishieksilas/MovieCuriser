/**
 * 
 */
package com.cognizant.moviecruiser.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.moviecruiser.model.MovieList;
import com.cognizant.moviecruiser.util.DateUtil;

public class MovieListDaoCollectionImplTest {
public static void main(String[] args)throws ParseException {
		
	//testModifyMovieList();
	testGetMovieListCustomer();
}
public static void testGetMovieListAdmin()
{
	MovieListDaoCollectionImpl mov=new MovieListDaoCollectionImpl();
	System.out.println("MENU ITEM LIST : "+mov.getMovieListAdmin());
	List<MovieList> movielist=mov.getMovieListAdmin();
	for(MovieList menu_item : movielist)
	{
		System.out.println(menu_item.toString());
	}
}
public static void testGetMovieListCustomer()
{
	MovieListDaoCollectionImpl mov=new MovieListDaoCollectionImpl();
	//System.out.println("CUSTOMER MENU ITEM LIST : "+mov.getMovieItemlistCustomer());
	List<MovieList> movielist=mov.getMovieItemlistCustomer();
	for(MovieList movie_list : movielist)
	{
		System.out.println(movie_list.toString());
	}
}
public static void testModifyMovieList() throws ParseException
{
	MovieListDaoCollectionImpl menuitemcollectionimpl=new MovieListDaoCollectionImpl();
	MovieList menuItem=new MovieList(0000002," Pi",1187463956f,true, DateUtil.convertToDate("03/07/1996"), "Thriller",false);
	MovieListDao menuitemdao=menuitemcollectionimpl;
	menuitemdao.modifyMovieList(menuItem);
	System.out.println("Modify Movie Item : "+menuitemdao.getMovie(0000002));
	
	
	
}
public void testGetMovieList()
{
	
}

}
