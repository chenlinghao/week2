package com.clh.service;

import com.clh.bean.Meet;

import java.util.List;

public interface MeetService {
    List list();

    List listType();

    int add(Meet meet);

    List listOne(Integer id);

    int xiu(Meet meet);
}
