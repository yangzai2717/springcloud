package com.example.authservice.entry;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/31 20:44
 * @Description:
 */
@Entity
public class Role implements GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
