package com.thuctap.busbooking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thuctap.busbooking.dto.request.ChangeTicketRequest;
import com.thuctap.busbooking.dto.response.ApiResponse;
import com.thuctap.busbooking.service.auth.ChangeHistoryTicketService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChangeHistoryTicketController {

    ChangeHistoryTicketService changeHistoryTicketService;

    @PostMapping("/createTicket")
    ApiResponse createChangeTicket(@RequestBody ChangeTicketRequest request) {
        changeHistoryTicketService.createChangeTicket(request);
        return ApiResponse.builder().message("Successfully!").build();
    }
}
