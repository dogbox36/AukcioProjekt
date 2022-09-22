import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class scanner {
    public static void main(String[] args) throws IOException {
        var lines = Files.readAllLines(Paths.get("C:\\Users\\domin\\IdeaProjects\\AukcioProjekt\\festmenyek.csv"));
        var paintings = new LinkedList<Festmeny>();

        for (var line: lines) {
            var painting = new Festmeny(line);
            paintings.add(painting);
        }

        System.out.println(paintings);
    }
}
