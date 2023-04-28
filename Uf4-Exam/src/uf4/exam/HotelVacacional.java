package uf4.exam;

public class HotelVacacional extends Hotel {

    private int numPiscinas;
    private boolean actividadesAcuaticas;
    private String programaEntretenimiento;

    public HotelVacacional(String nombre, String poblacion, int numHabitaciones, double precioBasePersonaNoche, int numPiscinas, boolean actividadesAcuaticas, String programaEntretenimiento) {
        super(nombre, poblacion, numHabitaciones, precioBasePersonaNoche);
        this.numPiscinas = numPiscinas;
        this.actividadesAcuaticas = actividadesAcuaticas;
        this.programaEntretenimiento = programaEntretenimiento;
    }

    public int getNumPiscinas() {
        return numPiscinas;
    }

    public boolean isActividadesAcuaticas() {
        return actividadesAcuaticas;
    }

    public String getProgramaEntretenimiento() {
        return programaEntretenimiento;
    }

    public void setNumPiscinas(int numPiscinas) {
        this.numPiscinas = numPiscinas;
    }

    public void setActividadesAcuaticas(boolean actividadesAcuaticas) {
        this.actividadesAcuaticas = actividadesAcuaticas;
    }

    public void setProgramaEntretenimiento(String programaEntretenimiento) {
        this.programaEntretenimiento = programaEntretenimiento;
    }

    @Override
    public String toString() {
        return "HotelVacacional{"
                + "nombre='" + nombre + '\''
                + ", poblacion='" + poblacion + '\''
                + ", numHabitaciones=" + numHabitaciones
                + ", precioBasePersonaNoche=" + precioBasePersonaNoche
                + ", numPiscinas=" + numPiscinas
                + ", actividadesAcuaticas=" + actividadesAcuaticas
                + ", programaEntretenimiento='" + programaEntretenimiento + '\''
                + '}';
    }
}
