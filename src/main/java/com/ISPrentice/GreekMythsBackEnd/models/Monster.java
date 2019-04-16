package com.ISPrentice.GreekMythsBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monsterName")
    private String monsterName;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "description")
    private String description;

    @JsonIgnoreProperties("monsters")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "monster_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)}
    )
    private ArrayList<Myth> myths;

    public Monster(String monsterName, String shortDescription, String description) {
        this.monsterName = monsterName;
        this.shortDescription = shortDescription;
        this.description = description;
        this.myths = new ArrayList<Myth>();
    }

    public Monster() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Myth> getMyths() {
        return myths;
    }

    public void setMyths(ArrayList<Myth> myths) {
        this.myths = myths;
    }

    public void addMyth(Myth myth){
        this.myths.add(myth);
    }
}
