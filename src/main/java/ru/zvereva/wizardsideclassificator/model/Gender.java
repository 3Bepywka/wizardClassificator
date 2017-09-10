package ru.zvereva.wizardsideclassificator.model;

public enum Gender {

    MALE ( 0.5 ),
    FEMALE ( 0.1 );

    private final double forceOfImpact;

    Gender(double forceOfImpact){
        this.forceOfImpact = forceOfImpact;
    }

    public double getForceOfImpact() { return forceOfImpact; }
}
