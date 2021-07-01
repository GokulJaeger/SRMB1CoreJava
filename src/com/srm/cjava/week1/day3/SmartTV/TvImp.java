package com.srm.cjava.week1.day3.SmartTV;

public class TvImp implements SmartTvRemote {

    @Override
    public void on() {
        System.out.println("TV on.");
        
    }

    @Override
    public void off() {
        System.out.println("TV off.");
        
    }

    @Override
    public void Youtube(boolean yt) {
        if(yt){
        System.out.println("Youtube on.");
        }else{
            System.out.println("Youtube off.");
        }
        
    }

    @Override
    public void Netflix(boolean nf) {
        if(nf){
        System.out.println("Netflix on.");
        }else{
            System.out.println("Netflix off.");
        }
        
    }
}
