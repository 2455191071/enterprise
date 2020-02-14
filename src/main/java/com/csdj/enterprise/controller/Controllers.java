package com.csdj.enterprise.controller;

import com.csdj.enterprise.service.Services;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class Controllers {
    @Resource
    private Services services;
}
