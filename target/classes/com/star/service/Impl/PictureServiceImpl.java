package com.star.service.Impl;

import com.star.dao.PictureDao;
import com.star.entity.Picture;
import com.star.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    public List<Picture> listPicture() {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Long id) {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) {
        pictureDao.deletePicture(id);
    }

}