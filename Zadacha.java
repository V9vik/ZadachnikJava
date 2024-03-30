package tutorial;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Zadacha {


    public ArrayList<String> Zadachi= new ArrayList<>();

    public void AddZadachi(String zadacha){
        Zadachi.add(zadacha);
    }
    public void DeleteZadachi(int x){
        Zadachi.remove(x);
    }

}
