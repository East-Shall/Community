package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes=CommunityApplication.class)
public class MapperTest implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {//参数中返回的接口就是获得容器的地方
        this.applicationContext=applicationContext;
    }

    @Test
    public void getUserInfo(){
        User user=userMapper.selectById(1);
        System.out.println(user);

        user=userMapper.selectByEmail("nowcoder1@sina.com");
        System.out.println(user);

        user=userMapper.selectByName("SYSTEM");
        System.out.println(user);
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list=discussPostMapper.selectDiscussPosts(0,0,10);
        for(DiscussPost e:list)
            System.out.println(e);
    }




















}
