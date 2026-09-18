import org.junit.jupiter.api.Test;
import school.hei.Commande;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoutTotalTest {
    @Test
    void shouldCalculateTotalExpenses() {

        Commande commande1 = new Commande();

        commande1.ajout(new Commande(LocalDate.now()));

        double result = commande1.coutTotal();

        assertEquals(, result);
    }

}
