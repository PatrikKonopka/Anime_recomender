package com.example.demo.Perzistent;

import jakarta.persistence.*;

@Entity
@Table(name = "studio")
public class StudioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nazov")
    private String nazov;

    @Column(name = "pocet_vydanych_anime")
    private int pocet_vydanych_anime;

    @Column(name = "hodnotenie")
    private int hodnotenie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPocet_vydanych_anime() {
        return pocet_vydanych_anime;
    }

    public void setPocet_vydanych_anime(int pocet_vydanych_anime) {
        this.pocet_vydanych_anime = pocet_vydanych_anime;
    }

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
    }
}