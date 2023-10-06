package org.example.service;

import org.example.model.Employer;

import java.util.List;

public class Service {
    IServiceTriEmployes tri;

    public void setTri(IServiceTriEmployes tri) {
        this.tri = tri;
    }

    public List<Employer> trier(List<Employer> employerList){
        return tri.trier(employerList);
    }

}
