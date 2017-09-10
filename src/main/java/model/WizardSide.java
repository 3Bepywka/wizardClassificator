package model;

public enum WizardSide {

    BLACK ("Black wizard"),
    WHITE ("White wizard");

    private final String type;

    WizardSide(String type){
        this.type = type;
    }

    public String getType() { return type; }
}
