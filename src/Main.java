public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
        //
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при
        // условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей"
        // с тем количеством месяцев, необходимым для накопления данной суммы.
        System.out.println("Task 1");
        double depositAtPercent = 15000;
        double sum = 0;
        int month = 0;
        while ( sum < 2_459_000 ) {
            sum = (sum + depositAtPercent)+sum/100;
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
        }
        // Задание 2
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //1 2 3 4 5 6 7 8 9 10
        //
        //10 9 8 7 6 5 4 3 2 1
        System.out.println("Task 2");
        int  number = 0;
        while (  number < 10){
            number+=1;
            System.out.print( number+" ");
        }
        System.out.println();
        for(int i =10; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        // что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате
        // "Год …, численность населения составляет … "
        System.out.println("Task 3");
        int y = 12_000_000;
        int fertility = 17;
        int mortality = -8;
        int sumFertility = fertility + mortality;
        for(int i = 1; i <= 10; i++) {
            y += y * sumFertility / 1000;
            System.out.println("Год "+i+" численность населения составляет "+y);
        }
    }
}