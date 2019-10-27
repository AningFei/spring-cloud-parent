package myself.spring.cloud.h2db.dao;

import myself.spring.cloud.h2db.model.Organization;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

public class OrganizationDaoTest extends BaseTest {

    @Autowired
    private OrganizationDao dao;
    @Autowired
    private DataSource dataSource;

//    @Before
//    public void setUp() throws Exception {
//        Operation operation = Operations.sequenceOf(
//                Operations.deleteAllFrom("sys_organization"),
//                Operations.insertInto("sys_organization")
//                        .columns("name","priority","parent_id","parent_ids","available")
//                        .values("测试组", 101, 0, "0/", Boolean.TRUE)
//                        .build()
//        );
//        DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);
//        dbSetupTracker.launchIfNecessary(dbSetup);
//    }

    @Test
    public void testFindById() {
//
//        long count = jdbcTemplate.queryForObject("SELECT count(*) FROM `sys_organization`", long.class);
//        assertEquals(1L, count);

        Organization organization = dao.findById(1L);
        Organization organization1 = dao.findById(2L);
        assertNotNull(dao.findById(1L));
    }

    @After
    public void tearDown() throws Exception {
    }
}