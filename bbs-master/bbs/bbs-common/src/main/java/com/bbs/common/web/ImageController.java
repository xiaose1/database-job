package com.bbs.common.web;

import com.bbs.common.service.ImageService;
import com.bbs.common.vo.DataResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * ImageController
 *
 * @author yangjiajia
 * @createdAt 2024/4/5 17:27
 */
@RestController
@RequestMapping("image")
@Log4j2
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload")
    public DataResult upload(@RequestBody MultipartFile file) {
        try {
            String imageName = imageService.upload(file);
            return DataResult.success(imageName);
        } catch (Exception e) {
            log.error("图片上传失败,", e);
            return DataResult.fail();
        }
    }
}
