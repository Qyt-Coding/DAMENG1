package com.qsk.renfang.demo.utls;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@EnableScheduling
@Component
public class TimeTask {
        @Scheduled(cron="0/5 * * * * ?")
        //@Scheduled(cron = "0 0 0 * * ?")//每天凌晨2点开始执行
        public void test2()
        {
            //articleServiceimpl.selectArticleWherebVerify();
            System.out.println("每五秒执行一次------------------------------------------------------------------");
        }
}
