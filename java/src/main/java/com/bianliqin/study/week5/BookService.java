package com.bianliqin.study.week5;

import java.util.TooManyListenersException;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/2
 **/

public interface BookService {
    boolean putOnSale(Book book) throws ISBNException, BookNameException, PriceException;
}
