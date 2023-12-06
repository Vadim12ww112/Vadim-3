//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.example.PADOTA;


public class Menu {

    public static void mainMenu() {
        System.out.println("Выберите действие\n1 - трудо устроится \n2 - Показать все вакансии \n3 - удалить вакансию \n4 - поиск Вакансии\n5 - закрыть программу\n");
    }

    public static void printMenu(ArrayList<PADOTA> zakaz) {
        int i = 1;
        Iterator var2 = zakaz.iterator();

        while(var2.hasNext()) {
            PADOTA baza = (PADOTA)var2.next();
            int var10001 = i++;
            System.out.println(" Вакансия №" + var10001 + "\n" + baza.toString());
        }

    }

    public static PADOTA searchMenu(ArrayList<PADOTA> zakaz) {
        Scanner scanner = new Scanner(System.in);
        PADOTA result = null;
        String textSearch = scanner.nextLine();
        Iterator var4 = zakaz.iterator();

        while(var4.hasNext()) {
            PADOTA baza = (PADOTA)var4.next();
            if (baza.getName().equals(textSearch) || baza.getLastname().equals(textSearch) || baza.getSurname().equals(textSearch) || baza.getPhoneNumber().equals(textSearch) || baza.getOrderss().equals(textSearch) || baza.getOrdersss().equals(textSearch)|| baza.getOrdersssss().equals(textSearch)|| baza.getOrders().indexOf(textSearch) > -1) {
                result = baza;
                break;
            }
        }

        return result;
    }



    public static PADOTA painADDMenu() {
        Scanner scanner = new Scanner(System.in);
        PADOTA azzaza = new PADOTA();
        System.out.println("ведите образование");
        azzaza.setName(scanner.nextLine());
        System.out.println("Введите профессию");
        azzaza.setSurname(scanner.nextLine());
        System.out.println("место и должность последней работы");
        azzaza.setLastname(scanner.nextLine());
        System.out.println("Введите причину увольнения:");
        azzaza.setPhoneNumber(scanner.nextLine());
        System.out.println("семейное положение");
        azzaza.setOrders(scanner.nextLine());
        System.out.println("жилищные условия");
        azzaza.setOrderss(scanner.nextLine());
        System.out.println("контактные координаты:");
        azzaza.setOrdersss(scanner.nextLine());
        System.out.println("требования к будущей работе");
        azzaza.setOrdersssss(scanner.nextLine());
        return azzaza;
    }
}
/*
    public static PotensPartneriEntity searchMenu(ListPartnerov masBook) {
        System.out.println("Введите данные для поиска кондидата: ");
        Scanner scanner = new Scanner(System.in);
        PotensPartneriEntity result = null;
        String textSearch;
        textSearch = scanner.nextLine();
        for (PotensPartneriEntity kniga : masBook.getData()) {
            if (baza.getName().equals(textSearch) || baza.getLastname().equals(textSearch) || baza.getSurname().equals(textSearch) || baza.getPhoneNumber().equals(textSearch) || baza.getOrderss().equals(textSearch) || baza.getOrdersss().equals(textSearch)|| baza.getOrdersssss().equals(textSearch)|| baza.getOrders().indexOf(textSearch)= kniga;
                break;
            }
        }
        System.out.println("Вот, что мне удалось найти: \n" + result);
        return result;



        esult;
}


public static void delete(ListPartnerov partner) {
System.out.println("Введите данные для поиска кондидата: ");
Scanner scanner = new Scanner(System.in);
PotensPartneriEntity result = null;
String textSearch;
textSearch = scanner.nextLine();
for (PotensPartneriEntity kondidat : partner.getData()) {
if (kondidat.getPol().equals(textSearch) ||
kondidat.getRegisNumber().equals(textSearch) ||
kondidat.getRegistYear().equals(textSearch) ||
kondidat.getSvedOsebe().equals(textSearch) ||
kondidat.getTrebovKpart().indexOf(textSearch) > -1) {
result = kondidat;
break;
}
}
System.out.println("Результат вашего поиска: \n" + result+'\n'+"Чтобы удалить нажмите 1 и 2 для отмены");
int b = scanner.nextInt();
if (b==1) partner.getData().remove(result);

}
    */