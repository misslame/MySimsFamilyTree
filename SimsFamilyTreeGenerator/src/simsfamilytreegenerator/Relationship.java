/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simsfamilytreegenerator;

/**
 *
 * @author Bear
 */
public class Relationship extends FamilyNode{
    private Sim primarySim; 
    private Sim partnerSim; 
    private String relationship;
    
    public String toString() {
        return primarySim.getName() + partnerSim.getName(); 
    }
}
