package com.mall.order.test;

import com.alibaba.fastjson.JSON;
import com.byai.client.auth.Token;
import com.byai.client.core.BYClient;
import com.byai.client.core.DefaultBYClient;
import com.byai.gen.v1_0_0.api.*;
import com.byai.gen.v1_0_0.model.*;
import com.byai.util.json.JsonUtils;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author acai
 * @date 2020/11/20
 **/
public class Test {
    public static void main(String[] args) throws ParseException {
//      4ed0f10f39263fe1832c537c2bcb9a2a
        BYClient client = new DefaultBYClient(new Token("4ed0f10f39263fe1832c537c2bcb9a2a"));
        ByaiAicrmPaymentCustomQueryParams byaiAicrmPaymentCustomQueryParams = new ByaiAicrmPaymentCustomQueryParams();
//      byaiAicrmPaymentCustomQueryParams.setQueryGroupList("[{"queryFieldList":[{"value":"[53]","operator":"IN","fieldKey":"PAYMENT_CONTRCT"}],"relation":"AND"}]");
        ByaiAicrmPaymentCustomQuery byaiAicrmPaymentCustomQuery = new ByaiAicrmPaymentCustomQuery();
        byaiAicrmPaymentCustomQuery.setAPIParams(byaiAicrmPaymentCustomQueryParams);
        ByaiAicrmPaymentCustomQueryResult result = client.invoke(byaiAicrmPaymentCustomQuery);
        System.out.println(result);

//        String string = "2020-11-19T09:34:05";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = simpleDateFormat.parse(string);
//        System.out.println(parse);

    }
}
