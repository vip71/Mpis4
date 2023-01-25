package org.example;

public class Lollipop extends Graph{

    Lollipop(int n) {
        super(n);

        for(int i = 0; i < (2*n)/3; i++){
            for(int j = 0; j < i; j++){
                nodes.get(i).connect(nodes.get(j));
            }
        }

        for(int i = (2*n)/3; i < n-1; i++){
            nodes.get(i).connect(nodes.get(i+1));
        }

        nodes.get((2*n)/3-1).connect(nodes.get((2*n)/3));
    }
}
