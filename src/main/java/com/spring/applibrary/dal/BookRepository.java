package com.spring.applibrary.dal;

import com.spring.applibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query(value="select * from book b WHERE b.name LIKE %:keyword% " +
            "or b.author LIKE %:keyword% " +
            "or b.isbnnumber LIKE %:keyword% " +
            "or b.serial_no LIKE %:keyword%", nativeQuery = true)
    List<Book> findByKeyword(@Param("keyword") String keyword);
}
