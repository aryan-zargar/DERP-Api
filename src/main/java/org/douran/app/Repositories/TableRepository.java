package org.douran.app.Repositories;

import org.douran.app.Models.Client;
import org.douran.app.Models.Table;
import org.douran.app.Models.User;
import org.douran.app.Models.Window;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends CrudRepository<User, Long> {
    @Query("SELECT * FROM INFRA.AD_TABLE ORDER BY AD_TABLE_ID")
    List<Table> findAllTables();

    @Query("SELECT * FROM INFRA.AD_TABLE WHERE AD_TABLE_ID = :id")
    List<Table> findById(@Param("id") long id);

    @Query("SELECT * FROM INFRA.AD_TABLE WHERE AD_WINDOW_ID = :id")
    List<Table> findByWindowId(@Param("id") long id);
}
