package org.example;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes=new ArrayList<>();

    Graph(int n){
        for(int i = 0; i < n; i++){
            nodes.add(new Node(i));
        }
    }

    public long getWanderTime(int firstNode){
        Agent agent = new Agent(nodes.get(firstNode),nodes.size());
        long t=0;
        while (agent.covered<nodes.size())
        {
            agent.wander();
            t++;
        }
        return t;
    }
}
