package org.example.dao;

import org.example.model.Employer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployerDAO implements IEmployeDAO {
    List<Employer> listeEmployers = new ArrayList<>(Arrays.asList(
            new Employer("Oussama", 7000, 19),
            new Employer("Ahmed", 9000, 21),
            new Employer("Zaid", 6000, 19),
            new Employer("Yassine", 130000, 30)
    ));

    @Override
    public List<Employer> getEmployers() {
        return listeEmployers;
    }
}
