package org.example.service;

import org.example.model.Employer;

import java.util.Comparator;
import java.util.List;

public class TriParAge implements IServiceTriEmployes {

    @Override
    public List<Employer> trier(List<Employer> listeEmployes) {
        listeEmployes.sort(Comparator.comparingInt(Employer::getAge));
        return listeEmployes;
    }
}
