package com.qsk.renfang.demo.controller;

import com.qsk.renfang.demo.demain.Order;
import com.qsk.renfang.demo.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.List;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
@RestController
public class DemoController {



    @Autowired
    private OrderService orderService;

    @GetMapping("list")
    public List<Order> getList(){
        return orderService.list();
    }



    @RequestMapping("/get")
    public String getEmployee() throws ClassNotFoundException, SQLException {
        Class.forName("dm.jdbc.driver.DmDriver");
        String url = "jdbc:dm://127.0.0.1:5236";
        // 加载驱动程序
        // 主库 IP = 223.254.254.19
        String userID = "QSK";
        String passwd = "123456789";
        Connection con = DriverManager.getConnection(url, userID, passwd);
        PreparedStatement ps = con.prepareStatement("select * from SYSDBA.aidijing_order;");
        ResultSet rs = ps.executeQuery();
        String userId1 = "";
        String id1 = "";
        String orderId1 = "";
        String orderName1 = "";

        while (rs.next())
        {
            id1 = rs.getString("id");
            userId1 = rs.getString("user_id");
            orderId1 = rs.getString("order_id");
            orderName1 = rs.getString("order_name");
        }

        return id1+"  "+userID +"  " + orderId1+"   " +orderName1;
    }
}
