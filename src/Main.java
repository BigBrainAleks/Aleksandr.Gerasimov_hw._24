import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temperature1 = 10 ;
        int age1 = 22;
        int temperature2 = -15 ;
        int age2 = 17;
        int temperature3 = 2 ;
        int age3 = 55;
        int temperature4 = 25 ;
        int age4 = 7;
        int temperature5 = -14 ;
        int age5 = 34;
        int temperatureRandom = (int) (Math.random() * 60 - 30);
        int ageRandom = (int) (Math.random() * 100);

//1
        System.out.println("Ваш возраст " + age1 + " " + prefixAge(age1));
        System.out.println("Cегодняшняя температура- " + temperature1 + " " + prefixTemperature(temperature1) );
        int per1 = permission( temperature1, (int) age1);
//2
        System.out.println("Ваш возраст " + age2 + " " + prefixAge(age2));
        System.out.println("Cегодняшняя температура " + temperature2 +  " " + prefixTemperature(temperature2));
        int per2= permission(temperature2, (int) age2);
//3
        System.out.println("Ваш возраст " + age3 + " " + prefixAge(age3));
        System.out.println("Cегодняшняя температура " + temperature3 +  " " + prefixTemperature(temperature3));
        int per3 = permission(temperature3, (int) age3);
//4
        System.out.println("Ваш возраст " + age4 + " " + prefixAge(age4));
        System.out.println("Cегодняшняя температура " + temperature4 +  " " + prefixTemperature(temperature4));
        int per4 = permission(temperature4, (int) age4);
//5
        System.out.println("Ваш возраст " + age5 + " " + prefixAge(age5));
        System.out.println("Cегодняшняя температура " + temperature5 +  " " + prefixTemperature(temperature5));
        int per5 = permission(temperature5, (int) age5);
//Random
        System.out.println("Ваш возраст " + ageRandom + " " + prefixAge(ageRandom));
        System.out.println("Cегодняшняя температура " + temperatureRandom +  " " + prefixTemperature(temperatureRandom));
        int perRandom = permission(temperatureRandom, (int) ageRandom);

    }
//метод возвращаемый с парраметрами
    public static int permission(int temperature, int age) {
        if (age > 20 && age < 45 && temperature > (-20) && temperature < 30) {
            System.out.println("Можно ийдти гулять! " + "\n");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно ийдти гулять! " + "\n");
        } else if (age > 45 && temperature > (-10) && temperature < 25) {
            System.out.println("Можно ийдти гулять! " + "\n");
        } else {
            System.out.println("Оставайтесь дома! " + "\n");
        }
        return 0;

    }
//Метод для префиксов (год, лет, года)
    public static String prefixAge(int age) {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String prefixAge = "";

        if (ageLastNumber == 1)
            prefixAge = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            prefixAge = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            prefixAge = "года";
        if (exclusion)
            prefixAge = "лет";

        return prefixAge;
    }
    public static String prefixTemperature(int temperature) {
        if (temperature<0) {
            temperature = temperature*(-1);
        }
        int ageLastNumber = temperature % 10;
        boolean exclusion = (temperature % 100 >= 11) && (temperature % 100 <= 14);
        String prefixTemperature = "";

        if (ageLastNumber == 1)
            prefixTemperature = "градус";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            prefixTemperature = "градусов";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            prefixTemperature = "градуса";
        if (exclusion)
            prefixTemperature = "градусов";

        return prefixTemperature;
    }



}