package com.mall.order;

import com.mall.order.controller.OrderController;
import com.mall.order.service.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author acai
 * @date 2020/8/4
 **/

public class OrderControllerTest {

    @Mock
    OrderService orderService;

    private MockMvc mockMvc;

    @InjectMocks
    OrderController orderController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();
    }

    @Test
    public void orderTest() throws Exception {
        when(orderService.handler(anyString())).thenReturn("66666");
        MvcResult mvcResult = mockMvc.perform(get("/order/list")
                .param("id","111111")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andReturn();
        String result = mvcResult.getResponse().getContentAsString();

        assertThat(result).isEqualTo("66666");

    }
}
