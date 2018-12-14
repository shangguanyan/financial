package com.financial.fileupload.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.domain.ThumbImageConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

@Service
public class FileUploadService {
  Logger logger = LoggerFactory.getLogger(FileUploadService.class);
  /**
   *   支持的文件类型
    */
  private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");
  @Autowired
  private FastFileStorageClient storageClient;

  @Autowired
  private ThumbImageConfig thumbImageConfig;

  public String upload(MultipartFile file) {
    try {
      // 1、图片信息校验
      // 1)校验文件类型
      String type = file.getContentType();
      if (!suffixes.contains(type)) {
        logger.info("上传失败，文件类型不匹配：{}", type);
        return null;
      }
      // 2)校验图片内容
      BufferedImage image = ImageIO.read(file.getInputStream());
      if (image == null) {
        logger.info("上传失败，文件内容不符合要求");
        return null;
      }
      // 2、保存图片
      // 2、将图片上传到FastDFS
      // 2.1、获取文件后缀名
      String extension = StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
      // 2.2、上传
      StorePath storePath = this.storageClient.uploadFile(
        file.getInputStream(), file.getSize(), extension, null);
      // 2.3、拼接图片地址
      String url = "http://192.168.111.135:8888/" + storePath.getFullPath();
      return url;
    } catch (Exception e) {
      return null;
    }
  }

  public void testUpload() throws FileNotFoundException {
    File file = new File("D:\\自己\\资料\\hyd.png");
    // 上传并且生成缩略图
    StorePath storePath = this.storageClient.uploadFile(
      new FileInputStream(file), file.length(), "png", null);
    // 带分组的路径
    System.out.println(storePath.getFullPath());
    // 不带分组的路径
    System.out.println(storePath.getPath());
  }
}
