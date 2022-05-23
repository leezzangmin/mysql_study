package zzangmin.MySQL_DEMO.orderbyrand.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item_rand {

    @Id @GeneratedValue
    private Long id;
    private String name;
}
