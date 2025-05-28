
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



public class HorasExatas {
    public static void main(String[] args) {
        
        ZonedDateTime agora = ZonedDateTime.now();
        Locale IdiomaSistema = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss zzzz", IdiomaSistema);
        System.out.println("Hora atual: " + agora.format(formato));
        System.out.println("Hora de codar");
    }
    
}
