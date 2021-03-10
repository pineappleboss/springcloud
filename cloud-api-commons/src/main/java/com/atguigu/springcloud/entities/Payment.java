package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //全参构造
@NoArgsConstructor//无参构造
public class Payment {
    private Long id;
    private String serial;
}
