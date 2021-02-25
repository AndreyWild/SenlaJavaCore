package eu.senla.task8;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<DataType> implements MyList<DataType> {

    private static int DEFAULT_SIZE = 10; // размер ArrayList по-умолчанию 10
    private static Object[] EMPTY_ARRAY = new Object[]{}; // пустой массив
    private Object[] array; // не инициализированный массив
    private int size = 0; // счетчик для определения размера динамического массива

    /** Дефолтный конструктор создает массив размером 16 */
    public MyArrayList() { array = new Object[DEFAULT_SIZE]; }



//    public MyArrayList(MyList<? extends DataType> collection){
//        if(collection.size() != 0){array = new Object[collection.size()];}
//
//        for (int i = 0; i < collection.size(); i++) {
//            array[i] = collection.
//
//        }
//    }




    /** Конструктор создает массив с указанным в параметре размером */
    public MyArrayList (int capacity){
        // если объем больше 0. то создаем массив размером capacity, если 0, то пустой массив
        if (capacity >= 0){array = new Object[capacity];}
//        // если capacity = 0, то инициализируем пустой массив
//        else if (capacity == 0){array = EMPTY_ARRAY;}
        else {
            System.out.println("ОШИБКА! Ты ввел: " + capacity + ". Число не может быть отрицательным!!!");
        }

    }


    /** Метод для масштабирования */
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength]; // создаем массив с указаным размером
        System.arraycopy(array, 0, newArray, 0, size);
//        for (int i = 0; i < newArray.length; i++) {
//            array = new Object[newLength]; // инициализируем основной массив с новым размером
//            array[i] = newArray[i];
//        }
    }

    /** Добавляет новый элемент в список. При достижении размера внутреннего массива
     * происходит его увеличение в два раза. */
    @Override
    public void add(DataType object) {
        if (size == array.length - 1)
            resize(array.length * 2); // увеличу в 2 раза, если достигли границ
        array[size++] = object;
//        size++;
    }

    @Override
    public void add(int index, DataType object) {
//        if(array.length.0)
        array[index] = object;
    }

    @Override
    public boolean addAll(int index, Collection<? extends DataType> collection) {
        return false;
    }

    @Override
    public DataType get(int index) {
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
    public <DataType1> MyList<DataType1> of(Object... object) {
        return null;
    }

    @Override
    public DataType remove(int index) {
        Object objects = array[index];
        array[index] = null;
        return (DataType)objects;
    }

    @Override
    public DataType set(int index, DataType object) {
        return null;
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
}
