package zzangmin.MySQL_DEMO.orderbyrand.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand_improved;

@Repository
public interface RandRepository extends CrudRepository<Item_rand, Long> {

    @Query(value = "select * from item_rand order by rand()", nativeQuery = true)
    List<Item_rand> findAll();

    @Query(value = "select * from item_rand_improved where rand_id > FLOOR((RAND()*100000000)) order by rand_id limit 3", nativeQuery = true)
    List<Item_rand_improved> findAll_improved();

}
