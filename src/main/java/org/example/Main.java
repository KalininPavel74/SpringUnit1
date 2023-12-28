package org.example;

/**
 Фреймворк Spring (семинары)
 Урок 1. Системы сборки Maven и Gradle для разработки Java приложений

 Калинин Павел
 28.12.2023

 Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
 Задание:
 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 3. Создайте класс Person с полями firstName, lastName и age.
 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(10); p.setFirstName("adsf"); p.setLastName("VBDF");
        System.out.println(p);
        System.out.println(new Person());

        Gson gson = new Gson();
        String s_json = gson.toJson(p);
        System.out.println("s_json = "+s_json);

        Person p2 = gson.fromJson(s_json, Person.class);
        System.out.println(p2);
        System.out.println(p2.equals(p));

        System.out.println("Hello world!");
    }

}