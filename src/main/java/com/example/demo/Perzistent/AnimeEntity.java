package com.example.demo.Perzistent;

import jakarta.persistence.*;

@Entity
@Table(name = "anime")
public class AnimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "názov")
    private String nazov;

    @Column(name = "rok_vydania")
    private int rokVydania;


    @ManyToOne
    @JoinColumn(name = "studio_id", referencedColumnName = "id")
    private StudioEntity studio;

    @ManyToMany
    private Set<ZanerEntity> zanre;

    public int getId() {
        return id;
    }

    public void setId(long id) {
        this.id = this.id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public String getNazovStudio() {
        return nazovStudio;
    }

    public void setNazovStudio(String nazovStudio) {
        this.nazovStudio = nazovStudio;
    }

    public String getNazovZaner() {
        return nazovZaner;
    }

    public void setNazovZaner(String nazovZaner) {
        this.nazovZaner = nazovZaner;
    }

    public StudioEntity getStudio() {
        return studio;
    }

    public void setStudio(StudioEntity studio) {
        this.studio = studio;
    }

    public ZanerEntity getZaner() {
        return zaner;
    }

    public void setZaner(ZanerEntity zaner) {
        this.zaner = zaner;
    }
}