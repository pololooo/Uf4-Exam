package uf4.exam;

public class HotelVacacional extends Hotel {

    private int numPiscines;
    private boolean activitatsAquàtiques;
    private String programesEntreteniment;

    public HotelVacacional(String nom, String poblacio, int numHabitacions, double preuBase, int numPiscines, boolean activitatsAquàtiques, String programesEntreteniment) {
        super(nom, poblacio, numHabitacions, preuBase);
        this.numPiscines = numPiscines;
        this.activitatsAquàtiques = activitatsAquàtiques;
        this.programesEntreteniment = programesEntreteniment;
    }

    public int getNumPiscines() {
        return numPiscines;
    }

    public void setNumPiscines(int numPiscines) {
        this.numPiscines = numPiscines;
    }

    public boolean isActivitatsAquàtiques() {
        return activitatsAquàtiques;
    }

    public void setActivitatsAquàtiques(boolean activitatsAquàtiques) {
        this.activitatsAquàtiques = activitatsAquàtiques;
    }

    public String getProgramesEntreteniment() {
        return programesEntreteniment;
    }

    public void setProgramesEntreteniment(String programesEntreteniment) {
        this.programesEntreteniment = programesEntreteniment;
    }
}
