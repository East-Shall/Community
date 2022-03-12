package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class AlphaDaoImplSecond implements AlphaDao{
    @Override
    public String select(){
        return "second";
    }
}
