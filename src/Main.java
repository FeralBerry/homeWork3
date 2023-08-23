public class Main {
    public static void main(String[] args) {
        // Объявите переменные типа int, byte, short, long, float, double.
        // Название переменных может быть любым, но если состоит из двух слов
        // и более, должно соответствовать правилу camelCase.
        // Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        System.out.println("Задача 1");
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 1.1754943508222875E-38f;
        double doubleVar = 1.7976931348623157E308;
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        System.out.println("\nЗадача 2");
        // Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        // Значения:
        // 27.12
        // 987 678 965 549
        // 2,786
        // 569
        // -159
        // 27897
        // 67
        // 27.12 число с плавующей точкой можно определить как float и double для экономии памяти выбираем float
        float value1 = 27.12f;
        System.out.println("Значение переменной value1 с типом float равно " + value1);
        // максимальное значение int переменных 2147483647, число 987678965549 больше значит объявляем переменную как long
        long value2 = 987678965549L;
        System.out.println("Значение переменной value2 с типом long равно " + value2);
        // 2,786 имеет запятую а не точку поэтому числовые переменные использовать нельзя без конвертации
        String value3 = "2,786";
        System.out.println("Значение переменной value3 с типом String равно " + value3);
        // 569 больше максимального значенияя byte, поэтому используем short
        short value4 = 569;
        System.out.println("Значение переменной value4 с типом short равно " + value4);
        // -159 меньше минимального значения byte, поэтому используем short
        short value5 = -159;
        System.out.println("Значение переменной value5 с типом short равно " + value5);
        // 27897 меньше максимального значения short, можно использовать как int (в случае необходимости операций с числом), так и short
        short value6 = 27897;
        System.out.println("Значение переменной value6 с типом short равно " + value6);
        // 67 умещается в диапозоте чисел byte
        byte value7 = 67;
        System.out.println("Значение переменной value7 с типом byte равно " + value7);

        System.out.println("\nЗадача 3");
        // Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        // У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        // Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        // Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        // Для объявления переменных не используйте тип var.
        var class1 = 23;
        var class2 = 27;
        var class3 = 30;
        var countLists = 480;
        var countListsForOneStudent = countLists / ( class1 + class2 + class3 );
        System.out.println("На каждого ученика рассчитано " + countListsForOneStudent + " листов бумаги");

        System.out.println("\nЗадача 4");
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        // за 20 минут,
        // в сутки,
        // за 3 дня,
        // за 1 месяц?
        // Рассчитывайте производительность работы машины в том случае, если она работает без перерыва
        // заданный промежуток времени.
        // Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        // Для объявления переменных не используйте тип var.
        var bottlesInTwoMinutes = 16;
        var firstWorkingTime = 20;
        var secondWorkingTime = 24 * 60;
        var thirdWorkingTime = 24 * 60 * 3;
        var fourthWorkingTime = 24 * 60 * 30;
        var countBottles = 0;

        System.out.println("\nПервый промежуток времени работы машины 20 минут: ");
        countBottles = ( bottlesInTwoMinutes / 2 ) * firstWorkingTime;
        System.out.println("За 20 минут машина произвела " + countBottles + " штук бутылок");

        System.out.println("\nВторой промежуток времени работы машины сутки: ");
        countBottles = ( bottlesInTwoMinutes / 2 ) * secondWorkingTime;
        System.out.println("За сутки машина произвела " + countBottles + " штук бутылок");

        System.out.println("\nТретий промежуток времени работы машины 3 дня: ");
        countBottles = ( bottlesInTwoMinutes / 2 ) * thirdWorkingTime;
        System.out.println("За 3 дня машина произвела " + countBottles + " штук бутылок");

        System.out.println("\nЧетвертый промежуток времени работы машины 1 месяц: ");
        countBottles = ( bottlesInTwoMinutes / 2 ) * fourthWorkingTime;
        System.out.println("За 1 месяц машина произвела " + countBottles + " штук бутылок");

        System.out.println("\nЗадача 5");
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        // Выведите результат задачи в консоль в формате:
        // «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        // Для объявления переменных не используйте тип var.
        var allPots = 120;
        var whitePotsForOneRoom = 2;
        var brownPotsForOneRoom = 4;
        var countClassRoom = allPots / ( whitePotsForOneRoom + brownPotsForOneRoom);
        var countWhitePots = countClassRoom * whitePotsForOneRoom;
        var countBrownPots = countClassRoom * brownPotsForOneRoom;
        System.out.println("В школе, где " + countClassRoom + " классов, нужно " + countWhitePots + " банок белой краски и " + countBrownPots + " банок коричневой краски");

        System.out.println("\nЗадача 6");
        // Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        // Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        // Смешать всё в блендере — и готово.
        // Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        // Результат в граммах и килограммах напечатайте в консоль.
        short bananaWeight = 5 * 80;
        short milkWeight = 105 * 2;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int weightInGrams = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        float weightInKilograms = (float) weightInGrams / 1000;
        System.out.println("Вес завтрака в граммах " + weightInGrams + ".");
        System.out.println("Вес завтрака в килограммах " + weightInKilograms + ".");

        System.out.println("\nЗадача 7");
        // Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории,
        // нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе
        // от 250 до 500 грамм в день.
        // Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день
        // по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        // Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        // Результаты всех подсчетов выведите в консоль.
        short allLostWeight = 7000;
        short minLostWeightPerDay = 250;
        short maxLostWeightPerDay = 500;
        // Если будет худеть на 250 в день
        short numberOfDaysOfWeightLoss = (short) ( allLostWeight / minLostWeightPerDay );
        System.out.println("Если спортсмен будет худеть по 250 грамм в день, то понадобится: " + numberOfDaysOfWeightLoss + " дней.");
        numberOfDaysOfWeightLoss = (short) ( allLostWeight / maxLostWeightPerDay );
        System.out.println("Если спортсмен будет худеть по 500 грамм в день, то понадобится: " + numberOfDaysOfWeightLoss + " дней.");
        numberOfDaysOfWeightLoss = (short) ( allLostWeight / ((maxLostWeightPerDay + numberOfDaysOfWeightLoss) / 2));
        System.out.println("В среднем ему понадобится для похудения: " + numberOfDaysOfWeightLoss + " дней.");

        System.out.println("\nЗадача 8");
        // Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        // Каждый год повышение составляет 10% от текущей зарплаты.
        // К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет
        // для следующих сотрудников:
        // Маша получает 67 760 рублей в месяц.
        // Денис получает 83 690 рублей в месяц.
        // Кристина получает 76 230 рублей в месяц.
        // Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель
        // попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым
        // доходом до и после повышения.
        // Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей.
        // Годовой доход вырос на ... рублей».
        // Создаем переменные с 0 значением
        int salary;
        int changeSalaryPerYear;
        int salaryPerMonth;
        // Задаем переменной значение зарплаты Маши
        salary = 67760;
        salaryPerMonth = salary + ( salary * 10 / 100);
        changeSalaryPerYear = salaryPerMonth * 12 - salary * 12;
        System.out.println("Маша теперь получала: " + salary + ", теперь получает: " + salaryPerMonth + " рублей. Годовой доход вырос на " + changeSalaryPerYear + " рублей");
        // Переопределяем переменную на зарплату Дениса
        salary = 83690;
        salaryPerMonth = salary + ( salary * 10 / 100);
        changeSalaryPerYear = salaryPerMonth * 12 - salary * 12;
        System.out.println("Денис теперь получал: " + salary + ", теперь получает: " + salaryPerMonth + " рублей. Годовой доход вырос на " + changeSalaryPerYear + " рублей");
        // Переопределяем переменную на зарплату Кристины
        salary = 76230;
        salaryPerMonth = salary + ( salary * 10 / 100);
        changeSalaryPerYear = salaryPerMonth * 12 - salary * 12;
        System.out.println("Кристина получала: " + salary + ", теперь получает: " + salaryPerMonth + " рублей. Годовой доход вырос на " + changeSalaryPerYear + " рублей");
    }
}