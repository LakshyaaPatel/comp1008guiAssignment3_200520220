package com.example.finalassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class FinalAssignmentController {

    @FXML
    private ColorPicker colorChoices;

    @FXML
    private TextField nameOfStudent;

    @FXML
    private Pane place1;

    @FXML
    private Pane place2;

    @FXML
    private Pane place3;

    @FXML
    private Pane place4;

    @FXML
    private Pane place5;

    @FXML
    private Pane place6;

    @FXML
    private Pane place7;

    @FXML
    private Pane place8;

    @FXML
    private Pane place9;
    @FXML
    private Text student1;

    @FXML
    private Text student2;

    @FXML
    private Text student3;

    @FXML
    private Text student4;

    @FXML
    private Text student5;

    @FXML
    private Text student6;
    @FXML
    private Label errMsg;

    @FXML
    private Text student7;

    @FXML
    private Text student8;

    @FXML
    private Text student9;


    ArrayList<Integer> arrlist = new ArrayList<Integer>(10);

    int count=0;
    int eof=0;


    int randomFunction(int randomnum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(arrlist.contains(ran)){
                continue;
            }else{
                arrlist.add(ran);
//                System.out.println(ran);
                return ran;

            }
        }
    }


    @FXML
    void onAddStudent(ActionEvent event) {
        Random rand = new Random();
        int error=0;
        String name=nameOfStudent.getText();
        Color color= colorChoices.getValue();
//        System.out.println(color);
        int randomnum= rand.nextInt(1,10);

        int randomNum = randomFunction(randomnum);



        if(student1.getText().compareTo(name)==0||student2.getText().compareTo(name)==0||student3.getText().equals(name)
                ||student4.getText().equals(name)||student5.getText().equals(name)||student6.getText().equals(name)||
                student7.getText().equals(name)||student8.getText().equals(name)||student9.getText().equals(name)){
            error=1;
//            int x = arrlist.indexOf(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));
//            arrlist.remove.(x);
        }

        if(color.toString().equals("0xffffffff"))
            error=2;
        if(place1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place8.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(place9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;

        if(name.isEmpty()){
            error=6;
            errMsg.setText("Please enter name");
            errMsg.setVisible(true);
            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        if(error==0){
            count++;
            if(randomNum==1){
                errMsg.setVisible(false);
                place1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student1.setText(name);
                student1.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==2){
                errMsg.setVisible(false);
                place2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student2.setText(name);
                student2.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==3){
                errMsg.setVisible(false);
                place3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student3.setText(name);
                student3.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==4){
                errMsg.setVisible(false);
                place4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student4.setText(name);
                student4.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==5){
                errMsg.setVisible(false);
                place5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student5.setText(name);
                student5.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==6){
                errMsg.setVisible(false);
                place6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student6.setText(name);
                student6.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");eof=20;

                }

            }
            if(randomNum==7){
                errMsg.setVisible(false);
                place7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student7.setText(name);
                student7.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==8){
                errMsg.setVisible(false);
                place8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student8.setText(name);
                student8.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==9){
                errMsg.setVisible(false);
                place9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                student9.setText(name);
                student9.setVisible(true);
//                System.out.println(randomnum);
                if(count==9){
                    errMsg.setVisible(true);
                    errMsg.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }
            }

//            System.out.println(count);


        }

        else if(error==1) {
            errMsg.setText("STUDENT NAME TAKEN!!");
            errMsg.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errMsg.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove((Integer) randomNum);

        }
        else if(error==2) {
            errMsg.setText("INVALID COLOR");
            errMsg.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errMsg.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        else {
            errMsg.setVisible(false);
            errMsg.setText("SEATS ARE FULL!!");
            errMsg.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errMsg.setVisible(true);

        }



    }
    @FXML
    void initialize(){
        student1.setVisible(false);
        student3.setVisible(false);
        student2.setVisible(false);
        student4.setVisible(false);
        student5.setVisible(false);
        student6.setVisible(false);
        student7.setVisible(false);
        student8.setVisible(false);
        student9.setVisible(false);
        errMsg.setVisible(false);
    }


}