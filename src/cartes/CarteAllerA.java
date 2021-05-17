package cartes;

import cases.Case;

public class CarteAllerA extends CarteDeplacement {

    private Case destination;

    public CarteAllerA(String enonce, boolean caseDepart, Case destination) {
        super(enonce, caseDepart);
        setDestination(destination);
    }

    @Override
    public Case getDestination() {
        return destination;
    }

    public void setDestination(Case destination) {
        if (destination == null)
            throw new IllegalArgumentException("destination ne peut etre un objet null.");
        else
            this.destination = destination;
    }
}