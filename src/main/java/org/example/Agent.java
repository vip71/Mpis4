package org.example;

public class Agent {
    Node current;
    boolean[] beenThere;

    long covered=0;

    public Agent(Node start, int graphSize){
        beenThere = new boolean[graphSize];
        setCurrent(start);
    }

    public void wander(){
        int i = (int)Math.floor(Main.random.nextDouble()*current.connected.size());
        setCurrent(current.connected.get(i));
    }

    public void setCurrent(Node node){
        if(!beenThere[node.value]){
            beenThere[node.value] = true;
            covered++;
        }
        current = node;
    }

}
