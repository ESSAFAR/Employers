package org.example.service;

import org.example.model.Employer;

import java.util.Comparator;
import java.util.List;

public class TriParSalaire implements IServiceTriEmployes {
    @Override
    public List<Employer> trier(List<Employer> listeEmployes) {
        listeEmployes.sort(Comparator.comparingDouble(Employer::getSalaire));
        return listeEmployes;
    }
}
