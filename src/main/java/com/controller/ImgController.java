package com.controller;

import com.entity.Img;
import com.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/img")
public class ImgController {
    @Autowired
    Iservice is;

    @RequestMapping("/findimg/{id}")
    public Img findid(@PathVariable  long id){
        Img img=is.findid(id);
        return  img;
    }
}
