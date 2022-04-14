package com.corso.java.boot.controller;


import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.service.api.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CompactDiskController {

    @Autowired
    CompactDiskService compactDiskService;

    @GetMapping(path = "/compactdisk")
    ResponseEntity <List<CompactDisk>> getAll(){
        List<CompactDisk> compactDisks = compactDiskService.findAll();
        return new ResponseEntity<>(compactDisks, HttpStatus.OK);
    }

    @PostMapping(path="/compact")
    ResponseEntity<CompactDisk> create(@RequestBody CompactDisk compactDisk){
        CompactDisk compactDisk1 = compactDiskService.create(compactDisk);
        return new ResponseEntity<>(compactDisk1, HttpStatus.OK);
    }

}
