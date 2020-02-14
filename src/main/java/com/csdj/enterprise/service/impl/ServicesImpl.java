package com.csdj.enterprise.service.impl;

import com.csdj.enterprise.mapper.Mappers;
import com.csdj.enterprise.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServicesImpl implements Services {

    @Resource
    private Mappers mappers;
}
