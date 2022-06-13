/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fredvp.statisticalcalculator;

import java.util.ArrayList;

/**
 *
 * @author Feu's m15 R6
 */
public interface Controller {
    
    public abstract float mean();
    public abstract float moda();
    public abstract float median();
    public abstract void standardDeviation();
    public abstract void variation();
    public abstract ArrayList<Float> transformToArray(String sample);
    
}
