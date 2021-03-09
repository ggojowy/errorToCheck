package com.example.springhttp2.domain.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;

public class Praca {
    private long id;
    private String nazwaFirmy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data pracaOd;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data pracaDo;
    private String pozycja;

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public Data getPracaOd() {
        return pracaOd;
    }

    public void setPracaOd(Data pracaOd) {
        this.pracaOd = pracaOd;
    }

    public Data getPracaDo() {
        return pracaDo;
    }

    public void setPracaDo(Data pracaDo) {
        this.pracaDo = pracaDo;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
