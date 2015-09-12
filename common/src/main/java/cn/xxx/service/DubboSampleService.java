package cn.xxx.service;

import cn.xxx.dto.BookDto;

import java.io.Serializable;

public interface DubboSampleService {

	Serializable execute(String s);

    Object execute(BookDto book);
}
