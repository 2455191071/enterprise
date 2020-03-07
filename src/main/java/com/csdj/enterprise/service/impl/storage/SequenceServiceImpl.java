package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.SequenceDao;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.entity.storage.Sequence;
import com.csdj.enterprise.service.storage.SequenceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 商品序列号管理业务逻辑层的imp
 */
@Service
public class SequenceServiceImpl implements SequenceService {
    @Resource
    SequenceDao dao;

    @Override
    public List<Sequence> findById(String sequenceId) {
        return dao.findById(sequenceId);
    }

    @Override
    public PageUtil<Sequence> findPage(int index, int pageSize, String commodityId, String sequenceId, String memberId, String sequenceBei) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Sequence> page=new PageUtil<Sequence>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (commodityId!=null) {
            map.put("commodityId", commodityId);
        }
        if (sequenceId!=null) {
            map.put("sequenceId", sequenceId);
        }
        if (memberId!=null) {
            map.put("memberId", memberId);
        }
        if (sequenceBei!=null) {
            map.put("sequenceBei", sequenceBei);
        }
        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(commodityId,sequenceId,memberId,sequenceBei);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String commodityId, String sequenceId, String memberId, String sequenceBei) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("commodityId", commodityId);
        map.put("sequenceId", sequenceId);
        map.put("memberId", memberId);
        map.put("sequenceBei", sequenceBei);


        return dao.Count(map);
    }
    @Override
    public int add(Sequence lnve) {
        return dao.add(lnve);
    }
}
