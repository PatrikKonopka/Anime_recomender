package com.example.demo.Service;

public class StudioDTO {
    private Long id;
    private String nazov;
    private int pocet_vydanych_anime;
    private int hodnotenie;

    public StudioDTO(Long id, String nazov, int pocet_vydanych_anime, int hodnotenie) {
        this.id = id;
        this.nazov = nazov;
        this.pocet_vydanych_anime = pocet_vydanych_anime;
        this.hodnotenie = hodnotenie;
    }

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