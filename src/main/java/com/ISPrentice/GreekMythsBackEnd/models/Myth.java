package com.ISPrentice.GreekMythsBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
            name = "gods_myths",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "god_id", nullable = false, updatable = false)}
    )
    private List<God> gods;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "titans_myths",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "titan_id", nullable = false, updatable = false)}
    )
    private List<Titan> titans;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "heroes_myths",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "hero_id", nullable = false, updatable = false)}
    )
    private List<Hero> heroes;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "mortals_myths",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "mortal_id", nullable = false, updatable = false)}
    )
    private List<Mortal> mortals;

    @JsonIgnoreProperties("myths")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "monsters_myths",
            joinColumns = {@JoinColumn(name = "myth_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "monster_id", nullable = false, updatable = false)}
    )
    private List<Monster> monsters;

    public Myth(String title, String shortDescription, String description) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.gods = new ArrayList<God>();
        this.titans = new ArrayList<Titan>();
        this.heroes = new ArrayList<Hero>();
        this.mortals = new ArrayList<Mortal>();
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

    public List<God> getGods() {
        return gods;
    }

    public void setGods(List<God> gods) {
        this.gods = gods;
    }

    public List<Titan> getTitans() {
        return titans;
    }

    public void setTitans(List<Titan> titans) {
        this.titans = titans;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public List<Mortal> getMortals() {
        return mortals;
    }

    public void setMortals(List<Mortal> mortals) {
        this.mortals = mortals;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public void addGod(God god) {
        this.gods.add(god);
    }

    public void addTitan(Titan titan) {
        this.titans.add(titan);
    }

    public void addHero(Hero hero) {
        this.heroes.add(hero);
    }

    public void addMortal(Mortal mortal) {
        this.mortals.add(mortal);
    }

    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

}
