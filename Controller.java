package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import sun.awt.dnd.SunDropTargetEvent;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Controller {
    @FXML
    private Button sumButton;
    @FXML
    private TextField percTextField1;
    @FXML
    private TextField percTextField2;
    @FXML
    private TextField percTextField3;
    @FXML
    private TextField percTextField4;
    @FXML
    private TextField percTextField5;
    @FXML
    private TextField percTextField6;
    @FXML
    private TextField percTextField7;
    @FXML
    private TextField mlTextField1;
    @FXML
    private TextField mlTextField2;
    @FXML
    private TextField mlTextField3;
    @FXML
    private TextField mlTextField4;
    @FXML
    private TextField mlTextField5;
    @FXML
    private TextField mlTextField6;
    @FXML
    private TextField mlTextField7;
    @FXML
    private TextField kapTextField1;
    @FXML
    private TextField kapTextField2;
    @FXML
    private TextField kapTextField3;
    @FXML
    private TextField kapTextField4;
    @FXML
    private TextField kapTextField5;
    @FXML
    private TextField kapTextField6;
    @FXML
    private TextField kapTextField7;
    @FXML
    private TextField vTextField;
    @FXML
    private TextField pgTextField;
    @FXML
    private TextField vgTextField;
    @FXML
    private TextField nicTextField;
    @FXML
    private TextField aromAllTextField;
    @FXML
    private TextField kapSettingsTextField;
    @FXML
    private TextField mlPGTextField;
    @FXML
    private TextField mlVGTextField;
    @FXML
    private TextField mlNicTextField;
    @FXML
    private TextField kapPGTextField;
    @FXML
    private TextField kapVGTextField;
    @FXML
    private TextField kapNicTextField;
    @FXML
    private TextField nicSettingsTextField;
    @FXML
    private Button clearButton;
    @FXML
    private ComboBox manufCombobox1;
    @FXML
    private ComboBox aromCombobox1;
    @FXML
    private ComboBox manufCombobox2;
    @FXML
    private ComboBox aromCombobox2;
    @FXML
    private ComboBox manufCombobox3;
    @FXML
    private ComboBox aromCombobox3;
    @FXML
    private ComboBox manufCombobox4;
    @FXML
    private ComboBox aromCombobox4;
    @FXML
    private ComboBox manufCombobox5;
    @FXML
    private ComboBox aromCombobox5;
    @FXML
    private ComboBox manufCombobox6;
    @FXML
    private ComboBox aromCombobox6;
    @FXML
    private ComboBox manufCombobox7;
    @FXML
    private ComboBox aromCombobox7;

 
    public void comboChange1(ActionEvent actionEvent) {

        switch (manufCombobox1.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox1.getItems().removeAll(aromCombobox1.getItems());
                aromCombobox1.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox1.getItems().removeAll(aromCombobox1.getItems());
                aromCombobox1.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox1.getItems().removeAll(aromCombobox1.getItems());
                aromCombobox1.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox1.getItems().removeAll(aromCombobox1.getItems());
                aromCombobox1.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox1.getItems().removeAll(aromCombobox1.getItems());
                aromCombobox1.getItems().addAll("Inawerra");
                break;
        }
    }

    public void comboChange2(ActionEvent actionEvent) {
        switch (manufCombobox2.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox2.getItems().removeAll(aromCombobox2.getItems());
                aromCombobox2.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox2.getItems().removeAll(aromCombobox2.getItems());
                aromCombobox2.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox2.getItems().removeAll(aromCombobox2.getItems());
                aromCombobox2.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox2.getItems().removeAll(aromCombobox2.getItems());
                aromCombobox2.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox2.getItems().removeAll(aromCombobox2.getItems());
                aromCombobox2.getItems().addAll("Inawerra");
                break;
        }
    }
    public void comboChange3(ActionEvent actionEvent) {

        switch (manufCombobox3.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox3.getItems().removeAll(aromCombobox3.getItems());
                aromCombobox3.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox3.getItems().removeAll(aromCombobox3.getItems());
                aromCombobox3.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox3.getItems().removeAll(aromCombobox3.getItems());
                aromCombobox3.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox3.getItems().removeAll(aromCombobox3.getItems());
                aromCombobox3.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox3.getItems().removeAll(aromCombobox3.getItems());
                aromCombobox3.getItems().addAll("Inawerra");
                break;
        }
    }
    public void comboChange4(ActionEvent actionEvent) {

        switch (manufCombobox4.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox4.getItems().removeAll(aromCombobox4.getItems());
                aromCombobox4.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox4.getItems().removeAll(aromCombobox4.getItems());
                aromCombobox4.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox4.getItems().removeAll(aromCombobox4.getItems());
                aromCombobox4.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox4.getItems().removeAll(aromCombobox4.getItems());
                aromCombobox4.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox4.getItems().removeAll(aromCombobox4.getItems());
                aromCombobox4.getItems().addAll("Inawerra");
                break;
        }
    }
    public void comboChange5(ActionEvent actionEvent) {

        switch (manufCombobox5.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox5.getItems().removeAll(aromCombobox5.getItems());
                aromCombobox5.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox5.getItems().removeAll(aromCombobox5.getItems());
                aromCombobox5.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox5.getItems().removeAll(aromCombobox5.getItems());
                aromCombobox5.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox5.getItems().removeAll(aromCombobox5.getItems());
                aromCombobox5.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox5.getItems().removeAll(aromCombobox5.getItems());
                aromCombobox5.getItems().addAll("Inawerra");
                break;
        }
    }
    public void comboChange6(ActionEvent actionEvent) {

        switch (manufCombobox6.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox6.getItems().removeAll(aromCombobox6.getItems());
                aromCombobox6.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox6.getItems().removeAll(aromCombobox6.getItems());
                aromCombobox6.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox6.getItems().removeAll(aromCombobox6.getItems());
                aromCombobox6.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox6.getItems().removeAll(aromCombobox6.getItems());
                aromCombobox6.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox6.getItems().removeAll(aromCombobox6.getItems());
                aromCombobox6.getItems().addAll("Inawerra");
                break;
        }
    }
    public void comboChange7(ActionEvent actionEvent) {

        switch (manufCombobox7.getSelectionModel().getSelectedIndex()){
            case 0:
                aromCombobox7.getItems().removeAll(aromCombobox7.getItems());
                aromCombobox7.getItems().addAll("TPA");
                break;
            case 1:
                aromCombobox7.getItems().removeAll(aromCombobox7.getItems());
                aromCombobox7.getItems().addAll("Capella");
                break;
            case 2:
                aromCombobox7.getItems().removeAll(aromCombobox7.getItems());
                aromCombobox7.getItems().addAll("FA");
                break;
            case 3:
                aromCombobox7.getItems().removeAll(aromCombobox7.getItems());
                aromCombobox7.getItems().addAll("FW");
                break;
            case 4:
                aromCombobox7.getItems().removeAll(aromCombobox7.getItems());
                aromCombobox7.getItems().addAll("Inawerra");
                break;
        }
    }
   /* public void comboChange (String listItems) {
        manufCombobox1.setOnAction(event -> {
            //switch (manufCombobox1.getValue()) {

                switch (listItems) {
                case "TPA":
                    aromCombobox1.getItems().addAll("TPA","TPA","TPA");
                    break;
                case "Capella":
                    aromCombobox1.getItems().addAll("Capella");
                    break;
                case "FA":
                    aromCombobox1.getItems().addAll("FA");
                    break;
                case "FW":
                    aromCombobox1.getItems().addAll("FW");
                    break;
                case "Inawerra":
                    aromCombobox1.getItems().addAll("Inawerra");
                    break;
            }
        });

    }*/

   public void sumButtonClick () {
       sumButton.setOnAction(event -> {
           //проверка на пустоту
           if (percTextField1.getText().trim().length() <= 0) {
               percTextField1.setText("0");
           }
           if (percTextField2.getText().trim().length() <= 0) {
               percTextField2.setText("0");
           }
           if (percTextField3.getText().trim().length() <= 0) {
               percTextField3.setText("0");
           }
           if (percTextField4.getText().trim().length() <= 0) {
               percTextField4.setText("0");
           }
           if (percTextField5.getText().trim().length() <= 0) {
               percTextField5.setText("0");
           }
           if (percTextField6.getText().trim().length() <= 0) {
               percTextField6.setText("0");
           }
           if (percTextField7.getText().trim().length() <= 0) {
               percTextField7.setText("0");
           }
                    //замена точки и запятой
                   String aa1 = percTextField1.getText();
                   aa1 = aa1.replace(',', '.');
                   double a1=0;
                   //проверка на ввод буквы String
                   try {
                       a1 = Double.parseDouble(aa1);
                       a1 = Math.abs(a1);
                   }
                   catch (NumberFormatException e){
                       percTextField1.setText("0");
                   }
                   percTextField1.setText(Double.toString(a1));

                   String aa2 = percTextField2.getText();
                   aa2 = aa2.replace(',', '.');
                   double a2 = 0;
                   try {
                       a2 = Double.parseDouble(aa2);
                       a2 = Math.abs(a2);
                   }
                   catch (NumberFormatException e){
                       percTextField2.setText("0");
                   }
                   percTextField2.setText(Double.toString(a2));

                   String aa3 = percTextField3.getText();
                   aa3 = aa3.replace(',', '.');
                   double a3 = 0;
                   try {
                       a3 = Double.parseDouble(aa3);
                       a3 = Math.abs(a3);
                   }
                   catch (NumberFormatException e){
                       percTextField3.setText("0");
                   }
                   percTextField3.setText(Double.toString(a3));

                   String aa4 = percTextField4.getText();
                   aa4 = aa4.replace(',', '.');
                   double a4 = 0;
                   try {
                       a4=Double.parseDouble(aa4);
                       a4 = Math.abs(a4);
                   }catch (NumberFormatException e){
                       percTextField4.setText("0");
                   }
                   percTextField4.setText(Double.toString(a4));

                   String aa5 = percTextField5.getText();
                   aa5 = aa5.replace(',', '.');
                   double a5 = 0;
                   try {
                       a5 = Double.parseDouble(aa5);
                       a5 = Math.abs(a5);
                   }
                   catch (NumberFormatException e){
                       percTextField5.setText("0");
                   }
                   percTextField5.setText(Double.toString(a5));

                   String aa6 = percTextField6.getText();
                   aa6 = aa6.replace(',', '.');
                   double a6 = 0;
                   try {
                       a6=Double.parseDouble(aa6);
                       a6 = Math.abs(a6);
                   }
                   catch (NumberFormatException e){
                       percTextField6.setText("0");
                   }
                   percTextField6.setText(Double.toString(a6));

                   String aa7 = percTextField7.getText();
                   aa7 = aa7.replace(',', '.');
                   double a7 = 0;
                   try {
                       a7=Double.parseDouble(aa7);
                       a7 = Math.abs(a7);
                   }
                   catch (NumberFormatException e){
                       percTextField7.setText("0");
                   }
                   percTextField7.setText(Double.toString(a7));

                   DecimalFormat decimalFormat = new DecimalFormat("#.#"); //округление для double

                   double AromSum = a1 + a2 + a3 + a4 + a5 + a6 + a7;

                   String result = decimalFormat.format(AromSum); //применение округления
                   aromAllTextField.setText(result);

                   double v = Double.parseDouble(vTextField.getText());
                   double b1 = ((v * a1) / 100);
                   String b11 = decimalFormat.format(b1);
                   mlTextField1.setText(b11);
                   double b2 = ((v * a2) / 100);
                   String b22 = decimalFormat.format(b2);
                   mlTextField2.setText(b22);
                   double b3 = ((v * a3) / 100);
                   String b33 = decimalFormat.format(b3);
                   mlTextField3.setText(b33);
                   double b4 = ((v * a4) / 100);
                   String b44 = decimalFormat.format(b4);
                   mlTextField4.setText(b44);
                   double b5 = ((v * a5) / 100);
                   String b55 = decimalFormat.format(b5);
                   mlTextField5.setText(b55);
                   double b6 = ((v * a6) / 100);
                   String b66 = decimalFormat.format(b6);
                   mlTextField6.setText(b66);
                   double b7 = ((v * a7) / 100);
                   String b77 = decimalFormat.format(b7);
                   mlTextField7.setText(b77);

                   double kap = Double.parseDouble(kapSettingsTextField.getText());
                   double c1 = b1 * kap;
                   DecimalFormat decimalFormat2 = new DecimalFormat("#");
                   String c01 = decimalFormat2.format(c1);
                   kapTextField1.setText(c01);

                   double c2 = b2 * kap;
                   String c02 = decimalFormat2.format(c2);
                   kapTextField2.setText(c02);

                   double c3 = b3 * kap;
                   String c03 = decimalFormat2.format(c3);
                   kapTextField3.setText(c03);

                   double c4 = b4 * kap;
                   String c04 = decimalFormat2.format(c4);
                   kapTextField4.setText(c04);

                   double c5 = b5 * kap;
                   String c05 = decimalFormat2.format(c5);
                   kapTextField5.setText(c05);

                   double c6 = b6 * kap;
                   String c06 = decimalFormat2.format(c6);
                   kapTextField6.setText(c06);

                   double c7 = b7 * kap;
                   String c07 = decimalFormat2.format(c7);
                   kapTextField7.setText(c07);

                   double pg = Double.parseDouble(pgTextField.getText());
                   double pgMl = ((pg * v) / 100) - (b1 + b2 + b3 + b4 + b5 + b6 + b7);
                   String pgMl1 = decimalFormat2.format(pgMl);
                   mlPGTextField.setText(pgMl1);

                   double pgKap = (pgMl * kap);
                   String pgKap1 = decimalFormat2.format(pgKap);
                   kapPGTextField.setText(pgKap1);

                   double vg = Double.parseDouble(vgTextField.getText());
                   double vgMl = ((vg * v) / 100);
                   String vgMl1 = decimalFormat2.format(vgMl);
                   mlVGTextField.setText(vgMl1);

                   double vgKap = (vgMl * kap);
                   String vgKap1 = decimalFormat2.format(vgKap);
                   kapVGTextField.setText(vgKap1);

                   double nic = Double.parseDouble(nicTextField.getText());
                   double nicotine = Double.parseDouble(nicSettingsTextField.getText());
                   double nicMl = (((nic * 100) / nicotine) * (v / 100));
                   String nicMl1 = decimalFormat.format(nicMl);
                   mlNicTextField.setText(nicMl1);

                   double nicKap = (nicMl * kap);
                   String nicKap1 = decimalFormat2.format(nicKap);
                   kapNicTextField.setText(nicKap1);


                   //JOptionPane.showMessageDialog(null, "Введен не правильный формат процентов ароматизаторов!!!");



       });
   }

       public void clearButtonClick() {
           clearButton.setOnAction(event -> {
               percTextField1.setText("0");
               percTextField2.setText("0");
               percTextField3.setText("0");
               percTextField4.setText("0");
               percTextField5.setText("0");
               percTextField6.setText("0");
               percTextField7.setText("0");
               mlTextField1.setText("0");
               mlTextField2.setText("0");
               mlTextField3.setText("0");
               mlTextField4.setText("0");
               mlTextField5.setText("0");
               mlTextField6.setText("0");
               mlTextField7.setText("0");
               kapTextField1.setText("0");
               kapTextField2.setText("0");
               kapTextField3.setText("0");
               kapTextField4.setText("0");
               kapTextField5.setText("0");
               kapTextField6.setText("0");
               kapTextField7.setText("0");
               vTextField.setText("30");
               vgTextField.setText("70");
               pgTextField.setText("30");
               nicTextField.setText("0");
               aromAllTextField.setText("0");
               mlPGTextField.setText("0");
               mlVGTextField.setText("0");
               mlNicTextField.setText("0");
               kapPGTextField.setText("0");
               kapVGTextField.setText("0");
               kapNicTextField.setText("0");
           });
       }



}
