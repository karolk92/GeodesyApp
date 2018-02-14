package com.geodezja.model;



public final class Point {
    private final String name;
    private final double x;
    private final double y; 
    
    public Point(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;  
    }
    
    public String getName(){
        return this.name;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    @Override
    public String toString(){
        return "Nr: "  + name + "           X: " + x + "           Y: " + y;
    }
    
}
    
    
   
    
    
    

