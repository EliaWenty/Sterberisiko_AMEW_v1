import java.util.ArrayList;
import java.util.List;

public class Logik {

    //Method that checks if your HGS is too weak for your age and height
    public String SterberisikoMethode(Integer hoehe, Float hgs, Integer alter){
        List<Float> meanHGS1719 = new ArrayList<>(); //List with the mean HGS of 17-19yo
        meanHGS1719.add(27.8f); //150-154cm
        meanHGS1719.add(29.2f); //155-159cm
        meanHGS1719.add(30.2f); //160-164cm
        meanHGS1719.add(31.2f); //165-169cm
        meanHGS1719.add(32.2f); //170-174cm
        meanHGS1719.add(33.0f); //175-179cm
        meanHGS1719.add(33.8f); //180-184cm
        List<Float> meanHGS2024 = new ArrayList<>(); //List with the mean HGS of 20-24yo
        meanHGS2024.add(29.1f); //150-154cm
        meanHGS2024.add(30.2f); //155-159cm
        meanHGS2024.add(31.5f); //160-164cm
        meanHGS2024.add(32.5f); //165-169cm
        meanHGS2024.add(33.4f); //170-174cm
        meanHGS2024.add(34.5f); //175-179cm
        meanHGS2024.add(35.0f); //180-184cm
        List<Float> riskHGS1719 = new ArrayList<>(); //List with the critical HGS of 17-19yo
        riskHGS1719.add(21.6f); //150-154cm
        riskHGS1719.add(22.9f); //155-159cm
        riskHGS1719.add(24.0f); //160-164cm
        riskHGS1719.add(25.0f); //165-169cm
        riskHGS1719.add(26.0f); //170-174cm
        riskHGS1719.add(26.7f); //175-179cm
        riskHGS1719.add(27.6f); //180-184cm
        List<Float> riskHGS2024 = new ArrayList<>(); //List with the critical HGS of 20-24yo
        riskHGS2024.add(23.7f); //150-154cm
        riskHGS2024.add(24.8f); //155-159cm
        riskHGS2024.add(26.1f); //160-164cm
        riskHGS2024.add(27.1f); //165-169cm
        riskHGS2024.add(28.0f); //170-174cm
        riskHGS2024.add(29.0f); //175-179cm
        riskHGS2024.add(29.6f); //180-184cm


        try {
            if (alter >= 17 && alter <= 19) {
                System.out.println("alter zwischen 17 und 19");
                return checkHeights(hoehe, hgs, meanHGS1719, riskHGS1719);
            } else if (alter >= 20 && alter <= 24) {
                System.out.println("alter zwischen 20 und 24");
                return checkHeights(hoehe, hgs, meanHGS2024, riskHGS2024);
            } else {
                return "Eingegebenes Alter liegt ausserhalb des implementierten Bereichs";
            }
        }
        catch (NumberFormatException e){
            return "Bitte geben Sie Ihr Alter als Ganzzahl ein!";
        }
    }

    public String evaluate(Float hgs, Integer index, List<Float> mean, List<Float> risk){
        try {
            if (hgs > risk.get(index)) {
                if (hgs > mean.get(index)) {
                    Float d = hgs - mean.get(index);
                    return "Die Stärke Ihres Händedrucks ist im normalen Bereich und liegt " + d + " über dem Durchschnitt";
                } else if (hgs < mean.get(index)) {
                    Float d = mean.get(index) - hgs;
                    return "Die Stärke Ihres Händedrucks ist im normalen Bereich und liegt " + d + " unter dem Durchschnitt";
                } else {
                    return "Die Stärke Ihres Händedrucks entspricht genau dem Durchschnitt von Personen in Ihrem Alters und mit Ihrer Größe.";
                }
            } else {
                return "Die Stärke Ihres Händedrucks liegt im kritischen Bereich";
            }
        }
        catch (NumberFormatException e){
            return "Ihr HGS hat das falsche Format (sollte eine Kommazahl sein)";
        }
    }
    public String checkHeights(Integer hoehe, Float hgs,  List<Float> mean, List<Float> risk){
        try {
            if (hoehe >= 150 && hoehe <= 154) {
                return evaluate(hgs, 0, mean, risk);
            } else if (hoehe >= 155 && hoehe <= 159) {
                return evaluate(hgs, 1, mean, risk);
            } else if (hoehe >= 160 && hoehe <= 164) {
                return evaluate(hgs, 2, mean, risk);
            } else if (hoehe >= 165 && hoehe <= 169) {
                return evaluate(hgs, 3, mean, risk);
            } else if (hoehe >= 170 && hoehe <= 174) {
                return evaluate(hgs, 4, mean, risk);
            } else if (hoehe >= 175 && hoehe <= 179) {
                return evaluate(hgs, 5, mean, risk);
            } else if (hoehe >= 180 && hoehe <= 184) {
                return evaluate(hgs, 6, mean, risk);
            } else {
                return "Eingegebene Größe liegt ausserhalb des implementierten Wertebereichs!";
            }
        }
        catch (NumberFormatException e){
            return "Bitte geben Sie Ihre Koerpergroeße als Ganzzahl ein!";
        }
    }
}
