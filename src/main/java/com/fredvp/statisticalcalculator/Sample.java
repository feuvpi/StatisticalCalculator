/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fredvp.statisticalcalculator;
import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Long.sum;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Feu's m15 R6
 * 
 * tasks:
 * - retrieve string;
 * - transform string into array of floats
 */



public class Sample implements Controller {
    
// ATRIBUTES

private ArrayList<Float> sample;
private float mean; // OK 
private float median; //
private float moda; //
private float standardDeviation; //
private float variance; //


// CONSTRUCTOR

    public Sample(String sample) {
        this.setSample(transformToArray(sample));  
        System.out.println("The entered sample is: " + this.sample);
    }


// GETTERS AND SETTERS

    public ArrayList<Float> getSample() {
        return sample;
    }

    public void setSample(ArrayList<Float> sample) {
        this.sample = sample;
    }

    public float getMean() {
        return mean;
    }

    private void setMean() {
        this.mean = 0;
        this.getSample().forEach(item -> {
            this.mean+=(item/this.getSample().size());
        });
    }

    private float getMedian() {
        return this.median; 
    }

    public void setMedian() {
        if((this.getSample().size()) % 2 == 0){
            int size = this.getSample().size();
            this.median = ((this.getSample().get(size/2-1) + this.getSample().get(size/2)) / 2);
        } else {
            int index = (int) Math.floor((this.getSample().size())/2);
            this.median = this.getSample().get(index);
        };
    }

    public float getModa() {
        return this.moda;
    }

    public void setModa() {
        int maxCount = 0;
        int count = 0;
        float sampleModa = 0;
        //System.out.println("the index 2 is: " + this.getSample().get(2));
        for(int i = 0; i<this.getSample().size(); i++){
            if(count > maxCount){
                maxCount = count;
                System.out.println("max count for " + this.getSample().get(i-1) + " is " + maxCount);
                sampleModa = this.getSample().get(i-1);
        }
            count = 0;
            for(int j = 0; j < this.getSample().size(); j++){
                if(Objects.equals(this.getSample().get(j), this.getSample().get(i))){
                    count++;
                }
            }
    }
        this.moda = sampleModa;
    }

    public float getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(float standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    public float getVariance() {
        return variance;
    }

    public void setVariance(float variance) {
        this.variance = variance;
    }



// ABSTRACT METHODS

    @Override
    public float mean() {
        this.setMean();
        return this.getMean();
    }

    @Override
    public float moda() {
       this.setModa();
       return this.getModa();
    }

    @Override
    public float median() {
        this.setMedian();
        return this.getMedian();
    }

    @Override
    public void standardDeviation() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void variation() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Float> transformToArray(String sample) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String[] stringToArray = sample.split(", ");
        ArrayList<Float> stringToFloatArray = new ArrayList<>();
        for(String strValue : stringToArray) {
            stringToFloatArray.add(Float.valueOf(strValue));
        }
        System.out.println(stringToFloatArray.getClass().getSimpleName());
        System.out.println("-----------------");
        System.out.println(stringToFloatArray);
        return stringToFloatArray;
    }


    
}
