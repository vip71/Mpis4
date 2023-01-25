package org.example;

public class Path extends Graph{
    Path(int n){
        super(n);
        for(int i = 0; i < n-1; i++){
                nodes.get(i).connect(nodes.get(i+1));
        }
    }
}
