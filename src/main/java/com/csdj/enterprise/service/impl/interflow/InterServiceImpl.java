package com.csdj.enterprise.service.impl.interflow;

import com.csdj.enterprise.dao.interflow.InterMapper;
import com.csdj.enterprise.entity.interflow.information;
import com.csdj.enterprise.service.interflow.InterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InterServiceImpl implements InterService{

    @Resource
    private InterMapper mapper;

    @Override
    public List<information> selectKnow(String ID, String title) {
        return mapper.selectKnow(ID,title);
    }

    @Override
    public int addknow(information information) {
        return mapper.addknow(information);
    }
}
