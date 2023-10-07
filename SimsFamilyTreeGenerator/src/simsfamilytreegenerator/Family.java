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
public class Family {
    private static Family family = null;
    
    private String name;
    private FamilyNode familyRoot; 
    private ArrayList<Sim> allFamilyMembers;
    
    private Family() {
        name = "";
        familyRoot = null;
        allFamilyMembers = new ArrayList<Sim>();
    }
    
    public static Family getFamily() {
        if(family == null) {
            family = new Family();
        } 
        
        return family;
    }
    
    // Getters: 
    public String getFamilyName() {
        return name;
    }
    
    public ArrayList<Sim> getAllFamilyMembers() {
        return allFamilyMembers;
    }
    
    public void saveFamily(String pass_name, FamilyNode pass_root) {
        name = pass_name;
        familyRoot = pass_root;
    }
    
    public void addFamilyMember(Sim pass_member) {
        allFamilyMembers.add(pass_member);
    }
    
}
