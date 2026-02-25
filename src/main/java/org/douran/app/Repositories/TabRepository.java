package org.douran.app.Repositories;

import org.douran.app.Models.*;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TabRepository extends CrudRepository<User, Long> {
    @Query("SELECT * FROM INFRA.AD_TAB ORDER BY AD_TAB_ID")
    List<Tab> findAllTab();

    @Query("SELECT * FROM INFRA.AD_TAB ORDER BY AD_TAB_ID WHERE AD_CLIENT_ID = :id")
    List<Tab> findByClientId(@Param("id") long ClientId);

    @Query("SELECT * FROM INFRA.AD_TAB ORDER BY AD_TAB_ID WHERE AD_TABLE_ID = :id")
    List<Tab> findByTableId(@Param("id") long TableId);

    @Query("SELECT * FROM INFRA.AD_TAB ORDER BY AD_TAB_ID WHERE AD_ORG_ID = :id")
    List<Tab> findByOrgId(@Param("id") long OrgId);
}
