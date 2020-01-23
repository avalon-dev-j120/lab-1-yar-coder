package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        System.out.println("Выполняется задача №5");
        final int[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int a: array) {
            list.add(a);
            set.add(a);
            }
        System.out.println("Список: "+list.toString());
        System.out.println("Набор:  "+set.toString());
        /*
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
