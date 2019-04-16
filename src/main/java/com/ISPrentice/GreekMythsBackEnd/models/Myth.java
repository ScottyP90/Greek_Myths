package com.ISPrentice.GreekMythsBackEnd.models;

import com.ISPrentice.GreekMythsBackEnd.Interface.IHumans;
import com.ISPrentice.GreekMythsBackEnd.Interface.IImmortals;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "myths")
public class Myth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "description")
    private String description;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "immortals",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "immortal_id", nullable = false, updatable = false)}
    )
    private ArrayList<IImmortals> immortals;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "humans",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "human_id", nullable = false, updatable = false)}
    )
    private ArrayList<IHumans> humans;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "monsters",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "monster_id", nullable = false, updatable = false)}
    )
    private ArrayList<Monster> monsters;

    public Myth(String title, String shortDescription, String description) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.immortals = new ArrayList<IImmortals>();
        this.humans = new ArrayList<IHumans>();
        this.monsters = new ArrayList<Monster>();
    }

    public Myth() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ArrayList<IImmortals> getImmortals() {
        return immortals;
    }

    public void setImmortals(ArrayList<IImmortals> immortals) {
        this.immortals = immortals;
    }

    public ArrayList<IHumans> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<IHumans> humans) {
        this.humans = humans;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public void addImortal(IImmortals immortal){
        this.immortals.add(immortal);
    }

    public void addHumans(IHumans human){
        this.humans.add(human);
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }
}
