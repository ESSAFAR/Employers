package org.example.model;

public class Employer {
    private String nom;
    private double salaire;
    private int age;

    public Employer(String nom, double salaire, int age) {
        this.nom = nom;
        this.salaire = salaire;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "nom='" + nom + '\'' +
                ", salaire=" + salaire +
                ", age=" + age +
                '}';
    }
}
