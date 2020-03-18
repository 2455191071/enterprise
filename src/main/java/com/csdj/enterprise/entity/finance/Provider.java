package com.csdj.enterprise.entity.finance;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Yin jie
 * @program: spring_erp
 * @description: Pojo Class
 * 供应商期初管理实体类
 * @create: 2020-02-14 18:51
 **/
@Data
public class Provider {
    private int providerId;
    private String provider;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date begindate;
    private double beginpayable;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date paydate;
    private double readypayment;
    private double alreadypayment;
    private double begincost;
    private double present;
}
