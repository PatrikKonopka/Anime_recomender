package com.example.demo.Service;

public class ZanerDTO {
    private Long id;
    private String nazov;
    private int pocetAnimeTohtoZanru;
    private String najlepsieHodnoteneAnime;

    public ZanerDTO(Long id, String nazov, int pocetAnimeTohtoZanru, String najlepsieHodnoteneAnime) {
        this.id = id;
        this.nazov = nazov;
        this.pocetAnimeTohtoZanru = pocetAnimeTohtoZanru;
        this.najlepsieHodnoteneAnime = najlepsieHodnoteneAnime;
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

    public int getPocetAnimeTohtoZanru() {
        return pocetAnimeTohtoZanru;
    }

    public void setPocetAnimeTohtoZanru(int pocetAnimeTohtoZanru) {
        this.pocetAnimeTohtoZanru = pocetAnimeTohtoZanru;
    }

    public String getNajlepsieHodnoteneAnime() {
        return najlepsieHodnoteneAnime;
    }

    public void setNajlepsieHodnoteneAnime(String najlepsieHodnoteneAnime) {
        this.najlepsieHodnoteneAnime = najlepsieHodnoteneAnime;
    }
}
