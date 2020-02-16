package com.dd.controller.getInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Url {
    public String def="http://www.sd114.sdu.edu.cn:8080/web/bus/load?";
    private String schoolAddr="";
    private String startAddr="";
    private String afterAddr="";
    private String arriveAddr="";
    private String type="";
    private String url;



    public String toString(){
        url=def+"schoolAddr="+schoolAddr+"&startAddr="+startAddr+"&afterAddr="+afterAddr+"&arriveAddr="+arriveAddr+"&type="+type;
        return url;
    }

}
