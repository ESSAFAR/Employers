package org.example;

import org.example.dao.EmployerDAO;
import org.example.dao.IEmployeDAO;
import org.example.model.Employer;
import org.example.service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        IEmployeDAO dao = new EmployerDAO();
        List<Employer> employerList = dao.getEmployers();
        Service service = new Service();

        System.out.println("\nTri par age :");
        service.setTri(new TriParAge());
        System.out.println(service.trier(employerList));
        System.out.println("\nTri par nom :");
        service.setTri(new TriParNom());
        System.out.println(service.trier(employerList));
        System.out.println("\nTri par salaire :");
        service.setTri(new TriParSalaire());
        System.out.println(service.trier(employerList));
    }
}