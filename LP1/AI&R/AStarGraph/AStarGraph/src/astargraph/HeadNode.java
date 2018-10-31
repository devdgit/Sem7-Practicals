/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astargraph;

import java.util.ArrayList;
import java.util.Iterator;


public class HeadNode                                           // Adjacency list head node
{
    private String name;                                        // node name
    private int gx;                                             // gx value
    private int hx;                                             // heuristic value hx
    private int fx;                                             // fx = gx+hx value
    private ArrayList<Node> adjnodes = new ArrayList<>();       // Adjacent nodes list
    
    public HeadNode()                                           // Initialize gx,hx and fx to infinity 
    {
        gx=hx=999;
        fx = gx+hx;
    }

    public int getGx() {
        return gx;
    }

    public void setGx(int gx) {                                 // Set gx and update fx accordigly
        this.gx = gx;
        setFx(this.gx+hx);
        System.out.println("\nFx of node "+this.name+" = "+this.fx);
    }

    public int getHx() {                                  
        return hx;
    }

    public void setHx(int hx) {                                 // Set hx and update fx accordingly
        this.hx = hx;
        setFx(this.hx+gx);
    }

    public int getFx() {
        return fx;
    }

    public void setFx(int fx) {
        this.fx = fx;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNodeInfo(String name,int distance)           // Set adjacent node name and distance
    {
        Node n = new Node(name,distance);
        adjnodes.add(n);                                        // Add node to list
    }
 
    public ArrayList getNodeList()
    {
        return adjnodes;
    }
    
    public void displayNodeList()                              // Display adjacent nodes list (name,distance)
    {
                
        Iterator i = adjnodes.iterator();
        if(i.hasNext())
        {
            Node temp= (Node)i.next();
            System.out.print("("+temp.getName()+","+temp.getDistance()+")");
        
        }
        while(i.hasNext())
        {
            Node temp= (Node)i.next();
            System.out.print(", ("+temp.getName()+","+temp.getDistance()+")");
        }
    }
    
}
