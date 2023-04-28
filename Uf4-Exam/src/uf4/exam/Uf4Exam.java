package uf4.exam;

import java.util.*;

public class Uf4Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcio = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1.- Alta d'hotels");
            System.out.println("2.- Alta de reserves");
            System.out.println("3.- Carregar compra LIDL a reserva");
            System.out.println("4.- Carregar excursió a reserva");
            System.out.println("5.- Carregar sopar a reserva");
            System.out.println("6.- Sortida de l'hotel");
            System.out.println("0.- Sortir");
            System.out.print("Escull una opció: ");
            opcio = scan.nextInt();
            switch (opcio) {
                case 1:
                    altaHotels();
                    break;
                case 2:
                    altaReserves();
                    break;
                case 3:
                    carregarCompraLidl();
                    break;
                case 4:
                    carregarExcursio();
                    break;
                case 5:
                    carregarSopar();
                    break;
                case 6:
                    sortidaHotel();
                    break;
                case 0:
                    System.out.println("Adéu!");
                    break;
                default:
                    System.out.println("Opció incorrecta");
                    break;
            }
        } while (opcio != 0);
        scan.close();

    }
}
