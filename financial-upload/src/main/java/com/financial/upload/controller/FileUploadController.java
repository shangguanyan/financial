package com.financial.upload.controller;

import com.financial.upload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class FileUploadController {
  @Autowired
  FileUploadService fileUploadService;
  public ResponseEntity uploadFile(@RequestParam("file")MultipartFile file){
    String url = fileUploadService.upload(file);
    return ResponseEntity.ok(url);
  }
}
