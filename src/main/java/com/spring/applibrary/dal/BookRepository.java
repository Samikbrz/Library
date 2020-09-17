package com.spring.applibrary.dal;

import com.spring.applibrary.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

    @Query(value="select * from book b WHERE b.name LIKE %:keyword%", nativeQuery = true)
    List<Book> findByKeyword(@Param("keyword") String keyword);
}