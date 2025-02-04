package com.mphasis.MultipleInheritance;
// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods


public class DiamondProblem implements PI3, PI4 {

    // Main driver method
    public static void main(String args[])
    {

        // Creating object of this class
        // in main() method
    	DiamondProblem d = new DiamondProblem();

        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
    }
}