package com.qsk.renfang.demo.demain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
@Data
@TableName("aidijing_user")
public class User extends Model< User > {

    private static final long serialVersionUID = 1L;

    @TableId( value = "id", type = IdType.AUTO )
    private Long   id;
    private String username;
    private String password;
    private String email;


    @Override
    protected Serializable pkVal () {
        return this.id;
    }

}
