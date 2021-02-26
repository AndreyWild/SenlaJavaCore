package eu.senla.task8.myList;

import eu.senla.task8.comparators.IntegerComparator;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.List;

public class MyArrayList<DataType> extends IntegerComparator implements MyList<DataType> {

    private static int DEFAULT_SIZE = 10; // размер ArrayList по-умолчанию 10
    private static Object[] EMPTY_ARRAY = new Object[]{}; // пустой массив
    private Object[] array; // не инициализированный массив
    private int size = 0; // счетчик для определения размера динамического массива


    /** Дефолтный конструктор создает массив размером 10 */
    public MyArrayList() { array = new Object[DEFAULT_SIZE]; }

    /** Конструктор создает массив с указанным в параметре размером */
    public MyArrayList (int capacity){
        // если объем больше 0. то создаем массив размером capacity
        if (capacity >= 0){array = new Object[capacity];}
        // если capacity = 0, то инициализируем пустой массив
        else if (capacity == 0){array = EMPTY_ARRAY;}
        else {
            System.out.println("ОШИБКА! Ты ввел: " + capacity + ". Число не может быть отрицательным!!!");
        }
    }

    /** Конструктор создает массив на основе вложенного в параметр массива */
    public MyArrayList(MyList<? extends DataType> collection){
        array = collection.toArray(); // массив = массив из параметра
        size = collection.size(); // размер массива = размер массива из параметра
    }

    /** Метод возвращает абстрактный массив на основе массива класса */
    public Object[] toArray(){
        Object[] abstractArray;
        if(size > 0 ){
            abstractArray = new Object[size];
            arrayCopy(array, abstractArray);
            //for (int i = 0; i < size; i++) { abstractArray[i] = array[i]; }
        } else {
            return EMPTY_ARRAY;
        }
        return abstractArray;
    }

    /** Метод для масштабирования */
    private void resizeIfNeeded(){
        if (size == array.length){ // если размер массива равен длинне (заполнен)
            Object[] newArray = new Object[array.length * 2];
            arrayCopy(array, newArray);
            array = newArray;
        }
    }

//    /** Метод для масштабирования */
//    private void resize(int newLength) {
//        Object[] newArray = new Object[newLength]; // создаем массив с указаным размером
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
//        array = newArray;
//        arrayCopy(array, newArray);
//        array = newArray;

//    }

    /** Копирует один массив в другой, убогий обрезанный аналог системного arrayCopy() */
    private void arrayCopy(Object[] array, Object[] newArray){
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
    }

    /** Костыль который жрет память и обрезает массив до размера заполн. ячеек */
    private void capasityTrimer(){
        Object [] newArray = new Object[size];
        for (int i = 0; i <size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    /** Добавляет новый элемент в список. При достижении размера внутреннего массива
     * происходит его увеличение в два раза. */
    @Override
    public void add(DataType object) {
        check();
        resizeIfNeeded();
        // добавляем элемент после заполненных ячеек
        array[size] = object;
        // увеличиваем счетчик
        size++;
        capasityTrimer();
    }

    /** Если массив с 0-м размером, увеличить размер на 1 */
    private void check(){
        if (array.length == 0){
            array = new Object[size+1];
        }
    }

    @Override
    public void add(int index, DataType object) {
        checkIndexIfAdd(index); // прповерка существования индекса
//        if(array.length == size){
            resizeIfNeeded(); // проверка ращмера массива
            carryover(index); // костыль-массив
//        } else{
//            carryover(index);
//        }
        array[index] = object;
        size++;
        capasityTrimer(); // resize массива
    }

    /**  Создает массив с пустой ячейкой под вставку ver 1.0 */
    private void carryover2(int index){
        Object[] newArray = new Object[array.length];
        for (int i = 0; i < index ; i++) {
            newArray[i] = array[i];
        }
        for (int j = index; j < array.length-1; j++) {
            newArray[j + 1] = array[j];
        }
        array = newArray;
    }

    /**  Создает массив с пустой ячейкой под вставку ver 2.0 */
    private void carryover(int index){
        Object[] newArray = new Object[array.length];
        for (int i = 0; i < array.length-1 ; i++) {
            int j = (i < index)? i : i+1; // это решение родилось в больших муках
            newArray[j] = array[i];
        }
        array = newArray;
    }

    /** Проверяет существует ли такой индекс в массиве */
    private void checkIndexIfAdd(int index) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("По индексу - " + index + " добавить объект невозможно ");
    }

    @Override
    public boolean addAll(int index, MyList<? extends DataType> collection) {
        checkIndexIfAdd(index);
        Object [] list = collection.toArray();
        Object[] newArray = new Object[size + collection.size()];

        for (int i = 0; i < array.length ; i++) {
            int j = (i < index)? i : i+collection.size();
            newArray[j] = array[i];
        }
        array = newArray;
        for (int i = 0; i < list.length; i++) {
            array[i+index] = list[i];
        }

        size += list.length;
        return true;
    }

    @Override
    public DataType get(int index) {
        checkIndexIfAdd(index);
        return (DataType) array[index];
    }

    @Override
    public int indexOf(Object object) {
        if(size > 0){
            for (int i = 0; i < size; i++) {
                //return (array[i].equals(object))? i : -1;
                if (array[i].equals(object)){
                    return i;
                }
            }
        } return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        if(size > 0){
            for (int i = size-1; i >= 0 ; i--) {
                if(array[i].equals(object)){
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public ListIterator<DataType> listIterator() {
        return new MyListIterator();
    }

    @Override
    public  <DataType> MyList<DataType> of(DataType... object) {
        MyList<DataType> list = new MyArrayList(); // создаем пустой список
        Stream.of(object).forEach(list::add); // стримом и итератором заполняем новай массив
        return list;
    }

    @Override
    public DataType remove(int index) {
        checkIndexIfAdd(index);
        Object[] newArray = new Object[size - 1];
        DataType oldObj = (DataType)array[index];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != index){
                j = (i < index)? i: i-1;
            } else {continue;}
            newArray[j] = array[i];
        }
        array = newArray;
        size--;
        capasityTrimer();
        return oldObj;
    }

    @Override
    public DataType set(int index, DataType object) {
        checkIndexIfAdd(index);
        DataType oldObj = (DataType)array[index];
        array[index] = object;
        //size--;
        return oldObj;
    }

    @Override  /** ДОДЕЛАТЬ!!!*/
    public void sort(Comparator<? super DataType> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (comparator.compare(get(j - 1), get(j)) < 0) {
                    DataType tmp = (DataType) array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }

    @Override
    public MyList<DataType> subList(int start, int end) {
        checkIndexIfAdd(start);
        checkIndexIfAdd(end);

        MyList <DataType> newArray = new MyArrayList();
        for (int i = start; i <=end ; i++) {
            newArray.add(get(i));
        }
        return newArray;
    }

    @Override
    public int size() { return size; }

    @Override
    public String toString() { return Arrays.toString(array); }

    @Override
    public int getLenght(){ return array.length; }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void clear(){
        size = 0;
        array = new Object[DEFAULT_SIZE];
    }

    /** Возвращает первый элемент массива */
    public DataType getFirst(){
        return (size >0)? (DataType)array[0] : null;
    }

    /** Возвращает полседний элемент массива */
    public DataType getLast(){
        return (size >0)? (DataType)array[size-1] : null;
    }


    private class MyIterator implements Iterator<DataType> {

        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public DataType next() {
            if (cursor >= size) {
                throw new NoSuchElementException();
            }
            return get(cursor++);
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
            if (cursor > 0) {
                cursor--;
            }
        }

        @Override
        public void forEachRemaining(Consumer<? super DataType> action) {
        }
    }

    private class MyListIterator extends MyIterator implements ListIterator<DataType> {

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public DataType previous() {
            if (cursor == 0) {
                throw new NoSuchElementException();
            }
            return get(cursor--);
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void set(DataType e) {
            MyArrayList.this.set(cursor, e);
        }

        @Override
        public void add(DataType e) {
            MyArrayList.this.add(cursor, e);
            cursor++;
        }
    }


}

//https://javarush.ru/groups/posts/2472-podrobnihy-razbor-klassa-arraylist