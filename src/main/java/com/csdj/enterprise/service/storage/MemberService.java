package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.Member;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;

/**
 * 莫宏峡
 * 会员业务逻辑层
 */
public interface MemberService {
    /**
     * 出现id
     */
    public List<Member> findById(String memberId);
    /**
     *
     * 查询所有会员信息
     */
    public PageUtil<Member> findPage(int index, int pageSize, String memberId, String memberName, String memberPhone);
    /**
     * 查询总数
     */
    public int Count(String memberId, String memberName, String memberPhone);
}
