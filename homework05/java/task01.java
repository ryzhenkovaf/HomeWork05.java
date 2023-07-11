package homework05.java;

// Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

// ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.

import java.util.*;

class task01 {

    public static void main(String[] args) {
        Directory albom = new Directory();
        
        albom.add("Иванов", "321569");
        albom.add("Петров", "123489");
        albom.add("Сидоров", "321654");
        albom.add("Иванов", "987321");
        albom.add("Сергеев", "147963");
        albom.add("Васильев", "963852");
        albom.add("Петров", "123987");
        albom.add("Иванов", "258963");
       
        System.out.println("~~~~~~~~");
        System.out.println("Иванов");
        System.out.println(albom.get("Иванов"));
        System.out.println("~~~~~~~~");
        System.out.println("Васильев");
        System.out.println(albom.get("Васильев"));
        System.out.println("~~~~~~~~");
    }
}
class Directory {
    private Map <String, List <String>> directoryNew = new HashMap<>();
    private List <String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (directoryNew.containsKey(surname)) {
            phoneNumberList = directoryNew.get(surname);
            phoneNumberList.add(phoneNumber);
            directoryNew.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            directoryNew.put(surname, phoneNumberList);
        }
    }
    public List <String> get(String surname) {
        return directoryNew.get(surname);
    }
}