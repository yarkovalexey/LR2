/*
 * Created by Alexey Yarkov on 27.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

//Вариант №7
//Предметная область: автосалон.
//Автомобиль описывается следующими параметрами: уникальный идентификатор, марка автомобиля, страна-производитель, год выпуска, объем двигателя, стоимость.
//Создать класс наследник Мотоцикл от класса «Автомобиль», добавить поле максимальная скорость и реализовать метод сортировки по скорости. Пирамидальная сортировка.
public class LR2 {
    public static void main(String[] args) {
        Motorcycle M[] = new Motorcycle[10];
        for (int i = 0; i < 10; i++) {
            M[i] = new Motorcycle(i, "Ява 350", "Россия", 1982 - i, 3, 55000 - i * 2500, 135 - 2 * i);
            System.out.println(M[i].toString());
        }
        System.out.println("#########################################################################\n");
        HeapSort.sort(M);
        for (int i = 0; i < 10; i++) System.out.println(M[i].toString());
    }
}
