package com.thuctap.busbooking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.thuctap.busbooking.dto.response.ApiResponse;
import com.thuctap.busbooking.exception.ErrorCode;
import com.thuctap.busbooking.service.impl.CloudinaryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UploadController {
    CloudinaryService cloudinaryService;

    @PostMapping("/upload")
    public ApiResponse<?> upload(@RequestParam("file") MultipartFile file) {
        try {
            String url = cloudinaryService.uploadFile(file);
            return ApiResponse.builder()
                    .message("Image upload successful")
                    .result(url)
                    .build();
        } catch (Exception e) {
            return ApiResponse.builder()
                    .code(ErrorCode.UPLOAD_FAILED.getCode())
                    .message(ErrorCode.UPLOAD_FAILED.getMessage())
                    .build();
        }
    }
}
