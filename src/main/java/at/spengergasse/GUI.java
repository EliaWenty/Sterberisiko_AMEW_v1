package at.spengergasse;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class GUI extends Application{

    GridPane window = new GridPane();
    TextField eingabeHoehe = new TextField();
    TextField eingabeDruckStaerke = new TextField();
    TextField eingabealter = new TextField();
    Label ergebnis = new Label();
    //Logik logic = new Logik();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button berechnen = new Button("berechnen");

        berechnen.setOnAction(new EventHandler<ActionEvent>(){

                                  public void handle(ActionEvent event){
                                      //TODO
                                      //Methode aufrufen ihr die werte der Textfielder zuweisen
                                      //und das ergebnis dem ergebnis zuweisen
                                      //Ich füg dann noch paar verschönerungssachen ein

                                      /*
                                      try {
                                          ergebnis.setText(logic.SterberisikoMethode(
                                                  Integer.parseInt(eingabeHoehe.getText()),
                                                  Float.valueOf(eingabeDruckStaerke.getText()),
                                                  Integer.parseInt(eingabealter.getText())));
                                      }catch (NullPointerException e){
                                          System.out.println(e);
                                          ergebnis.setText("bitte Werte eingeben");
                                      }
                                      */
                                  }
                              }
        );

        Label kommentarHoehe = new Label("Hoehe (zw. 150cm und 184cm):");
        Label kommentarDruckStaerke = new Label("DruckStaerke (zw. 27.8 und 35.0):");
        Label kommentarAlter = new Label("Alter (zw. 17 und 24):");


        window.add(eingabeHoehe, 1,0);
        window.add(eingabeDruckStaerke, 1,1);
        window.add(eingabealter, 1,2);

        window.add(kommentarHoehe, 0,0);
        window.add(kommentarDruckStaerke, 0,1);
        window.add(kommentarAlter, 0,2);

        window.add(berechnen, 0,3);
        window.add(ergebnis, 0,4);


        primaryStage.setTitle("Sterberisiko");
        primaryStage.setScene(new Scene(window, 330, 130));
        primaryStage.show();
    }
}
