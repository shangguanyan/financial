package com.financial.fileupload.controller;

import com.financial.fileupload.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class FileUploadController {
  Logger logger = LoggerFactory.getLogger(FileUploadController.class);
  @Autowired
  FileUploadService fileUploadService;
  @PostMapping("/image")
  public ResponseEntity uploadFile(@RequestParam("file")MultipartFile file){
    String url = fileUploadService.upload(file);
    logger.info(url);
    return ResponseEntity.ok(url);
  }
}
