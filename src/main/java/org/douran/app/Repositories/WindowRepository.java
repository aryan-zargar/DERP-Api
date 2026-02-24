package org.douran.app.Repositories;

import org.douran.app.Models.Window;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface WindowRepository extends CrudRepository<Window, Long> {
    @Query("SELECT * FROM INFRA.AD_WINDOW ORDER BY AD_WINDOW_ID")
    List<Window> findAllWindows();

    @Query("SELECT * FROM INFRA.AD_WINDOW WHERE AD_CLIENT_ID = :ClientId")
    List<Window> findByClientId(@Param("ClientId") long id);
}
