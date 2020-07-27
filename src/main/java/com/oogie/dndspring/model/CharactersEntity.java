package com.oogie.dndspring.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "characters", schema = "dungeonsanddragons", catalog = "")
public class CharactersEntity {
    private int id;
    private String charactername;
    private String playername;
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "charactername", nullable = false, length = 30)
    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    @Basic
    @Column(name = "playername", nullable = true, length = 30)
    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    @Basic
    @Column(name = "strength", nullable = true)
    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    @Basic
    @Column(name = "dexterity", nullable = true)
    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    @Basic
    @Column(name = "constitution", nullable = true)
    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    @Basic
    @Column(name = "intelligence", nullable = true)
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Basic
    @Column(name = "wisdom", nullable = true)
    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    @Basic
    @Column(name = "charisma", nullable = true)
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharactersEntity that = (CharactersEntity) o;
        return id == that.id &&
                Objects.equals(charactername, that.charactername) &&
                Objects.equals(playername, that.playername) &&
                Objects.equals(strength, that.strength) &&
                Objects.equals(dexterity, that.dexterity) &&
                Objects.equals(constitution, that.constitution) &&
                Objects.equals(intelligence, that.intelligence) &&
                Objects.equals(wisdom, that.wisdom) &&
                Objects.equals(charisma, that.charisma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, charactername, playername, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
}
