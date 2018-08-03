/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.reem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Reem
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label display;
    
    String num1="";
    String num2="";
    String op = "";
    boolean firstNum = true;
    CalculatorReem obj = new CalculatorReem();
    
        
    @FXML
    private void numbersInput(ActionEvent event){
        String in = ((Button)event.getSource()).getText();
        display.setText(display.getText()+in);
        if(firstNum==true)
        num1 += in;
        else
            num2+=in;
    }
    
    @FXML
    private void operatorsInput(ActionEvent event){
        String in = ((Button)event.getSource()).getText();
        display.setText(display.getText()+in);
        if(!in.equals("="))
            op=in;
        firstNum = false;
        
        
        if(in.equals("=")){
            //System.out.println("num1 = "+num1);
            //System.out.println("num2 = "+num2);
            //System.out.println("op = "+op);
            
            float result = obj.calculator(num1,num2,op);
            System.out.println("result = "+result);
            display.setText(result+"");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
