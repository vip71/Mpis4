package org.example;

public class Tree extends Graph{
    Tree(int n) {
        super(n);

        for(int i=0;i<n;i++){
            if(2*i+1 < n)
                nodes.get(i).connect(nodes.get(2*i+1));
            if(2*i+2 < n)
                nodes.get(i).connect(nodes.get(2*i+2));
        }
    }
}
