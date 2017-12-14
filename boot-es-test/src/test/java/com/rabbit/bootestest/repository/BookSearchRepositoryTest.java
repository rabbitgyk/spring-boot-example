package com.rabbit.bootestest.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbit.bootestest.model.Book;
import org.elasticsearch.index.query.FuzzyQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Author: guoyankui
 * @DATE: 09/12/2017 9:18 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookSearchRepositoryTest {

    @Autowired
    private BookSearchRepository productSearchRepository;

    @Test
    public void test(){
        System.out.println("演示初始化");
    }

    @Test
    public void testSave(){
        Book book = new Book();
        book.setContentDesc("今晚吃鸡课吗");
        book.setName("游戏");
        book.setId(900304343568L);

        productSearchRepository.save(book);
    }

    @Test
    public void testFindById() throws Exception {

        Optional<Book> book = productSearchRepository.findById(900304343563L);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(book.orElse(null));

        System.out.println(json);
    }

    @Test
    public void testFindByName() throws Exception {
        List<Book> books = productSearchRepository.findByName("游戏");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(books);

        System.out.println(json);
    }

    @Test
    public void testSearch() throws Exception {

        FuzzyQueryBuilder
        //QueryBuilder filterBuilder =
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder().withIndices("product-index").withTypes("book").withFilter().build();
        //SearchQuery searchQuery = new NativeSearchQuery(queryBuilder);

        Page<Book> bookPage = productSearchRepository.search(searchQuery);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(bookPage);

        System.out.println(json);
    }



}
