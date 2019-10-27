package myself.spring.cloud.h2db.dao;

import myself.spring.cloud.h2db.mapper.OrganizationMapper;
import myself.spring.cloud.h2db.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
    @Autowired
    private OrganizationMapper mapper;

    public Organization findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
