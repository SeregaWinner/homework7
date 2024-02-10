public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Здание 1");
        int sum = 2_459_000;
        int postponed = 15000;
        int percent = 100;
        int accumulation = 0;
        int month = 0;
        while (accumulation <= sum) {
            month++;
            accumulation = accumulation + accumulation / percent;
            accumulation = accumulation + postponed;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
        }

        System.out.println("Здание 2");
        int numb = 0;
        while (numb < 10) {
            numb++;
            System.out.print(numb + " ");
        }
        System.out.println();
        {
            numb = 10;
            for (; numb >= 1; )
                System.out.print(numb-- + " ");
        }
        System.out.println();

        System.out.println("Здание 3");
        double totalPopulation = 12_000_000;
        int notch = 1_000;
        int birth = 17;
        int death = 8;
        double populationGrowth = (double) (birth - death) / notch;
        int year = 0;
        while (year < 10) {
            year++;
            totalPopulation = totalPopulation + (totalPopulation * populationGrowth);
            System.out.println("Год " + year + ". Численность населения состовляет " + (int) totalPopulation);
        }


        System.out.println("Здание 4");
        double deposit = 15000D;
        double bid = 7 / 100D;
        month = 0;
        int target = 12_000_000;
        while (deposit <= target) {
            deposit = deposit + deposit * bid;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, deposit);
        }


        System.out.println("Здание 5");
        deposit = 15000D;
        bid = 7 / 100D;
        month = 0;
        target = 12_000_000;
        while (deposit <= target) {
            deposit = deposit + deposit * bid;
            month++;
            if (month % 6 == 0)
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, deposit);
        }


        System.out.println("Здание 6");
        deposit = 15000D;
        bid = 7 / 100D;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            deposit = deposit + deposit * bid;
            month++;
            if (month % 6 == 0)
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, deposit);
        }


        System.out.println("Здание 7");
        int firstFriday = 5;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 8");
        int thisYear = 2024;
        int beforeStart = thisYear - 200;
        int afterStart = thisYear + 100;
        for (year = beforeStart; year <= afterStart; year++) {
            if (year % 79 == 0)
                System.out.println(year);
        }


    }

}