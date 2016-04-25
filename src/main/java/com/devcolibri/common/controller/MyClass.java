package com.devcolibri.common.controller;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Петро on 29.03.2016.
 */

public class MyClass {
    private int id;
    private  String s;

    public MyClass(String myclass, int id) {
        this.myclass = myclass;
        this.id = id;
    }

    public String getMyclass() {

        return myclass;
    }

    public void setMyclass(String myclass) {
        this.myclass = myclass;
    }

    private  String myclass;

    public MyClass(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void  f (){
        System.out.println("KUKU kukukudsfsd");
    }

    public int[] m1() {
        int mas[] = new int[100000];

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select latitude  from MyDB ");
        List list =  query.setMaxResults(100000).setFirstResult(1).getResultList();
        //list.stream().forEach(System.out::println);

        for(int i = 0; i<list.size();i++){
            //MyDB myDB = (MyDB) list.get(i);
            mas[i]= (Integer) list.get(i);  //myDB.getLatitude();
            // mas[i][1]= (Integer) list.get(i);
            //  System.out.println(mas[i]);          //mas[1][i]=myDB.getLongitude();

            //  System.out.println(myDB.getLatitude()+" - "+myDB.getLongitude()+" -- "+new java.util.Date((long)myDB.getUnixTime()*1000));
        }
        return mas;


    }

    public int[] m2() {
        int mas[] = new int[100000];

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Kuziv1");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select longitude  from MyDB ");
        List list =  query.setMaxResults(100000).setFirstResult(1).getResultList();
        //list.stream().forEach(System.out::println);

        for(int i = 0; i<list.size();i++){
            //MyDB myDB = (MyDB) list.get(i);
            mas[i]= (Integer) list.get(i);  //myDB.getLatitude();
            // mas[i][1]= (Integer) list.get(i);
            //  System.out.println(mas[i]);          //mas[1][i]=myDB.getLongitude();

            //  System.out.println(myDB.getLatitude()+" - "+myDB.getLongitude()+" -- "+new java.util.Date((long)myDB.getUnixTime()*1000));
        }
        return mas;


    }
}

