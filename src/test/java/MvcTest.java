import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
        "file:src/main/webapp/WEB-INF/DispatcherServlet-servlet.xml" })
public class MvcTest {

    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc= MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/employee/emps").param("pn", "1"))
                .andReturn();
        //请求域中会有pageInfo
        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
    }

    @Test
    public void testLog() throws Exception {
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/appNotice/selectOne").param("pn", "1"))
                .andReturn();

//        //请求域中会有pageInfo
//        MockHttpServletRequest request = result.getRequest();
//        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
//        List<TblEmp> list = pageInfo.getList();
//        for(TblEmp employee:list){
//            System.out.println(employee);
//        }
    }

}
