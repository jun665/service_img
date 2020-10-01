package com.service;

import com.entity.Img;
import com.mapper.ImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Iserviceimpl implements Iservice {
    @Autowired
    ImgMapper im;

    @Override
    public Img findid(long id) {
        return im.findid(id);
    }
}
