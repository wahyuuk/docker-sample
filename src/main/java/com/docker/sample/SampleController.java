/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author WAHYUK
 */
@RestController
@RequestMapping("api")
public class SampleController {
    
    @Autowired private SampleRepo repo;
    
    @GetMapping("sample")
    public Page<SampleTable> getAll(Pageable page) {
        return repo.findAll(page);
    }
}
