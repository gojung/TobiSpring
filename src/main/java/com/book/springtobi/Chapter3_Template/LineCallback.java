package com.book.springtobi.Chapter3_Template;

public interface LineCallback<T>{
    T doSomethingWithLine(String line, T value);
}
