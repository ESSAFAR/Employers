package org.example.service;

import org.example.model.Employer;

import java.util.Comparator;
import java.util.List;

public class TriParNom implements IServiceTriEmployes {
    @Override
    public List<Employer> trier(List<Employer> listeEmployes) {
        listeEmployes.sort(Comparator.comparing(Employer::getNom));
        return listeEmployes;
    }
}
