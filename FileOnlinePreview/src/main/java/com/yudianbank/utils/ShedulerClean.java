package com.yudianbank.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 定时清空文件
 * @author HYL
 * @date 2017年12月25日 上午11:52:55
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
@Component
public class ShedulerClean {
    @Value("${file.dir}")
    String fileDir;

//    @Scheduled(cron = "0 0 23 * * ?")   //每晚23点执行一次
    public void clean(){
        System.out.println("执行一次清空文件夹");
        DeleteFileUtil.deleteDirectory(fileDir);
    }
}
