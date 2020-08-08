package com.mall.order.domain;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author acai
 * @date 2020/8/8
 **/
public class My extends BaseTypeHandler<List<Integer>> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<Integer> integers, JdbcType jdbcType) throws SQLException {
//        StringBuilder sb = new StringBuilder();
//        integers.forEach(s->sb.append(s));
        preparedStatement.setString(i,JSON.toJSONString(integers));
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return JSON.parseArray(resultSet.getString(s),Integer.class);
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return JSON.parseArray(resultSet.getString(i),Integer.class);
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return JSON.parseArray(callableStatement.getString(i),Integer.class);
    }
}
