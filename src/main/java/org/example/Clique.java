package org.example;

public class Clique extends Graph{
    Clique(int n){
        super(n);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                nodes.get(i).connect(nodes.get(j));
            }
        }
    }
}
