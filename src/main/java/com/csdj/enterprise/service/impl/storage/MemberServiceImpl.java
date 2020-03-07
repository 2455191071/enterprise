package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.MemberDao;
import com.csdj.enterprise.entity.storage.Member;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 会员业务逻辑层Impl
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberDao dao;

    @Override
    public List<Member> findById(String memberId) {
        return dao.findById(memberId);
    }

    @Override
    public PageUtil<Member> findPage(int index, int pageSize, String memberId, String memberName, String memberPhone) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Member> page=new PageUtil<Member>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (memberId!=null) {
            map.put("memberId", memberId);
        }
        if (memberName!=null) {
            map.put("memberName", memberName);
        }
        if (memberPhone!=null) {
            map.put("memberPhone", memberPhone);
        }

        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(memberId,memberName,memberPhone);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String memberId, String memberName, String memberPhone) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("memberId", memberId);
        map.put("memberName", memberName);
        map.put("memberPhone", memberPhone);


        return dao.Count(map);
    }
}
