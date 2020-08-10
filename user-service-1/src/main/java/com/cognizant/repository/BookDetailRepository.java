package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cognizant.model.BookModel;

public interface BookDetailRepository extends JpaRepository<BookModel, Integer> {

	@Query(value = "select * from book where bookid=:bookId", nativeQuery = true)
	public BookModel findById(@Param("bookId") int bookId);

}
