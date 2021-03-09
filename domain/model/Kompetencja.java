package com.example.springhttp2.domain.model;

public class Kompetencja {
    private long id;
    private String rodzaj;
    private String nazwa;
    private String doswiadczenie;

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(String doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
