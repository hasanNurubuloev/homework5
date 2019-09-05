package com.company;

public class MagicDoor {
    public MagicDoor ()

    {
        Hero h1 = new Hero();
        h1.health = 250;
        h1.damage = 50;
        h1.superAdults = 80;

        Hero h2 = new Hero();
        h2.health = 250;
        h2.damage = 50;
        h2.superAdults = 80;

        Hero h3 = new Hero();
        h3.health = 250;
        h3.damage = 50;
        h3.superAdults = 80;

        Hero h4 = new Hero();
        h4.health = 250;
        h4.damage = 50;
        h4.superAdults = 80;


        Hero[] heroes = {h1, h2, h3, h4};
    }
}
