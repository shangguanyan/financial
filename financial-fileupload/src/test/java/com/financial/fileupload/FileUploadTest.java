package com.financial.fileupload;

import com.financial.fileupload.service.FileUploadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileUploadTest {

  @Autowired
  FileUploadService fileUploadService;

  @Test
  public void testFileUpload() throws FileNotFoundException {
    fileUploadService.testUpload();
  }
}

