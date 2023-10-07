/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simsfamilytreegenerator;

import java.util.ArrayList;

/**
 *
 * @author Bear
 */
public abstract class FamilyNode {
    private ArrayList<FamilyNode> children; 
 
    public void addChild(FamilyNode childNode) {
        this.children.add(childNode);
    }
    
    public ArrayList<FamilyNode> getChildNodes() {
        return children;
    }
    
}
