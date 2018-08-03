package com.self.learning;


import java.util.HashMap;

// Using immutable (String) Vs mutable as key in HashMap

// STRING HASHCODE CACHING

class MyDemo{

@Override
    public int hashCode(){

System.out.println("hashcode method Called");

return super.hashCode();
    }

}

public class stringAsKey {

    public static void main(String[] args){

    HashMap<MyDemo, Integer> inefficientHM = new HashMap<>();

    HashMap<String, Integer> EfficientHM = new HashMap<>();

    MyDemo m = new MyDemo();

        inefficientHM.put(m, 1); // Since key is a mutable object (MyDemo) everytime put(insert) or get
                               // (retrieve) for hashMap is called, hashcode is being recomputed; though hashcode is same everytime

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());

        inefficientHM.get(m);
        System.out.println("hashcode method Called" + m.hashCode());


        EfficientHM.put("aa", 1);  // Since key is an immutable object (String) everytime put(insert) or get
                                    // (retrieve) for hashMap is called, hashcode is NOT being recomputed; though hashcode is same
                                    //  everytime; it saves a lot of time.

        EfficientHM.get("aa");

        EfficientHM.get("aa");

        EfficientHM.get("aa");

        EfficientHM.get("aa");

        EfficientHM.get("aa");



    }




}
