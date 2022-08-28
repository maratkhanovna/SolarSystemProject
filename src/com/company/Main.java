package com.company;

public class Main {
    public static void main(String[] args) {
        //write your code here
        SolarSystem inception = new SolarSystem();
        inception.sun = 1;
        inception.moon = 1;
        inception.planets = 2;

        System.out.println("the basic structure is ready");


        //developing the feature SUN
        Sun omaro = new Sun();
        omaro.temperature="12334433kj";
        omaro.name="ferro";
        omaro.radius=1234455;
        omaro.color="pink";


        //developing the planet2
        Planet2 superwomen = new Planet2();
        superwomen.size="766585857km";
        superwomen.name="pliea";
        superwomen.color="green";

        //developing planet 1
        Planet1 superplanet = new Planet1();
        superplanet.color = "magenta";
        superplanet.name="hash";
        superplanet.size="545488km";

    }
}
