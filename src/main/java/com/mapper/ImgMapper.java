package com.mapper;

import com.entity.Img;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ImgMapper {
   @Select("select *from images where id=#{id}")
   public Img findid(long id);
}
