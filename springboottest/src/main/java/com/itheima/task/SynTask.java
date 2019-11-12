package com.itheima.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author:yangyang
 * @date:2019/10/30
 * @descriptiom:
 */
@Component
public class SynTask {
    @Scheduled(cron = "*/1 * * * * ?")
    public  void po(){
        System.out.println(System.currentTimeMillis());
    }
}
