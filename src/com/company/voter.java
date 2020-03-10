package com.company;

public class voter {
     private double ssn;
     private String name;
         public void vote(String vote1, String vote2, String vote3){
         var firstvote = vote1;
         var secondvote = vote2;
         var thirdvote = vote3;
     }
     public voter(double voterssn, String votername){
         name = votername;
         ssn = voterssn;
     }
     public String getName(){return name;}
     public double getSSN(){return ssn;}
}
