package org.example;

import java.util.ArrayList;

public class Node {
    public ArrayList<Node> connected = new ArrayList<>();
    public int value;

    Node(int i){
        this.value=i;
    }

    public void connect(Node other){
        if(other == this)
            return;
        if(!other.connected.contains(this))
            other.connected.add(this);
        if(!connected.contains(other))
            connected.add(other);
    }
}
