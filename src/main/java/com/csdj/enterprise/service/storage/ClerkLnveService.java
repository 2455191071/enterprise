package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.storage.PageUtil;

/**
 * 莫宏峡
 * 职员信息业务逻辑层
 */
public interface ClerkLnveService {
    /**
     *
     * 查询所有职员信息
     */
    public PageUtil<Clerk> findPage(int index, int pageSize, String clerkName, String offPhone);
    /**
     * 查询总数
     */
    public int Count(String clerkName, String offPhone);
}
