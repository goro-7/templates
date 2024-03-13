package com.gauravsalvi.trip_app.api;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DemoApi {

    @GetMapping("/demo-api")
    ResponseEntity<String> getTime() {
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
