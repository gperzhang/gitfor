package com.mall.order;

import com.mall.order.service.HelloService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;

/**
 * @author acai
 * @date 2020/8/4
 **/
@Slf4j
public class HelloControllerTest extends BaseServiceTest{

//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @MockBean
//    public HelloService helloService;
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
    @Test
    public void testMockHello() throws Exception {
        when(helloService.sayBye(anyString())).thenReturn("66666");
        MvcResult mvcResult = mockMvc.perform(get("/test")
                .param("name","111111")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("+++++++++++++++++++++++++++++"+result);
        assertThat(result).isNotEmpty();
    }

    @Test
    public void testHello(){
        System.out.println(helloService==null?"注入对象为控":"service对象不为空");
        String nihao = helloService.sayBye("nihao");
        System.out.println(nihao);
    }
    @Test
    public void mytest(){
        List<String> list = mock(List.class);

        when(list.get(anyInt())).thenReturn("hello","world");

        String result = list.get(0)+list.get(1);

        verify(list,times(2)).get(anyInt());

        assertThat(result).isEqualTo("helloword");
    }

}
