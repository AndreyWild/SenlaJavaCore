package eu.senla.task11.myList;

import java.util.Comparator;
import java.util.ListIterator;

public interface MyList<DataType> {

    /**  Добавляет в список по индексу index объект obj */
    void add(int index, DataType object);

    /** Додавляет объект object в конец списка */
    void add(DataType object);

    /** Добавляет в список по индексу index все
     элементы коллекции collection. Если в результате добавления список был изменен, то
     возвращается true, иначе возвращается false */
    boolean addAll(int index, MyList<? extends DataType> collection);

    /** Возвращает объект из списка по индексу index  */
    DataType get(int index);

    /** Возвращает индекс первого вхождения объекта object в список. Если
     объект не найден, то возвращается -1  */
    int indexOf(Object object);

    /** Возвращает индекс последнего вхождения объекта object в список.
     Если объект не найден, то возвращается -1  */
    int lastIndexOf(Object object);

    /** Возвращает объект ListIterator для обхода элементов списка  */
    ListIterator<DataType> listIterator();

    /** Создает из набора элементов объект MyList  */
    <DataType> MyList<DataType> of(DataType... object);

    /** Удаляет объект из списка по индексу index, возвращая при этом
     удаленный объект */
    DataType remove(int index);

    /** Присваивает значение объекта object элементу, который находится по
     индексу index */
    DataType set(int index, DataType object);

    /** Сортирует список с помощью компаратора comparator */
    void sort(Comparator<? super DataType> comparator);

    /** Возвращает новый MyList <DataType>  из указанного диапазона элементов, с start до end,
     * end не включительно */
    MyList<DataType> subList(int start, int end);
//
    /** Возвращает размер массива */
    int size();

    /** Возвращает абствактный массив */
    Object[] toArray();

    /** Возвращает длину массива */
    int getLenght();

    /** Проверяет не пустой ли массив */
    boolean isEmpty();

    /** Очищает массив */
    void clear();

    /** Возвращает первый элемент массива */
    DataType getFirst();

    /** Возвращает полседний элемент массива */
    DataType getLast();




}
