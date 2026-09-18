import org.junit.jupiter.api.Test;
import school.hei.Commande;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoutTotalTest {
    @Test
    void CalculeCoutTotal() {

        Commande commande = new Commande();

        commande.ajout(new Commande(LocalDate.of(2026, 09, 18), ""));

        double result = commande.coutTotal();

        assertEquals(, result);
    }

}
