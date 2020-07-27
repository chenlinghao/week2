package com.clh.mapper;

import com.clh.bean.Meet;

import java.util.List;

public interface MeetMapper {
    List list();

    List listType();

    int add(Meet meet);

    List listOne(Integer id);

    int xiu(Meet meet);
}
