import com.assurance.model.AssuranceAutomobile;
import com.assurance.model.AssuranceHabitation;
import com.assurance.model.AssuranceSante;
import com.assurance.model.Devis;
import com.assurance.services.implementations.CalculateurDevis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalculateurDevisTest {

    @InjectMocks
    private CalculateurDevis calculateurDevis;

    @Mock
    private AssuranceAutomobile mockAssuranceAutomobile;

    @Mock
    private AssuranceSante mockAssuranceSante;

    @Mock
    private AssuranceHabitation mockAssuranceHabitation;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCalculerDevisAutomobile() {
        when(mockAssuranceAutomobile.getAgeConducteur()).thenReturn(24);
        when(mockAssuranceAutomobile.getTypeVehicule()).thenReturn("luxe");
        when(mockAssuranceAutomobile.getUtilisation()).thenReturn("professionnelle");
        when(mockAssuranceAutomobile.isHistoriqueConduiteSansSinistre()).thenReturn(false);

        double expectedMontant = 500 * 1.10 * 1.15 * 1.10 * 1.10; // Calculation based on conditions
        Devis devis = calculateurDevis.calculerDevis(mockAssuranceAutomobile);

        assertEquals(expectedMontant, devis.getMontantEstime(), 0.01);
    }

    @Test
    public void testCalculerDevisSante() {
        when(mockAssuranceSante.getAge()).thenReturn(65);
        when(mockAssuranceSante.isAntecedentsMedicaux()).thenReturn(true);
        when(mockAssuranceSante.getTypeCouverture()).thenReturn("premium");

        double expectedMontant = 150 * 1.20 * 1.30 * 1.05;
        Devis devis = calculateurDevis.calculerDevis(mockAssuranceSante);

        assertEquals(expectedMontant, devis.getMontantEstime(), 0.01);
    }

    @Test
    public void testCalculerDevisHabitation() {
        when(mockAssuranceHabitation.getTypeLogement()).thenReturn("maison");
        when(mockAssuranceHabitation.isZoneRisque()).thenReturn(true);
        when(mockAssuranceHabitation.getValeurBien()).thenReturn(250000.0);
        when(mockAssuranceHabitation.isSystemeSecurite()).thenReturn(false);

        double expectedMontant = 300 * 1.02 * 1.05 * 1.10 * 1.15;
        Devis devis = calculateurDevis.calculerDevis(mockAssuranceHabitation);

        assertEquals(expectedMontant, devis.getMontantEstime(), 0.01);
    }
}
