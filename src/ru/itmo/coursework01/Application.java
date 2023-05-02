package ru.itmo.coursework01;

public class Application {

    public static void main(String[] args) {
        Subscription sub01 = new Subscription(1, Type.ONE_DAY,("2023-05-02"));
        Subscription sub02 = new Subscription(2, Type.ONE_DAY, ("2023-05-02"));
        Subscription sub03= new Subscription(3, Type.ONE_DAY,("2023-05-02"));
        Subscription sub04 = new Subscription(4, Type.ONE_DAY,("2023-05-02"));
        Subscription sub05 = new Subscription(5, Type.ONE_DAY,("2023-04-29"));
        Subscription sub06 = new Subscription(6, Type.ONE_DAY,("2023-04-29"));
        Subscription sub07 = new Subscription(7, Type.ONE_DAY,("2023-04-29"));
        Subscription sub08 = new Subscription(8, Type.MORNING, ("2023-03-05"));
        Subscription sub09 = new Subscription(9, Type.MORNING,("2023-03-05"));
        Subscription sub10 = new Subscription(10, Type.MORNING,("2023-04-05"));
        Subscription sub11 = new Subscription(11, Type.MORNING,("2023-04-05"));
        Subscription sub12 = new Subscription(12, Type.MORNING,("2023-03-05"));
        Subscription sub13 = new Subscription(13, Type.MORNING,("2023-02-05"));
        Subscription sub14 = new Subscription(14, Type.MORNING,("2023-03-05"));
        Subscription sub15 = new Subscription(15, Type.MORNING,("2022-12-05"));
        Subscription sub16 = new Subscription(16, Type.MORNING,("2022-11-05"));
        Subscription sub17 = new Subscription(17, Type.FULL,("2023-04-05"));
        Subscription sub18 = new Subscription(18, Type.FULL,("2023-04-05"));
        Subscription sub19 = new Subscription(19, Type.FULL,("2023-04-05"));
        Subscription sub20 = new Subscription(20, Type.FULL,("2023-04-05"));
        Subscription sub21 = new Subscription(21, Type.FULL,("2023-04-05"));
        Subscription sub22 = new Subscription(22, Type.FULL,("2023-04-05"));
        Subscription sub23 = new Subscription(23, Type.FULL,("2023-04-05"));
        Subscription sub24 = new Subscription(24, Type.FULL,("2023-04-05"));
        Subscription sub25 = new Subscription(25, Type.FULL,("2023-03-05"));
        Subscription sub26 = new Subscription(26, Type.FULL,("2023-02-05"));
        Subscription sub27 = new Subscription(27, Type.FULL,("2023-01-05"));
        Subscription sub28 = new Subscription(28, Type.FULL,("2022-12-05"));
        Subscription sub29 = new Subscription(29, Type.FULL,("2022-12-05"));
        Subscription sub30 = new Subscription(30, Type.FULL,("2022-11-05"));
        Subscription sub31 = new Subscription(31, Type.FULL,("2023-01-05"));
        Subscription sub32 = new Subscription(32, Type.FULL,("2023-01-05"));
        Subscription sub33 = new Subscription(33, Type.FULL,("2023-01-05"));
        Subscription sub34 = new Subscription(34, Type.FULL,("2023-02-05"));
        Subscription sub35 = new Subscription(35, Type.FULL,("2023-02-05"));
        Subscription sub36 = new Subscription(36, Type.FULL,("2023-02-05"));
        Subscription sub37 = new Subscription(37, Type.FULL,("2023-04-05"));
        Subscription sub38 = new Subscription(38, Type.FULL,("2023-03-05"));
        Subscription sub39 = new Subscription(39, Type.FULL,("2023-03-05"));
        Subscription sub40 = new Subscription(40, Type.FULL,("2023-03-05"));

        FitnessClub fitnessClub = new FitnessClub();
        //fitnessClub.training(sub01, FitnessClub.Training.GYM);
        sub10.getInfo();
        System.out.println(sub09.getType().getLimit(sub09.getType()));

       fitnessClub.training(sub02, FitnessClub.Training.POOL);
        fitnessClub.training(sub03, FitnessClub.Training.GROUP);
        fitnessClub.training(sub04, FitnessClub.Training.GYM);
        fitnessClub.training(sub05, FitnessClub.Training.POOL);
        fitnessClub.training(sub06, FitnessClub.Training.GROUP);
        fitnessClub.training(sub07, FitnessClub.Training.GYM);
        fitnessClub.training(sub08, FitnessClub.Training.POOL);
        fitnessClub.training(sub09, FitnessClub.Training.GROUP);
        /*fitnessClub.training(sub10, FitnessClub.Training.GYM);
        fitnessClub.training(sub11, FitnessClub.Training.POOL);
        fitnessClub.training(sub12, FitnessClub.Training.GROUP);
        fitnessClub.training(sub13, FitnessClub.Training.GYM);
        fitnessClub.training(sub14, FitnessClub.Training.POOL);
        fitnessClub.training(sub15, FitnessClub.Training.GROUP);
        fitnessClub.training(sub16, FitnessClub.Training.GYM);
        fitnessClub.training(sub17, FitnessClub.Training.POOL);
        fitnessClub.training(sub18, FitnessClub.Training.GROUP);
        fitnessClub.training(sub19, FitnessClub.Training.GYM);
        fitnessClub.training(sub20, FitnessClub.Training.POOL);
        fitnessClub.training(sub21, FitnessClub.Training.GROUP);
        fitnessClub.training(sub22, FitnessClub.Training.GYM);
        fitnessClub.training(sub23, FitnessClub.Training.POOL);
        fitnessClub.training(sub24, FitnessClub.Training.GROUP);
        fitnessClub.training(sub25, FitnessClub.Training.GYM);
        fitnessClub.training(sub26, FitnessClub.Training.GYM);
        fitnessClub.training(sub27, FitnessClub.Training.GYM);
        fitnessClub.training(sub28, FitnessClub.Training.GYM);
        fitnessClub.training(sub29, FitnessClub.Training.GYM);
        fitnessClub.training(sub30, FitnessClub.Training.GYM);
        fitnessClub.training(sub31, FitnessClub.Training.GYM);
        fitnessClub.training(sub32, FitnessClub.Training.GYM);
        fitnessClub.training(sub33, FitnessClub.Training.GYM);
        fitnessClub.training(sub34, FitnessClub.Training.GYM);
        fitnessClub.training(sub35, FitnessClub.Training.GYM);
        fitnessClub.training(sub36, FitnessClub.Training.GYM);
        fitnessClub.training(sub37, FitnessClub.Training.GYM);
        fitnessClub.training(sub38, FitnessClub.Training.GYM);
        fitnessClub.training(sub39, FitnessClub.Training.GYM);
        fitnessClub.training(sub40, FitnessClub.Training.GYM);
        fitnessClub.training(sub31, FitnessClub.Training.GYM);
        fitnessClub.training(sub32, FitnessClub.Training.GYM);
        fitnessClub.training(sub33, FitnessClub.Training.GYM);
        fitnessClub.training(sub34, FitnessClub.Training.GYM);
        fitnessClub.training(sub35, FitnessClub.Training.GYM);
        fitnessClub.training(sub36, FitnessClub.Training.GYM);
        fitnessClub.training(sub37, FitnessClub.Training.GYM);
        fitnessClub.training(sub38, FitnessClub.Training.GYM);
        fitnessClub.training(sub39, FitnessClub.Training.GYM);
        fitnessClub.training(sub40, FitnessClub.Training.GYM);*/




    }

}
