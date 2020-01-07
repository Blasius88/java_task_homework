package Schild.Inter;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        ICharQ iQ;
        char ch;
        int i;
        iQ = q1;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Фиксированая очередь ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        System.out.print("Динамическая очередь ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("кольцевая очередь ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
// поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }
// Отоброзить содержимое
        System.out.print("Содержимое кольцевой очереди ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохраненние и использование данных кольцевой очереди ");
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

    }
}

// Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и

    // извлекаемых элементов
    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

// кольцевая очередь
class CircularQueue implements ICharQ {
    private char q[]; // мфассив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    //создаем пустую очередь заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    //поместить символ в очередь
    public void put(char ch) {
        /* Очередь считается полной если индекс putloc на 1 меньше getloc*/
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & getloc == 0)) {
            System.out.println(" - очередь заполненна");
            return;
        }

        putloc++;
        if (putloc == q.length) {
            putloc = 0; // перейти в начало массива
        }
        q[putloc] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("- очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0; //вернуться в начало массива
        return q[getloc];
    }
}

//Динамический очередь
class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
                q = t;
            }
            putloc++;
            q[putloc] = ch;
        }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
