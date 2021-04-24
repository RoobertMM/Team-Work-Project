package com.company;

public class Students {
    private String name;
    private String grupa;
    private String curs;
    private float notaSemestriala1;
    private float notaSemestriala2;
    private float mediaAnuala;

    public Students(String name,String grupa,String curs,  float notaSemestriala1, float notaSemestriala2){
        this.name = name;
        this.grupa = grupa;
        this.curs = curs;
        this.notaSemestriala1 = notaSemestriala1;
        this.notaSemestriala2 = notaSemestriala2;
        }
    public String getName() { return name; }
    public String getGrupa() { return grupa; }
    public String getCurs() { return curs; }
    public float getNotaSemestriala1() { return notaSemestriala1; }
    public float getNotaSemestriala2() { return notaSemestriala2;}
    public float getMediaAnuala() { return mediaAnuala; }
    public void mediaAnuala() { mediaAnuala = (notaSemestriala1 + notaSemestriala2)/2; }
}

