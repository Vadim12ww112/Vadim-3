package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<PADOTA> baza = new ArrayList();
        baza.add(new PADOTA("9 класов ", "Програмист", "Нигде", "Зп малая", "Без детей","Любые2","Где-то","Платите"));
        baza.add(new PADOTA("9 класов ", "Пекарь", "Нигде", "Зп Боольшая", "Без детей","Любые","Где-то","1000+"));
        baza.add(new PADOTA("9 класов ", "Каштан", "Нигде", "Страшно", "Без детей","Любые3","Где-то","Макароны на завтрак "));
        baza.add(new PADOTA("9 класов ", "Не указана", "Нигде", "уволили", "Без детей","Любые5","Где-то","Пельмени на ужин"));
        Scanner scanner = new Scanner(System.in);

        byte menu = 0;
        do {
            Menu.mainMenu();
            menu = scanner.nextByte();
            switch (menu) {
                case 1:
                    baza.add(Menu.painADDMenu());
                    break;
                case 2:
                    Menu.printMenu(baza);
                    break;
                case 3:

                System.out.println("Укажите данные для поиска: \n");
                System.out.println(Menu.searchMenu(baza));
                if (Menu.searchMenu(baza) != null) {
                    System.out.println("Если хотите удалить заказ? Нажмите 1 либо же 2 чтобы отменить удаление");
                    int bov = scanner.nextInt();
                    if (bov == 1) {
                        System.out.println("Успешно удалено \n");
                        baza.remove(Menu.searchMenu(baza));
                    } else {
                        System.out.println("Удаление отклонено \n");
                    }
        }
        break;
        case 4:
        System.out.println("Введите данные для поиска: \n");
        System.out.println(Menu.searchMenu(baza));
                    break;

                case 5: {
                    System.out.println("До свидание!");}
                default:
                    System.out.println("FFFF\n");
            }
        }while (menu != 5);
    }
}
/*
*
* File file = new File("./file.txt");
if(file.createNewFile()){
System.out.println("Ваши данные будут записанны в файл");
}else {
System.out.println("Ваши данные уже существует");
}
try (FileReader fileReader = new FileReader(file)){
Scanner fileScanner = new Scanner(fileReader);
if(fileScanner.hasNextLine()){
String str2 = fileScanner.nextLine();
Gson gson = new Gson();
partner = gson.fromJson(str2, ListPartnerov.class);
}
}catch (FileNotFoundException e){
System.out.println("Файл не найден ");}catch (IOException e){

throw new RuntimeException(e);
}
*
*
*
*
*
* case 5: {Gson gson = new Gson();
String str1 = gson.toJson(partner);
try(FileWriter fileWriter = new FileWriter(file)){
fileWriter.write(str1);
System.out.println("Данные успешно записанны! ");
}catch (IOException e){
throw new RuntimeException(e);
}
System.out.println("До свидание!");}*/