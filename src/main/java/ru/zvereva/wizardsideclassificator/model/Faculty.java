package ru.zvereva.wizardsideclassificator.model;

public enum Faculty {

    GRYFFINDOR ( 0.1 ),
    HUFFLEPUFF ( 0.1 ),
    RAVENCLAW ( 0.2 ),
    SLYTHERIN ( 0.5 );

    private final double forceOfImpact;

    Faculty(double forceOfImpact){
        this.forceOfImpact = forceOfImpact;
    }

    public double getForceOfImpact() { return forceOfImpact; }

}
