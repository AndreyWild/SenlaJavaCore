package eu.senla.task1;

public class Numbers <T> {
    private T value;
    public Numbers(T  value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "-={[" + value + "]}=-";
    }

    private char aChar;
    private Character aWrapperChar;
    private byte aByte;
    private Byte aWrapperByte;
    private short aShort;
    private Short aWrapperShort;
    private int anInt;
    private Integer anWrapperInt;
    private long aLong;
    private Long aWrapperLong;
    private float aFloat;
    private Float aWrapperFloat;
    private double aDouble;
    private Double aWrapperDouble;
    private boolean aBoolean;
    private Boolean aWrapperBoolean;
    private String aString;

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public Character getaWrapperChar() {
        return aWrapperChar;
    }

    public void setaWrapperChar(Character aWrapperChar) {
        this.aWrapperChar = aWrapperChar;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public Byte getaWrapperByte() {
        return aWrapperByte;
    }

    public void setaWrapperByte(Byte aWrapperByte) {
        this.aWrapperByte = aWrapperByte;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public Short getaWrapperShort() {
        return aWrapperShort;
    }

    public void setaWrapperShort(Short aWrapperShort) {
        this.aWrapperShort = aWrapperShort;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public Integer getAnWrapperInt() {
        return anWrapperInt;
    }

    public void setAnWrapperInt(Integer anWrapperInt) {
        this.anWrapperInt = anWrapperInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public Long getaWrapperLong() {
        return aWrapperLong;
    }

    public void setaWrapperLong(Long aWrapperLong) {
        this.aWrapperLong = aWrapperLong;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public Float getaWrapperFloat() {
        return aWrapperFloat;
    }

    public void setaWrapperFloat(Float aWrapperFloat) {
        this.aWrapperFloat = aWrapperFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public Double getaWrapperDouble() {
        return aWrapperDouble;
    }

    public void setaWrapperDouble(Double aWrapperDouble) {
        this.aWrapperDouble = aWrapperDouble;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Boolean getaWrapperBoolean() {
        return aWrapperBoolean;
    }

    public void setaWrapperBoolean(Boolean aWrapperBoolean) {
        this.aWrapperBoolean = aWrapperBoolean;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public double castingVariablesCharToDouble(char value) {
        char c = value;
        System.out.println("Вы ввели char: " + c);
        byte b = (byte) c;
        System.out.println("Преобразовали char в byte: " + b);
        short s = b;
        System.out.println("Преобразовали byte в short: " + s);
        int i = s;
        System.out.println("Преобразовали short в int: " + i);
        long l = i;
        System.out.println("Преобразовали int в long: " + l);
        float f = l;
        System.out.println("Преобразовали long в float: " + f);
        double d = f;
        return d;

    }

    public byte castingVariablesDoubleToByte(double value) {
        double d = value;
        System.out.println("Вы ввели double: " + d);
        float f = (float) d;
        System.out.println("Преобразовали double в float: " + f);
        long l = (long) f;
        System.out.println("Преобразовали float в long: " + l);
        int i = (int) l;
        System.out.println("Преобразовали long в int: " + i);
        short s = (short) i;
        System.out.println("Преобразовали int в short: " + i);
        byte b = (byte) s;
        return b;

    }

}
