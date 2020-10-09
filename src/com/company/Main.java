package com.company;
import java.util.Random;

    public class Main {

        public static void main(String[] args) {
                class Disasters {
                    String names;
                    int damages;

                    Disasters(String givenNames, int givenDamages) {
                        this.names = givenNames;
                        this.damages = givenDamages;
                    }
                }

                class Humans {
                    String name;
                    String gender;
                    int age;
                    int health;
                    boolean dead;
                    int damages;


                    Humans(String givenName, String givenGender, int givenAge, int givenHealth, boolean givenDeath) {
                        this.name = givenName;
                        this.gender = givenGender;
                        this.age = givenAge;
                        this.health = givenHealth;
                        this.dead = givenDeath;
                    }

                    void introduction() {
                        System.out.println("My name is " + this.name);
                        System.out.println("My gender is " + this.gender);
                        System.out.println("My age is " + this.age);
                    }

                    void health_levels() {
                        System.out.println("My health levels are " + this.health);
                    }

                    boolean isDead () {
                        boolean status = false;
                        if (health - damages <= 0) {
                            health = 0;
                            dead = true;
                            status = true;
                            System.out.println("You are dead");
                        }
                        return status;
                    }

                }

                    Humans human1 = new Humans("Tommy", "male", 15, 100, false);
                    human1.introduction();
                    human1.health_levels();
                    human1.isDead();

                    Disasters disaster1 = new Disasters("Hurricane", 70);
                    Disasters disaster2 = new Disasters("Earthquake", 80);
                    Disasters disaster3 = new Disasters("Floods", 90);
                    Disasters disaster4 = new Disasters("Starvation", 30);

                    do {
                        Random rand = new Random();
                        int upperbound = 5;
                        int int_random = rand.nextInt(upperbound);
                        System.out.println("The number printed out is " + int_random);



                        if (int_random == 0) {
                            human1.health = human1.health - disaster1.damages;
                            System.out.println("You've been hit by " +  disaster1.names);
                            human1.health_levels();
                            human1.isDead();
                        } else if (int_random == 1) {
                            human1.health = human1.health - disaster2.damages;
                            System.out.println("You've been hit by " + disaster2.names);
                            human1.health_levels();
                            human1.isDead();
                        } else if (int_random == 2) {
                            human1.health = human1.health - disaster3.damages;
                            human1.health_levels();
                            System.out.println("You've been hit by " + disaster3.names);
                            human1.isDead();
                        } else if (int_random == 3) {
                            human1.health = human1.health - disaster4.damages;
                            System.out.println("You've been hit by " + disaster4.names);
                            human1.health_levels();
                            human1.isDead();
                        }
                    }
                    while (!human1.isDead());
                    System.out.println("Game Over");

                }

                }



