/*
 * Created by Alexey Yarkov on 27.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

class HeapSort {//Класс для сортировки массива целых чисел с помощью кучи.
    private static int heapSize;//Размер кучи. Изначально равен размеру сортируемого массива

    /**
     * Сначала формируется куча.
     * Теперь максимальный элемент массива находится в корне кучи.
     * Его нужно поменять местами с последним элементом и убрать из кучи (уменьшить размер кучи на 1).
     * Теперь в корне кучи находится элемент, который раньше был последним в массиве.
     * Нужно переупорядочить кучу так, чтобы выполнялось основное условие кучи - a[parent]>=a[child].
     * После этого в корне окажется максимальный из оставшихся элементов.
     * Повторить до тех пор, пока в куче не останется 1 элемент
     */
    public static void sort(Motorcycle[] a) {
        buildHeap(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            heapify(a, 0);
        }
    }

    /**
     * Построение кучи.
     * Поскольку элементы с номерами начиная с a.length / 2 + 1 это листья,
     * то нужно переупорядочить поддеревья с корнями в индексах от 0 до a.length / 2
     * (метод heapify вызывать в порядке убывания индексов)
     */
    private static void buildHeap(Motorcycle[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так,
     * чтобы выполнялось основное свойство кучи - a[parent] >= a[child].
     * <p>
     * Motorcycle[] a - массив, из которого сформирована куча
     * int i - корень поддерева, для которого происходит переупорядосивание
     */
    private static void heapify(Motorcycle[] a, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && a[i].getMaxSpeed() < a[l].getMaxSpeed()) {
            largest = l;
        }
        if (r < heapSize && a[largest].getMaxSpeed() < a[r].getMaxSpeed()) {
            largest = r;
        }
        if (i != largest) {
            swap(a, i, largest);
            heapify(a, largest);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     * <p>
     * int i индекс текущего узла кучи
     *
     * @return индекс правого потомка
     */
    private static int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     * <p>
     * int i индекс текущего узла кучи
     *
     * @return индекс левого потомка
     */
    private static int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     * <p>
     * int i индекс первого элемента
     * int j индекс второго элемента
     */
    private static void swap(Motorcycle[] a, int i, int j) {
        Motorcycle temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}