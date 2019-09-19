package com.hongjl.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @Author hongjinlin
 * @create 2019-09-19 14:52
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
