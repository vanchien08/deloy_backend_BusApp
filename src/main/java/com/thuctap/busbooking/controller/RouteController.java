package com.thuctap.busbooking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.thuctap.busbooking.dto.response.ApiResponse;
import com.thuctap.busbooking.entity.Route;
import com.thuctap.busbooking.service.auth.RouteService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RouteController {
    RouteService routeService;

    @GetMapping("/get-route/{id}")
    ApiResponse<List<Route>> getList(@PathVariable int id) {
        return ApiResponse.<List<Route>>builder()
                .result(routeService.getListRoute(id))
                .build();
    }
}
