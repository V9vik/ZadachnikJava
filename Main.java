package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zadacha zadachnik = new Zadacha();

        System.out.println("Привет, Это твой задачник тут ты можешь составить задачи!");
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while(x){
            System.out.println("Что ты хочешь сделать? \n 1)Добавить задачу \n 2)Убрать задачу \n 3)Посмотреть задачи \n 4)Выйти из приложения");
            int What = sc.nextInt();
            switch (What){
                case 1:
                    boolean y = true;
                    while(y) {
                        System.out.println("Напиши свою задачу которую хочешь добавить: ");
                        String z = sc.next();
                        zadachnik.AddZadachi(z);
                        System.out.println("Ваша задача написана, что хотите? \n1) Вернуться к выбору \n2) Написать еще задачу ");
                        int Vibor = sc.nextInt();
                        switch (Vibor){
                            case 1:
                                y = false;
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Ошибка");
                        }
                    }break;

                case 2:
                    int i =0;
                    for(String s : zadachnik.Zadachi){
                        i++;
                        System.out.println(i+") "+ (s));
                    }
                    System.out.println("Какое дело вы хотите удалить?: ");
                    int Delet = sc.nextInt();
                    int Leng = zadachnik.Zadachi.size();
                    Delet--;
                    if((Delet<  0 )|| (Delet >= Leng )){
                       System.out.println("Ошибка, такого задачи нету! нету!");
                    }else{


                    zadachnik.DeleteZadachi(Delet);
                    System.out.println("Задача удалена, Список оставшихся дел:");
                    if(zadachnik.Zadachi.size() == 0){
                        System.out.println("Все ваши задача выполнены, Поздравляю!");
                        break;
                    }else {
                        int o =0;
                        for(String s : zadachnik.Zadachi) {
                            o++;
                            System.out.println(o + ") " + (s));
                        }}break;}
                            case 3:
                    int j =0;
                    for(String s : zadachnik.Zadachi){
                        j++;
                        System.out.println(j+") "+ (s));
                    }

                    break;
                case 4:
                    x = false;
                    break;


                default:
                    System.out.println("Какая то ошибка, может вы ввели что то не то?");
            }

        }

    }

}