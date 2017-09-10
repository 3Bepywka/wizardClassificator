package model;

public enum ExceptionalAbility {

    ABSENT ( 0.0 ),
    METAMORPH ( 0.1 ),
    PARSELMOUTH ( 0.3 );

    public final double forceOfImpact;

    ExceptionalAbility(double forceOfImpact){
        this.forceOfImpact = forceOfImpact;
    }

    public double getForceOfImpact() { return forceOfImpact; }
}
