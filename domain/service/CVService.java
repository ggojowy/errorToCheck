package com.example.springhttp2.domain.service;

import com.example.springhttp2.domain.model.CV;
import com.example.springhttp2.domain.model.Kompetencja;
import com.example.springhttp2.domain.model.Praca;
import com.example.springhttp2.utils.IdGenerator;
import org.springframework.stereotype.Service;

@Service
public class CVService {

    private CV cv = new CV();

    public CV getCv() {
        return cv;
    }

    public void update(CV cv, byte[] zdjecie) {
        this.cv.setDataUrodzenia(cv.getDataUrodzenia());
        this.cv.setImie(cv.getImie());
        this.cv.setNazwisko(cv.getNazwisko());
        this.cv.setAdres(cv.getAdres());
        if(zdjecie.length > 0) {
            this.cv.setZdjecie(zdjecie);
        }
    }

    public void addKompetenca(Kompetencja kompetencja){
        kompetencja.setId(IdGenerator.nextId());
        this.cv.getKompetencje().add(kompetencja);
    }
    public void addPraca(Praca praca){
        praca.setId(IdGenerator.nextId());
        this.cv.getDoswiadczenie().add(praca);
    }

    public void removeKompetenca(long id){
        cv.getKompetencje().removeIf(
                kompetencja -> kompetencja.getId() == id
        );
    }

    public void removePraca(long id){
        cv.getDoswiadczenie().removeIf(
                praca -> praca.getId() == id
        );
    }
}
