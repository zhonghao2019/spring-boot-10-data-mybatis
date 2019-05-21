package com.zhonghao.springboot.controller;

import com.zhonghao.springboot.entities.Bill;
import com.zhonghao.springboot.mapper.BIllMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @Autowired
    BIllMapper bIllMapper;

    @GetMapping("/bill/{bid}")
    public Bill getBill(@PathVariable(value = "bid") Integer bid) {
        return bIllMapper.getBillByBid(bid);
    }

    @GetMapping("/bill")
    public Bill addBill(Bill bill) {
        bIllMapper.addBill(bill);
        return bill;
    }

}
