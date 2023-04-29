package ru.itmo.coursework01;

public class Application {

    public static void main(String[] args) {
        Subscription sub01 = new Subscription(Subscription.Type.ONE_DAY,1, ("2023-04-29"), "Выродкова Виктория", 1978);
        Subscription sub02 = new Subscription(Subscription.Type.ONE_DAY,2, ("2023-04-29"), "Скрыплев Иван", 2001);
        Subscription sub03= new Subscription(Subscription.Type.ONE_DAY,3, ("2023-04-29"), "Сидин Михаил", 1996);
        Subscription sub04 = new Subscription(Subscription.Type.ONE_DAY,4, ("2023-04-22"), "Седов Вячеслав", 1968);
        Subscription sub05 = new Subscription(Subscription.Type.ONE_DAY,5, ("2023-04-29"), "Зворыгин Марат", 1993);
        Subscription sub06 = new Subscription(Subscription.Type.ONE_DAY,6, ("2023-04-29"), "Сапонова Юлия", 1994);
        Subscription sub07 = new Subscription(Subscription.Type.ONE_DAY,7, ("2023-04-29"), "Несмеянов Владимир", 1985);
        Subscription sub08 = new Subscription(Subscription.Type.MORNING,8,  ("2023-03-05"), "Афян Герман", 1999);
        Subscription sub09 = new Subscription(Subscription.Type.MORNING,9, ("2023-03-05"), "Грибанов Григорий", 1998);
        Subscription sub10 = new Subscription(Subscription.Type.MORNING,10, ("2023-04-05"), "Кабошкин Ефим", 1991);
        Subscription sub11 = new Subscription(Subscription.Type.MORNING,11, ("2023-04-05"),"Баерская Диана", 1992);
        Subscription sub12 = new Subscription(Subscription.Type.MORNING,12, ("2023-03-05"),"Кирнарская Римма", 1995);
        Subscription sub13 = new Subscription(Subscription.Type.MORNING,13, ("2023-02-05"),"Нарубин Роман", 1993);
        Subscription sub14 = new Subscription(Subscription.Type.MORNING,14, ("2023-03-05"),"Фадейкин Ярослав", 1998);
        Subscription sub15 = new Subscription(Subscription.Type.MORNING,15, ("2022-12-05"),"Иноходцев Степан", 2000);
        Subscription sub16 = new Subscription(Subscription.Type.MORNING,16, ("2022-11-05"), "Авчинникова Алла", 2001);
        Subscription sub17 = new Subscription(Subscription.Type.FULL,17, ("2023-04-05"),"Занков Николай", 2004);
        Subscription sub18 = new Subscription(Subscription.Type.FULL,18, ("2023-04-05"),"Немченко Карина", 1979);
        Subscription sub19 = new Subscription(Subscription.Type.FULL,19, ("2023-04-05"),"Немасева Юлия", 1980);
        Subscription sub20 = new Subscription(Subscription.Type.FULL,20, ("2023-04-05"),"Гузнищева Раиса", 1983);
        Subscription sub21 = new Subscription(Subscription.Type.FULL,21, ("2023-04-05"),"Туробеев Ярослав", 1987);
        Subscription sub22 = new Subscription(Subscription.Type.FULL,22, ("2023-04-05"),"Донгузова Елена", 1990);
        Subscription sub23 = new Subscription(Subscription.Type.FULL,23, ("2023-04-05"),"Бонин Михаил", 1991);
        Subscription sub24 = new Subscription(Subscription.Type.FULL,24, ("2023-04-05"),"Тменов Ринат", 1992);
        Subscription sub25 = new Subscription(Subscription.Type.FULL,25, ("2023-03-05"),"Дрождин Марат", 1993);
        Subscription sub26 = new Subscription(Subscription.Type.FULL,26, ("2023-02-05"),"Юдашкина Анастасия", 1998);
        Subscription sub27 = new Subscription(Subscription.Type.FULL,27, ("2023-01-05"),"Дубровин Тимофей", 1997);
        Subscription sub28 = new Subscription(Subscription.Type.FULL,28, ("2022-12-05"),  "Балмашев Евгений", 1994);
        Subscription sub29 = new Subscription(Subscription.Type.FULL,29, ("2022-12-05"), null, 1994);
        Subscription sub30 = new Subscription(Subscription.Type.FULL,30, ("2022-11-05"),  "Стронгин Артур", 2003);
        Subscription sub31 = new Subscription(Subscription.Type.FULL,31, ("2023-01-05"), "Билыч Юрий", 2002);
        Subscription sub32 = new Subscription(Subscription.Type.FULL,32, ("2023-01-05"), "Билыч Юрий", 2002);
        Subscription sub33 = new Subscription(Subscription.Type.FULL,33, ("2023-01-05"), "Бизунова Валентина", 2005);
        Subscription sub34 = new Subscription(Subscription.Type.FULL,34, ("2023-02-05"), "Азбергенова Жанна", 1999);
        Subscription sub35 = new Subscription(Subscription.Type.FULL,35, ("2023-02-05"),"Надеина Алина", 1985);
        Subscription sub36 = new Subscription(Subscription.Type.FULL,36, ("2023-02-05"), "Рагозин Аркадий", 1986);
        Subscription sub37 = new Subscription(Subscription.Type.FULL,37, ("2023-04-05"), "Ланьков Константин", 1987);
        Subscription sub38 = new Subscription(Subscription.Type.FULL,38, ("2023-03-05"), "Городецкая Мария", 1988);
        Subscription sub39 = new Subscription(Subscription.Type.FULL,39, ("2023-03-05"), "Ганиев Марсель", 1978);
        Subscription sub40 = new Subscription(Subscription.Type.FULL,40, ("2023-03-05"), "Серогузов Рамиль", 1990);

        FitnessClub fitnessClub = new FitnessClub();
        fitnessClub.training(sub01, FitnessClub.Train.GYM);
        fitnessClub.training(sub02, FitnessClub.Train.POOL);
        fitnessClub.training(sub03, FitnessClub.Train.GROUP);
        fitnessClub.training(sub04, FitnessClub.Train.GYM);
        fitnessClub.training(sub05, FitnessClub.Train.POOL);
        fitnessClub.training(sub06, FitnessClub.Train.GROUP);
        fitnessClub.training(sub07, FitnessClub.Train.GYM);
        fitnessClub.training(sub08, FitnessClub.Train.POOL);
        fitnessClub.training(sub09, FitnessClub.Train.GROUP);
        fitnessClub.training(sub10, FitnessClub.Train.GYM);
        fitnessClub.training(sub11, FitnessClub.Train.POOL);
        fitnessClub.training(sub12, FitnessClub.Train.GROUP);
        fitnessClub.training(sub13, FitnessClub.Train.GYM);
        fitnessClub.training(sub14, FitnessClub.Train.POOL);
        fitnessClub.training(sub15, FitnessClub.Train.GROUP);
        fitnessClub.training(sub16, FitnessClub.Train.GYM);
        fitnessClub.training(sub17, FitnessClub.Train.POOL);
        fitnessClub.training(sub18, FitnessClub.Train.GROUP);
        fitnessClub.training(sub19, FitnessClub.Train.GYM);
        fitnessClub.training(sub20, FitnessClub.Train.POOL);
        fitnessClub.training(sub21, FitnessClub.Train.GROUP);
        fitnessClub.training(sub22, FitnessClub.Train.GYM);
        fitnessClub.training(sub23, FitnessClub.Train.POOL);
        fitnessClub.training(sub24, FitnessClub.Train.GROUP);
        fitnessClub.training(sub25, FitnessClub.Train.GYM);
        fitnessClub.training(sub26, FitnessClub.Train.GYM);
        fitnessClub.training(sub27, FitnessClub.Train.GYM);
        fitnessClub.training(sub28, FitnessClub.Train.GYM);
        fitnessClub.training(sub29, FitnessClub.Train.GYM);
        fitnessClub.training(sub30, FitnessClub.Train.GYM);
        fitnessClub.training(sub31, FitnessClub.Train.GYM);
        fitnessClub.training(sub32, FitnessClub.Train.GYM);
        fitnessClub.training(sub33, FitnessClub.Train.GYM);
        fitnessClub.training(sub34, FitnessClub.Train.GYM);
        fitnessClub.training(sub35, FitnessClub.Train.GYM);
        fitnessClub.training(sub36, FitnessClub.Train.GYM);
        fitnessClub.training(sub37, FitnessClub.Train.GYM);
        fitnessClub.training(sub38, FitnessClub.Train.GYM);
        fitnessClub.training(sub39, FitnessClub.Train.GYM);
        fitnessClub.training(sub40, FitnessClub.Train.GYM);
        fitnessClub.training(sub31, FitnessClub.Train.GYM);
        fitnessClub.training(sub32, FitnessClub.Train.GYM);
        fitnessClub.training(sub33, FitnessClub.Train.GYM);
        fitnessClub.training(sub34, FitnessClub.Train.GYM);
        fitnessClub.training(sub35, FitnessClub.Train.GYM);
        fitnessClub.training(sub36, FitnessClub.Train.GYM);
        fitnessClub.training(sub37, FitnessClub.Train.GYM);
        fitnessClub.training(sub38, FitnessClub.Train.GYM);
        fitnessClub.training(sub39, FitnessClub.Train.GYM);
        fitnessClub.training(sub40, FitnessClub.Train.GYM);



    }

}
