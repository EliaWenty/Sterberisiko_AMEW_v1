package at.spengergasse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void dieStaerkeistgenauaufdemDurchscnitt() {
        Logik tester = new Logik();

        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(150,27.8f,17));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(180,33.8f,17));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(150,29.1f,20));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(180,35.0f,20));

        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(150,27.8f,19));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(180,33.8f,19));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(150,29.1f,24));
        assertEquals("Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.", tester.SterberisikoMethode(180,35.0f,24));
    }

}
