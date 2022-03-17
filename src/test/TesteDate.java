package test;

import java.util.Calendar;
import java.util.List;

public class TesteDate {
    public static void main(String[] args) {
        final var calendar = Calendar.getInstance();
        final var hora = calendar.get(Calendar.HOUR_OF_DAY);

        if (hora > 5 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
