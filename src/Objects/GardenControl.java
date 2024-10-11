package Objects;

public class GardenControl {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        Plant plant3 = new Plant();

        plant1.name = "Paproć";
        plant1.description = "Mała...";
        plant1.waterDemandOnDay = 0.8;

        plant2.name = "Róża";
        plant2.description = "Pojedyncza...";
        plant2.waterDemandOnDay = 0.4;

        plant3.name = "Kaktus";
        plant3.description = "kujący";
        plant3.waterDemandOnDay = 0.1;

        double allDemandOnDay = plant1.waterDemandOnDay + plant2.waterDemandOnDay + plant3.waterDemandOnDay;
        double allDemandOnWeek = allDemandOnDay * 7;
        double allDemandOnYear = allDemandOnDay * 365;

        System.out.println("Dzienne zużycie wody przez wszystkie rośliny: " + allDemandOnDay);
        System.out.println("Tygodniowe: " + allDemandOnWeek);
        System.out.println("Roczne: " + allDemandOnYear);
    }
}
