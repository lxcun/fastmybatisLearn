package com.xcl.fastmybatis.entity;

import lombok.Data;

import javax.persistence.*;

//@Entity
@Table(name = "order")
@Data
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //定义自增主键，订单号
    private int id;
    private double price;//订单总价
    private int userId;//下订单的用户id
    private String goods;//商品名
}
