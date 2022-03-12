package com.nowcoder.community.server;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")//每次实例化的对象均是不同的，就采用此种设置
public class AlphaService {
    public AlphaService(){//服务组件的构造器，先行执行
        System.out.println("构造器执行");
    }
    @PostConstruct
    public void init(){//在构造之后进行调用
        System.out.print("初始化执行");
    }

    public String getData(){
        return "spare some spaces";
    }
    @PreDestroy
    public void destroy(){//在构造器销毁之前进行调用
        System.out.println("销毁操作");
    }
}
