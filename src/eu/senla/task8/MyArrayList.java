package eu.senla.task8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<DataType> implements MyList<DataType> {

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

    /** Добавляет новый элемент в список. При достижении размера внутреннего массива
     * происходит его увеличение в два раза. */
    @Override
    public boolean add(DataType object) {
        check();
        //if(array.length == 0){}
        resizeIfNeeded();
        // добавляем элемент после заполненных ячеек
        array[size] = object;
        // увеличиваем счетчик
        size++;
        return true;
    }

    private void check(){
        if (array.length == 0){
            array = new Object[size+1];
        }
    }

    @Override
    public void add(int index, DataType object) {
        checkIndexIfAdd(index);
//        if(array.length == size){
            resizeIfNeeded();
            carryover(index);
//        } else{
//            carryover(index);
//        }
        array[index] = object;
        size++;
    }

    /**  Создает массив с пустой ячейкой под вставку */
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

    private void carryover(int index){
        Object[] newArray = new Object[array.length];
        for (int i = 0; i < array.length-1 ; i++) {
            int j = (i < index)? i : i+1; // это решение родилось в больших муках
            newArray[j] = array[i];
        }
        array = newArray;
    }

    private void checkIndexIfAdd(int index) {
        if (index < 0 || index > this.size)
            throw new ArrayIndexOutOfBoundsException("По индексу - " + index + " добавить объект невозможно ");
    }

    @Override
    public boolean addAll(int index, Collection<? extends DataType> collection) {
        return false;
    }

    @Override
    public DataType get(int index) {
        checkIndexIfAdd(index);
        return (DataType) array[index];
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public ListIterator<DataType> listIterator() {
        return null;
    }

    @Override
    public <DataType> MyList<DataType> of(Object... object) {
        return null;
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
        return oldObj;

    }

    @Override
    public DataType set(int index, DataType object) {
        checkIndexIfAdd(index);
        DataType oldObj = (DataType)array[index];
        array[index] = object;
        size--;
        return oldObj;
    }

    @Override
    public void sort(Comparator<? extends DataType> comparator) {

    }

    @Override
    public MyList<DataType> subList(int start, int end) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }




    @Override
    public String toString() { return Arrays.toString(array); }

    @Override
    public int getLenght(){ return array.length; }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}

//https://javarush.ru/groups/posts/2472-podrobnihy-razbor-klassa-arraylist