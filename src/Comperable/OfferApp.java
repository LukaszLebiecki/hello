package Comperable;

import java.util.Arrays;

public class OfferApp {
    public static void main(String[] args) {
        OfferReader offerReader = new OfferReader();
        offerReader.readWithFile();

        Offer[] offers = offerReader.getOffers();

        Arrays.sort(offers);

        for (Offer offer : offers) {
            System.out.println(offer);
        }
    }
}
