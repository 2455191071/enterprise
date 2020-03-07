package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 会员信息Dao
 */
@Mapper
public interface MemberDao {
    /**
     * 出现id
     */
    public List<Member> findById(String memberId);

    /**
     *
     * 查询所有会员
     */
    public List<Member> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
}
