package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    //之所以取别名。是为了在if当中动态地调用唯一参数
    int selectDiscussPostRows(@Param("userId")int userId);//查询表中一共有多少数字
}














