package org.example;

import com.google.gson.Gson;
import org.example.common.utils.HttpUtils;
import org.example.entity.ResEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // 1.寻找粉丝数API地址：https://api.bilibili.com/x/relation/stat?vmid=588278127&jsonp=jsonp

        // 2.利用HTTP工具请求该地址
        String res = HttpUtils.sendGet("https://api.bilibili.com/x/relation/stat?vmid=588278127&jsonp=jsonp", null);
        // System.out.println(res);
        // 3.使用JSON转换工具将JSON字符串结果转为对象
        ResEntity resEntity = gson.fromJson(res, ResEntity.class);
        // 4.取出关注数
        Integer follower = resEntity.getData().getFollower();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("当前时间：" + nowTime + "，小刚粉丝数为:" + follower);
    }
}