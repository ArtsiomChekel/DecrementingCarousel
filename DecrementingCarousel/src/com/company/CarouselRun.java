package com.company;

import static com.company.DecrementingCarousel.*;

public class CarouselRun {
    public static CarouselRun instance;
    public static boolean isRun=false;
    public int iterator = 0;
    int valueToRerurn=0;

    private CarouselRun(){}

    public static CarouselRun getInstance(){
        if(instance==null){
            instance = new CarouselRun();
            instance.isRun=true;
            //currentElement--;
            return instance;
        }
       else return null;
    }
    public int next() {
        if(isFinished()==true) return -1;

       if(carousel[iterator]!=0){
           valueToRerurn=carousel[iterator];
           carousel[iterator]--;
           if(iterator!=carousel.length-1){
               iterator++;
           } else iterator=0;
           return valueToRerurn;
       }
       else{
           if(iterator!=carousel.length-1){
               iterator++;
           } else iterator=0;
       }
        return next();

    }

    public boolean isFinished() {
       // throw new UnsupportedOperationException();
        boolean isFinished=false;
        int number=0;
        for(int i = 0; i < carousel.length; i++){
            if(carousel[i]==0){
                number++;
            }
        }
        if(number < carousel.length){
            isFinished=false;
        }
        else if(number == carousel.length){
            isFinished=true;
        }
        return isFinished;
    }

}
