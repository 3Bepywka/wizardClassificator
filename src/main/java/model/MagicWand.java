package model;

public enum MagicWand {

    ASH ( 0.1 ),
    HOLLY ( 0.1 ),
    YEW ( 0.5 ),
    WALNUT ( 0.5 );

    private final double forceOfImpact;

    MagicWand(double forceOfImpact) {
        this.forceOfImpact = forceOfImpact;
    }

    public double getForceOfImpact() { return forceOfImpact;}
}
