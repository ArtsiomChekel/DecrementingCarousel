package com.company;
import static com.company.CarouselRun.*;

public class DecrementingCarousel {
   static int[] carousel;
    static int currentElement=0;
   // boolean isRun=false;
    public DecrementingCarousel(int capacity) {
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
       // throw new UnsupportedOperationException();
        if(isRun==true) return false;
        else{
       if(element > 0 && (currentElement <= carousel.length-1)){
           carousel[currentElement] = element;
           currentElement++;
           return true;
       }
       else {
           return false;
       }
        }
    }

    public CarouselRun run(){
       return getInstance();
    }

    public static int length(){
        return carousel.length;
    }
}
