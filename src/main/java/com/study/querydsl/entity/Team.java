package com.study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> memberList = new ArrayList<>();

    protected Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(Long id, String name, List<Member> memberList) {
        this.id = id;
        this.name = name;
        this.memberList = memberList;
    }
}
