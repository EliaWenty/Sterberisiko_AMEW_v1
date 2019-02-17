package at.spengergasse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void dieStaerkeistgenauaufdemDurchscnitt() {
        Logik tester = new Logik();

        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(150,27.8f,17));

    }

    @Test
    public void normalerBereichunterDurchschnitt1comma5(){
        Logik tester = new Logik();

        assertEquals("Die Stärke Ihres Händedrucks ist im normalen Bereich und liegt 1.5 unter dem Durchschnitt", tester.SterberisikoMethode(160,30.0f,21));
    }

    @Test
    public void kritischerBereich(){
        Logik tester = new Logik();

        assertEquals("Die Stärke Ihres Händedrucks liegt im kritischen Bereich", tester.SterberisikoMethode(180,27.8f,24));
    }

    @Test
    public void normalerBereichueberDurchschnitt0comma5(){
        Logik tester = new Logik();

        assertEquals("Die Stärke Ihres Händedrucks ist im normalen Bereich und liegt 0.5 über dem Durchschnitt", tester.SterberisikoMethode(160,32.0f,24));
    }

    @Test
    public void alterAußerhalb(){
        Logik tester = new Logik();

        assertEquals("Eingegebenes Alter liegt ausserhalb des implementierten Bereichs", tester.SterberisikoMethode(160, 32.0f, 25));
    }

    @Test
    public void hoeheAußerhalb(){
        Logik tester = new Logik();

        assertEquals("Eingegebene Größe liegt ausserhalb des implementierten Wertebereichs!", tester.SterberisikoMethode(200, 32.0f, 20));
    }



}
