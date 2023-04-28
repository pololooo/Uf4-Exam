package uf4.exam;

public class HotelUrba extends Hotel {

    private int numSalons;
    private boolean wifiGratuït;

    public HotelUrba(String nom, String poblacio, int numHabitacions, double preuBase, int numSalons, boolean wifiGratuït) {
        super(nom, poblacio, numHabitacions, preuBase);
        this.numSalons = numSalons;
        this.wifiGratuït = wifiGratuït;
    }

    public int getNumSalons() {
        return numSalons;
    }

    public void setNumSalons(int numSalons) {
        this.numSalons = numSalons;
    }

    public boolean isWifiGratuït() {
        return wifiGratuït;
    }

    public void setWifiGratuït(boolean wifiGratuït) {
        this.wifiGratuït = wifiGratuït;
    }
}
