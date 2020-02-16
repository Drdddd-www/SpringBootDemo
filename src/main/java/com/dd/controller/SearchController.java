package com.dd.controller;

import com.dd.controller.getInfo.GetInfo;
import com.dd.controller.getInfo.Url;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;

@RestController
public class SearchController {
//    schoolAddr=&startAddr=&afterAddr=&arriveAddr=&type=0
    @RequestMapping("/index")
    public String index() throws Exception{
        String url=new Url().toString();
        GetInfo get=new GetInfo();
        String info=get.getInfo(url);
        return info;
    }

    @GetMapping("/search/t/{type}")
    public String get0(@PathVariable("type") String type) throws Exception{
        Url url=new Url();
        url.setType(type);
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/s/{schoolAddr}")
    public String get1(@PathVariable("schoolAddr") String schoolAddr) throws Exception{
        Url url=new Url();
        url.setSchoolAddr(URLEncoder.encode(schoolAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/a/{arriveAddr}")
    public String get2(@PathVariable("arriveAddr") String arriveAddr) throws Exception{
        Url url=new Url();
        url.setArriveAddr(URLEncoder.encode(arriveAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/ts/{type}/{schoolAddr}")
    public String get3(@PathVariable("type") String type,@PathVariable("schoolAddr") String schoolAddr) throws Exception{
        Url url=new Url();
        url.setType(type);
        url.setSchoolAddr(URLEncoder.encode(schoolAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/ta/{type}/{arriveAddr}")
    public String get4(@PathVariable("type") String type,@PathVariable("arriveAddr") String arriveAddr) throws Exception{
        Url url=new Url();
        url.setType(type);
        url.setArriveAddr(URLEncoder.encode(arriveAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/sa/{schoolAddr}/{arriveAddr}")
    public String get5(@PathVariable("schoolAddr") String schoolAddr,@PathVariable("arriveAddr") String arriveAddr) throws Exception{
        Url url=new Url();
        url.setSchoolAddr(URLEncoder.encode(schoolAddr, "utf-8"));
        url.setArriveAddr(URLEncoder.encode(arriveAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }

    @GetMapping("/search/{type}/{schoolAddr}/{arriveAddr}")
    public String get6(@PathVariable("type") String type,@PathVariable("schoolAddr") String schoolAddr,@PathVariable("arriveAddr") String arriveAddr) throws Exception{
        Url url=new Url();
        url.setType(type);
        url.setSchoolAddr(URLEncoder.encode(schoolAddr, "utf-8"));
        url.setArriveAddr(URLEncoder.encode(arriveAddr, "utf-8"));
        GetInfo get=new GetInfo();
        String info=get.getInfo(url.toString());
        return info;
    }
}
