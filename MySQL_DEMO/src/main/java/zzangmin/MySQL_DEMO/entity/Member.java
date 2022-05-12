package zzangmin.MySQL_DEMO.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Member {

    @Id @GeneratedValue
    public Long id;

    public String name;
}
