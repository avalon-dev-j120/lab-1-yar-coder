package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/*
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /*
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        System.out.println("выполняется Task1");
        int[] array = arrayFactory.getInstance(20);
        System.out.println("array: "+Arrays.toString(array));
        Integer a[]= Numbers.castIntToInteger(array);
        System.out.println("Integer array: "+Arrays.toString(a));
        double min = Numbers.min(a);
        double max = Numbers.max(a);
        double avg = Numbers.avg(a);
        
        System.out.println("min="+min);
        System.out.println("max="+max);
        System.out.println("avg="+avg);
        
        System.out.println("");
        Double b[]= Numbers.castIntToDouble(array);
        System.out.println("Double array: "+Arrays.toString(b));
        min = Numbers.min(b);
        max = Numbers.max(b);
        avg = Numbers.avg(b);
        
        System.out.println("min="+min);
        System.out.println("max="+max);
        System.out.println("avg="+avg);
        System.out.println("");
        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
