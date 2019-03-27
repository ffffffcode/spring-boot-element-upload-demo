package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

	@PostMapping(value = "upload")
	public HttpEntity<Object> upload(@RequestParam("file") MultipartFile[] file, @RequestParam("name") String name) {
		System.out.println(name);
		return null;
	}

}
