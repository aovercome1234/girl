package com.ls.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by keke on 2017/10/18.
 */
//获取前缀为girl的配置
@Component
@ConfigurationProperties(prefix = "girl")
//@PropertySource("resources/girl.properties")
public class GirlProperties {
    private String cupSize;

    private int age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
