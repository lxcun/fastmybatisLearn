package com.fastmybatis.fastmybatis1.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "order")
@Data
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //定义自增主键，订单号
    private int id;
    private double price;//订单总价
//    @LazyFetch(column = "user_id")
    private int userId;//下订单的用户id
    private String goods;//商品名
}
