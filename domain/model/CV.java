package com.example.springhttp2.domain.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CV {

    private String imie;
    private String nazwisko;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataUrodzenia;
    private byte[] zdjecie;
    private Adres adres = new Adres();
    private List<Praca> doswiadczenie = new ArrayList<>();
    private List<Kompetencja> kompetencje = new ArrayList<>();

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<Praca> getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(List<Praca> doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public List<Kompetencja> getKompetencje() {
        return kompetencje;
    }

    public void setKompetencje(List<Kompetencja> kompetencje) {
        this.kompetencje = kompetencje;
    }

    public byte[] getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(byte[] zdjecie) {
        this.zdjecie = zdjecie;
    }
}
