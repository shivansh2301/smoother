package com.smooth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String test()
    {
        System.out.println("hello");
        return "hellooooo";
    }

    @PostMapping("/upload_file")
    public String upload(@RequestParam("file") MultipartFile file)
    {
        //To test using curl - use:
        // curl -F "data=@test.mp4" localhost:8080/upload_file/

        System.out.println("received file");
        //Create a service to
        //  validate file
        //  save file
        //  process file
        //  serve file

        return "file uploaded";
    }
}
