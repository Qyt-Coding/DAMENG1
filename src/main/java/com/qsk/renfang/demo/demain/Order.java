package com.qsk.renfang.demo.demain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author : qin shengkai
 * @date : 2020/5/28
 */
@Data
//@EqualsAndHashCode( callSuper = true )
//@Accessors( chain = true )
@TableName( "aidijing_order" )
public class Order extends Model< Order > {

    @TableId( value = "id", type = IdType.AUTO )
    private Long   id;
    @TableField( "order_id" )
    private String orderId;
    @TableField( "order_name" )
    private String orderName;

    @Override
    protected Serializable pkVal () {
        return this.id;
    }

}
