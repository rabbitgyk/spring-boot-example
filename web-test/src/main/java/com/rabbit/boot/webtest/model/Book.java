package com.rabbit.boot.webtest.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: guoyankui
 * @DATE: 17/12/2017 3:31 PM
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 193815981138500723L;
    @NotNull(message = "bookId不能为空")
    private String bookId;
    private String name;
    private int totalPage;
    private String author;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
