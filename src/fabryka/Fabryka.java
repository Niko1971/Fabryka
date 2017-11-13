package fabryka;

import java.util.Random;

public class Fabryka {

    public enum Typ {

        Zdjecia,
        stronaInformacyjna,
        stronaKontaktowa,
        Aktualnosci
    }

    public static Fabryka noweStrony(int a) {
        int b = a;
        switch (a) {
            case 0:
                return new Zdjecia();
            case 1:
                return new stronaInformacyjna();
            case 2:
                return new stronaKontaktowa();
            case 3:
                return new Aktualnosci();
        }
        throw new IllegalArgumentException("Brak strony");
    }

    public static void main(String[] args) {
        Random randomStrony = new Random();
        int a = randomStrony.nextInt(4);
        noweStrony(a);
    }

}
