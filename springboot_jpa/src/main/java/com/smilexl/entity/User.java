package com.smilexl.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @ClassName: Entity
 * @Description: //TODO
 * @Author: LL
 * @Date: 2019/4/11 9:56
 * @Version: V1.0
 */
@Data  //getter、setter方法
@NoArgsConstructor //无参构造器
@Entity //告诉jpa这是一个实体类（和数据表映射的类）
@Table(name = "tbl_user") //指定和哪个数据表对应，省略默认为user
public class User {

    @Id //指定id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    //省略，列名和属性名相同
    private String email;
    @Column(name = "last_name",length = 50) //和数据表对应的一个列
    private String lastname;

}
