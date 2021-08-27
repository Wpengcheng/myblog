package com.star.dao;

import com.star.entity.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;



@Mapper
@Repository
public interface PictureDao {

    //展示所有图片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据图片id查询图片
    Picture getPicture(Long id);

    //修改图片信息
    int updatePicture(Picture picture);

    //删除图片
    void deletePicture(Long id);

}