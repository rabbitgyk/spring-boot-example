package com.rabbit.bootestest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Author: guoyankui
 * @DATE: 09/12/2017 9:07 PM
 */
@Document(indexName = "product-index", type = "book", shards=5,replicas=1,indexStoreType="fs",refreshInterval="-1")
public class Book implements Serializable{

    private static final long serialVersionUID = 551589397625941750L;

    @Id
    private Long id;
    private String name;
    @Field(type = FieldType.Auto, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String contentDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

}
