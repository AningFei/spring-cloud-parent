package myself.spring.cloud.h2db.dao;

import com.ninja_squad.dbsetup.DbSetupTracker;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring-Test 框架测试基类<br>
 * <p>
 * 用DbSetup专注数据库初始化
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class BaseTest {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    protected static DbSetupTracker dbSetupTracker;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        dbSetupTracker = new DbSetupTracker();
    }
}
