package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("qq", 34, "serp");
        Man man2 = new Man("gg", 43, "mosmos");

        Woman wman1 = new Woman("wwP", 18, "right_here");
        Woman wman2 = new Woman("wwB", 25, "right_here_too");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(wman1.name + " " + wman1.age + " " + wman1.address);
        System.out.println(wman2.name + " " + wman2.age + " " + wman2.address);

        // Выведи их на экран тут
    }

    public static class Man
    {
        String name, address;
        int age;

        public Man(String nn, int ag, String addr)
        {
            this.name = nn;
            this.age = ag;
            this.address = addr;

        }

    }

    public static class Woman
    {
        String name, address;
        int age;

        public Woman(String nn, int ag, String addr)
        {
            this.name = nn;
            this.age = ag;
            this.address = addr;

        }

    }
    // Напиши тут свои классы
}
