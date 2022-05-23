package zzangmin.MySQL_DEMO.orderbyrand.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item_rand_improved {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int randId; // 여기에 인덱스 생성
}
