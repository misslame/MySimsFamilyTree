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
public class Sim extends FamilyNode {
    private String name; 
    private char sex;
    private String simState;
    private String description;
    private ArrayList<String> traits;
    private ArrayList<SimDetail> careers; 
    private ArrayList<SimDetail> educations;
    private ArrayList<SimDetail> skills; 
    
    public Sim() {
        name = " ";
        sex = ' ';
        simState = " ";
        description = " ";
        traits = null;
        careers = null; 
        educations = null;
        skills = null;
    }
    
    public Sim(String pass_name, 
               char pass_sex, 
               String pass_simState,
               String pass_description,
               ArrayList<String> pass_traits,
               ArrayList<SimDetail> pass_careers,
               ArrayList<SimDetail> pass_educations,
               ArrayList<SimDetail> pass_skills) {
        name = pass_name;
        sex = pass_sex;
        simState = pass_simState;
        description = pass_description;
        traits = pass_traits;
        careers = pass_careers; 
        educations = pass_educations;
        skills = pass_skills; 
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return getName();
    }
   
}


