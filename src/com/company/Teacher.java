package com.company;

public class Teacher {
    private String numele;
    private String materie;
    private int varsta;
    private double oreZilnice;

    public Teacher(String numele, String materia, int varsta, double oreZilnice){
        this.numele = numele;
        this.materie = materia;
        this.varsta = varsta;
        this.oreZilnice = oreZilnice;

    }

    public void setNumele(String numele) { this.numele = numele; }

    public String getNumele() { return numele;}

    public void setMaterie(String materie) { this.materie = materie; }

    public String getMaterie() { return materie; }

    public void setVarsta(int varsta) { this.varsta = varsta; }

    public int getVarsta() { return varsta; }

    public void setOreZilnice(double oreZilnice) { this.oreZilnice = oreZilnice; }

    public double getOreZilnice() { return oreZilnice; }

    @Override
    public String toString() {
        return ("Numele: " + getNumele() + ";\nMateria: " + getMaterie() + ";\nVarsta: " + getVarsta() +
                ";\nOre Zilnice Predate: " + getOreZilnice() + ".");
    }
}
