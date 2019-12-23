package Model.entity;

import Model.Interface.SelfMoveable;
import Model.entity.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class PlayingRoom <T extends Toy> {
    private int capacity;
    private T[] toys;
    private int currentToyPos;

    public PlayingRoom(int capacity) {
        this.capacity = capacity;
        toys = (T[]) new Toy[10];
    }

    public PlayingRoom() {
        this(10);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] sort(Comparator<? super T> comparator) {
        T[] boxCopy = getLen(toys);
        Arrays.sort(boxCopy, comparator);
        return boxCopy;
    }

    public T[] getLen(T[] array) {
        int currentEl = 0;
        for (T elem : array) {
            if (elem != null) {
                currentEl++;
            } else {
                break;
            }
        }
        return Arrays.copyOf(array, currentEl);
    }

    public T[] sortToys(Comparator<? super T> comparator) {
        T[] sortedToys = getLen(toys);
        Arrays.sort(sortedToys, comparator);
        return sortedToys;
    }

    public int getToysPrice() {
        int sum = 0;
        for (T elem : toys) {
            sum += elem.getPrice();
        }
        return sum;
    }

    public T[] getToysByParameters(int price, int size, String color){
        int selectionIndex = 0;
        T[] selectionList = (T[]) new Toy[toys.length];
        for (T elem : toys) {
            if(elem!=null && elem.getPrice()<=price && elem.getColor().equals(color) && elem.getSize().equals(size)) selectionList[selectionIndex++]= elem;
        }
        return getLen(selectionList);
    }

}
