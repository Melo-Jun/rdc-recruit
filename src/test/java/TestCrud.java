import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.rdc.entity.AppNotice;
import com.rdc.service.AppNoticeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
        "file:src/main/webapp/WEB-INF/DispatcherServlet-servlet.xml" })
public class TestCrud {

    @Autowired
    AppNoticeService appNoticeService;

    @Test
    public void testCrud() {
        AppNotice appNotice = appNoticeService.queryById(1);
        System.out.println(appNotice.getNoticeContent());
    }

    @Test
    public void testBaseService() {
        appNoticeService.removeById(1);
    }


    @Test
    public void test02() {
        System.out.println(111);
    }

    @Test
    public void testConnection() {
        //        新建一个配置文件对象
        Properties properties = new Properties();

//        通过类加载器找到文件路径，读配置文件
        InputStream inputStream = this.getClass().getResourceAsStream("jdbc.properties");

//        加载属性文件
        try {
            properties.load(inputStream);

//            创建连接池对象
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
