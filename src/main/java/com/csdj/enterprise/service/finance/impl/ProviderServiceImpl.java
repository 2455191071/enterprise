package com.csdj.enterprise.service.finance.impl;

import com.csdj.enterprise.dao.finance.ProviderMapper;
import com.csdj.enterprise.entity.finance.Provider;
import com.csdj.enterprise.service.finance.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: 实现类
 * @author: Yin jie
 * @create: 2020-02-14 19:04
 **/
@Service("providerServiceImpl")
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderMapper providerMapper;

    @Override
    public List<Provider> findpInfoName(String provider, Date begindate, Date paydate, int currPage, int pageSize) {
        return providerMapper.findpInfoName(provider,begindate,paydate,currPage,pageSize);
    }

    @Override
    public int findTypeNameCount(String provider) {
        return providerMapper.findTypeNameCount(provider);
    }

    @Override
    public int delById(int providerId) {
        return providerMapper.delById(providerId);
    }

    @Override
    public Provider findById(int providerId) {
        return providerMapper.findById(providerId);
    }

    @Override
    public int update(Provider provider) {
        return providerMapper.update(provider);
    }

    @Override
    public int add(Provider product) {
        return providerMapper.add(product);
    }


}
