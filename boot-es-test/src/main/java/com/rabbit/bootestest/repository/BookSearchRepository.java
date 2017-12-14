package com.rabbit.bootestest.repository;

import com.rabbit.bootestest.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author: guoyankui
 * @DATE: 09/12/2017 9:14 PM
 */
public interface BookSearchRepository extends ElasticsearchRepository<Book, Long> {

    List<Book> findByName(String name);
}
