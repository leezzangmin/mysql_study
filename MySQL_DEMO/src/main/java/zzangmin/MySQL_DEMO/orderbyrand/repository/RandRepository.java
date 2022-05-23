package zzangmin.MySQL_DEMO.orderbyrand.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand;

@Repository
public interface RandRepository extends CrudRepository<Item_rand, Long> {

    @Query(value = "select * from item order by rand()", nativeQuery = true)
    List<Item_rand> findAll();

}
