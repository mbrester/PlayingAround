/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mitch
 */
public class ColorSelectorService {
    public String getCorrectedColor(String color){
        if(color.equals("red")){
            return "blue";
            
        }else if(color.equals("blue")){
            return "green";
        }else if(color.equals("green")){
            return "yellow";
        }else if(color.equals("yellow")){
            return "red";
        }else{
            return "";
        }
        
        
        
    }
}
