package com.clh.service;

import com.clh.bean.Meet;
import com.clh.mapper.MeetMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MeetServiceImpl implements MeetService{
    @Resource
    private MeetMapper meetMapper;
    @Override
    public List list() {
        return meetMapper.list();
    }

    @Override
    public List listType() {
        return meetMapper.listType();
    }

    @Override
    public int add(Meet meet) {
        return meetMapper.add(meet);
    }

    @Override
    public List listOne(Integer id) {
        return meetMapper.listOne(id);
    }

    @Override
    public int xiu(Meet meet) {
        return meetMapper.xiu(meet);
    }
}

