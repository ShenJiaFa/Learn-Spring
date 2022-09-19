package com.shenjiafa.service.impl;

import com.shenjiafa.domain.Book;
import com.shenjiafa.mapper.BookMapper;
import com.shenjiafa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void save(Book book) {
        bookMapper.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookMapper.delete(id);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }
}
