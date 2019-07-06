package IleriProg_DonemOdevi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

class Student {
    int id; String name;
    static List<Student> ogrenciler = new ArrayList<>();
    List<Dosya> dosyalar = new ArrayList<Dosya>();
   
    public Student(String line) {
        String[] a = line.split("\t");
        int k = Integer.parseInt(a[0]);
        id = k; name = a[1]; 
        ogrenciler.add(this);
       }
   
    public String toString() { return name; }
    public int hashCode() { return id; }
    public boolean equals(Object x) {
        if (!(x instanceof Student)) return false;
        Student s = (Student)x; 
        return (s.id == id);
    }
     public void print() {
        System.out.printf("%s  %s ", id, name);
        System.out.println();
    }
}