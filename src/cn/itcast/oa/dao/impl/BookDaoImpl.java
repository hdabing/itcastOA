package cn.itcast.oa.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.oa.base.BaseDaoImpl;
import cn.itcast.oa.dao.IBookDao;
import cn.itcast.oa.domain.Book;
@Repository
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao{
}
