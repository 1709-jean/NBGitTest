package praktikum01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Praktikum01 extends Application{
    
    public static void main(String[] args){
        launch(args);
    }

    Text jdl = new Text ("Calculating the Circle area");
    Label lblbase = new Label ("Great of Base : ");
    TextField txtbase = new TextField();
    Label lblhigh = new Label ("High Size        : ");
    TextField txthigh = new TextField();
    Label lblmea = new Label("Space of Triangle : ");
    TextField txtmea = new TextField();
    Label lblcreate = new Label ("Created by : \nJeanette Florensia Tiurlina Purba");
    GridPane gp = new GridPane();
    Button btnproses = new Button("Proses");
    Button btnclose = new Button("Close");
    HBox hb1 = new HBox();
    HBox hb2 = new HBox();
    HBox hb3 = new HBox();
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Measuring Triangle");
        Scene sc = new Scene(gp, 500, 400);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        
        jdl.setFont(Font.font("Clarendon Blk BT", FontWeight.NORMAL, 25));
        gp.add(jdl, 0, 0);
        
        lblbase.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txtbase.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txtbase.setMaxWidth(100);
        hb1.getChildren().addAll(lblbase, txtbase);
        hb1.setSpacing(10);
        gp.add(hb1, 0, 1);
        
        lblhigh.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txthigh.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txthigh.setMaxWidth(100);
        hb2.getChildren().addAll(lblhigh, txthigh, btnproses);
        hb2.setSpacing(10);
        gp.add(hb2, 0, 2);
        
        lblmea.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txtmea.setFont(Font.font("Georgia", FontWeight.NORMAL, 20));
        txtmea.setMaxWidth(100);
        hb3.getChildren().addAll(lblmea, txtmea);
        hb3.setSpacing(10);
        gp.add(hb3, 0, 3);
        
        btnproses.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        
        btnclose.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        gp.add(btnclose, 0, 4);
        
        lblcreate.setFont(Font.font("Castellar", FontWeight.NORMAL, 20));
        gp.add(lblcreate, 0, 6);
        
        btnclose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        btnproses.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             double base;
                base = Double.parseDouble(
                        txtbase.getText());
                
            double high;
                high = Double.parseDouble(
                        txthigh.getText());
            
            double space = base* high/2;
            txtmea.setText(String.valueOf(space));
            
            txtbase.requestFocus();
            }
            
        });
        
        primaryStage.setScene(sc);
        primaryStage.show();
    }
    
   
    
}
