import java.time.LocalDateTime;

public class Festmeny {
    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }

    public Festmeny(String row) {
        var s = row.split(";");
        this.cim = s[0];
        this.festo = s[1];
        this.stilus = s[2];
    }

    public Festmeny(licit licit) { // interactive constructor cause why the fuck not
        this.cim = licit.prompt("Title");
        this.festo = licit.prompt("Painter");
        this.stilus = licit.prompt("Style");
    }

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }
    public boolean getElkelt(){
        return getElkelt();
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit(int mertek) {
        if (elkelt) {
            System.err.println("Az aukció lezárult.");
            return;
        }

        int perc = (mertek + 100) / 100;
        int osszeg = 100;

        if (licitekSzama > 0) {
            osszeg = (int)(legmagasabbLicit * perc);
        }
        licitekSzama++;
        legmagasabbLicit=osszeg;
        legutolsoLicitIdeje=LocalDateTime.now();
    }
    public void licit() {licit(10);}

    @Override
    public String toString(){
        return String.format("%s: %s (%s)\n%s\n%d$ - %s (összesen: %d db)\n",
                festo, cim, stilus,
                elkelt ? "elkelt" : "nem kelt el",
                legmagasabbLicit,
                legutolsoLicitIdeje == null ? "meg nem volt licit" : legutolsoLicitIdeje.toString(),
                licitekSzama);
    }
}
