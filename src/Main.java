public class Main {
    public static void main(String[] args) {
        //
        System.out.println("Task 1");
        int sawAComet = 79;
        int currentYear = -200;
        int currentYear1 = 100;
        int upToTheCurrentYear = 2022 + currentYear;
        int afterCurrentYear = 2022 + currentYear1;
        for (int year = upToTheCurrentYear; year <= afterCurrentYear;year++ ) {
            if (year % sawAComet == 0 && year % sawAComet == 0) {
                System.out.println(year);
            }
        }
        //
        System.out.println("Task 2");
        int multiplication = 2;
        for(int number = 1;number<=10;number++){
            System.out.println(+multiplication+ "*" +number+"="+(number*multiplication));
        }

    }
}






