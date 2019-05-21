package com.zhonghao.springboot.mapper;

import com.zhonghao.springboot.entities.Bill;
import org.springframework.stereotype.Component;

@Component
public interface BIllMapper {

    Bill getBillByBid(Integer bid);

    int addBill(Bill bill);
}
