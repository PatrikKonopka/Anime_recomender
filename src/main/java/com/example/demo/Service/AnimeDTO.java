package com.example.demo.Service;

public class AnimeDTO {
    private int id;
    private String nazov;
    private int rokVydania;
    private String nazovStudio;
    private String nazovZaner;

    public AnimeDTO(int id, String nazov, int rokVydania, String nazovStudio, String nazovZaner) {
        this.id = id;
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.nazovStudio = nazovStudio;
        this.nazovZaner = nazovZaner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

