package lambdaexamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);

    }
}
