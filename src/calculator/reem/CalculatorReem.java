/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.reem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yakir
 */
public class CalculatorReem extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public float calculator (String n1,String n2, String op){
        float number1 = Float.parseFloat(n1);//12
        float number2 = Float.parseFloat(n2);//3
        float result = 0;
        
        if(op.equals("+")){
            result = number1+number2;
        }else if(op.equals("-")){
            result = number1-number2;
        }else if(op.equals("*")){
            result = number1*number2;
        }else if(op.equals("/")){
            if(number2==0){
                result = 0;
            }else
            result = number1/number2;
        }
        return result;
    }
    
}
