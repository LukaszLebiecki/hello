package Specifier;

class Charger {
    public void charge(Telephone telephone) {
        telephone.setChargeLevel((telephone.getChargeLevel()) + 1);
    }
}
