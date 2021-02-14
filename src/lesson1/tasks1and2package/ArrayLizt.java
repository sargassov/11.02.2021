package lesson1.tasks1and2package;

public class ArrayLizt <T> {

    private int value;
    private T[] array;

    //=====================================
    //2. Написать метод, который преобразует массив в ArrayList;
    //=====================================

    public ArrayLizt(T[] array){
        value = array.length;
        this.array = array;
    }

    public void printIt(){
        for(T t : array){
            System.out.print(t.toString() + " ");
        }
    }

    public void changeEl(int first, int second){
        //=====================================
        //1. Написать метод, который меняет два элемента
        // массива местами.(массив может быть любого ссылочного типа);
        //=====================================
        try{
            if(correctElementToChange(first, second)){
                T temporary = array[first];
                array[first] = array[second];
                array[second] = temporary;
            }
            else throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public boolean correctElementToChange(int first, int second){
        if((first > -1 && first < value) && (second > -1 && second < value)) return true;
        else return false;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        ArrayLizt<String> lizt = new ArrayLizt<>(arr);
        lizt.changeEl(0, 2);
        lizt.printIt();
    }
}
