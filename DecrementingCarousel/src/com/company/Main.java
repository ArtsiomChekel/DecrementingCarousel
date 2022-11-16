package com.company;

public class Main {

    public static void main(String[] args) {
        CarouselRun run = new DecrementingCarousel(7).run();
        System.out.println(run.isFinished());
        System.out.println(run.next());//-1
        System.out.println(run.next()); //-1

        System.out.println(run.isFinished()); //true
        System.out.println( run.next()); //-1
        System.out.println(run.next()); //-1
    }
}
