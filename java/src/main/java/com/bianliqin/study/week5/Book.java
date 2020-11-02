package com.bianliqin.study.week5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/2
 **/
@Data
@Builder
@NoArgsConstructor

public class Book {
    private String ISBN;
    private String bookName;
    private Integer price;

    public Book(String ISBN, String bookName, Integer price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}





