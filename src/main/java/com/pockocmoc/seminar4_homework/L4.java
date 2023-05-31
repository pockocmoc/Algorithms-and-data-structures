package com.pockocmoc.seminar4_homework;

public class L4 {

    public static void main(String[] args) {

        Mapa<Integer, String> mapa = new Mapa();
        
        System.out.println("Добавление элементов");
        mapa.put(1, "a");
        System.out.println("Добавлен элемент с ключом: 1, значением: " + mapa.get(1));
        mapa.put(2, "b");
        System.out.println("Добавлен элемент с ключом: 2, значением: " + mapa.get(2));
        mapa.put(3, "c");
        System.out.println("Добавлен элемент с ключом: 3, значением: " + mapa.get(3));
        mapa.put(4, "d");
        System.out.println("Добавлен элемент с ключом: 4, значением: " + mapa.get(4));
        mapa.put(17, "F+1");
        System.out.println("Добавлен элемент с ключом: 17, значением: " + mapa.get(17));
        mapa.put(18, "F+2");
        System.out.println("Добавлен элемент с ключом: 18, значением: " + mapa.get(18));
        mapa.put(33, "F+21");
        System.out.println("Добавлен элемент с ключом: 33, значением: " + mapa.get(33));
        mapa.put(1, "e");
        System.out.println("Добавлен элемент с ключом: 1, значением: " + mapa.get(1));

        System.out.println();

        System.out.println();

        System.out.println("Получить значение по ключу");
        System.out.println(mapa.get(1));
        System.out.println(mapa.get(106));
        System.out.println(mapa.get(33));
        System.out.println(mapa.get(17));
        System.out.println();

        System.out.println("Удаление значения по ключу");
        System.out.println(mapa.remove(106));
        System.out.println(mapa.remove(17));

        System.out.println();

        System.out.println();

        System.out.println("Замена значения по ключу");
        System.out.println("Старое значение элемента с ключом 1: " + mapa.get(1));
        mapa.replace(1, "new e");
        System.out.println("Новое значение с ключом 1 : " + mapa.get(1));

        System.out.println();

        System.out.println();

        System.out.println("Вывод количества элементов таблицы");
        System.out.println("Количество элементов: " + mapa.size());

        System.out.println();

        System.out.println();

        System.out.println("Проверка, содержит ли таблица ключ или значение");
        System.out.println("Содержит ли таблица ключ с значением 1: " + mapa.containsKey(1));
        System.out.println("Содержит ли таблица значение new e: " + mapa.containsValue("new e"));

        System.out.println();

    }
}
