import java.time.LocalDateTime;

public class Festmeny {
    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }

    String cim;
    String festo;
    String stilus;
    int licitekSzama;
    int legmagasabbLicit;
    LocalDateTime legutolsoLicitIdeje;
    boolean elkelt;


}
