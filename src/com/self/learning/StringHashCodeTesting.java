package com.self.learning;


import java.util.HashMap;

public class StringHashCodeTesting{

    public static void  main(String[] args){

        String str = "hello";

        String strNew = "helloNew";

        int hashCode1 = str.hashCode();

        int hashCode2 = str.hashCode();

        int hashCode3 = str.hashCode();

        int hashCode4 = str.hashCode();


        // though we are trying to compute hashcode for the same string object multiple times, it will always have the same hashcode
        // because hashcode is cached for the object and not being recomputed.

        int hascodeNew = strNew.hashCode();


        System.out.println("hashCode ::" + hashCode1);

        System.out.println("hashCode ::" + hashCode2);

        System.out.println("hashCode ::" + hashCode3);

        System.out.println("hashCode ::" + hashCode4);


        System.out.println("hashCodeNew ::" + hascodeNew);


        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("aa",100);

        int result = hm.get("aa");


        System.out.println("result ::" + result);


    }

    }

