package org.example;

import java.util.Random;

public class Main {

static final int K=50;

public static Random random = new MersenneTwister();

public static void main(String[] args) {
    Graph graph;
    for(int n=100;n<=2000;n+=50){
        graph = new Lollipop(n);
        System.out.print(n+";");
        for(int i=0;i<K;i++)
            System.out.print(graph.getWanderTime(0)+";");
        System.out.println();
    }
}
}