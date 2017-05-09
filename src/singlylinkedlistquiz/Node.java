/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistquiz;

/**
 *
 * @author s5216
 */
public class Node {
    
    /* Variables declaration */
    protected int element;
    protected Node link;
 
    /*  No-argument Constructor  */
    public Node()
    {
        element = 0;
        link = null;
    }    
    
    /*  Constructor with 2 arguments */
    public Node(int e,Node n)
    {
        element = e;
        link = n;
    }    
    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    } 
    
    /*  Function to set data to current Node  */
    public void setElement(int e) {
        element = e;
    }
    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }  
    
    /*  Function to get data from current Node  */
    public int getElement()
    {
        return element;
    }
    
}
