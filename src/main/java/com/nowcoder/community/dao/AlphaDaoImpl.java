package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("first")
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String select(){
        return "hibernate";
    }
}
