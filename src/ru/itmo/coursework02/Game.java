package ru.itmo.coursework02;

import java.io.*;
import java.util.Scanner;

public class Game implements Serializable{
    //public static HashMap<String, String> users = new HashMap<>();
    private String path = "/Users/air/Documents/ Наша папка/JAVA/homework/src/ru/itmo/coursework02/";
    ObjectOutputStream output;
    ObjectInputStream input;
    //User u;

    public Game() {
    }
 void start() {

        Step step01 = new Step("                                    Лисенок\n",
                "       Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком.\n" +
                        "      Это утро не было исключением. Лисёнок пришёл на их обычное место встречи,\n" +
                        "но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга.\n" +
                        "\"Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду\" " + "- подумал Лисёнок.\n" +
                        "                             Как поступить Лисенку?:\n",
                "                            1. Вернуться домой\n",
                "                          2. Отправиться на поиски\n");

        Step step02 = new Step("                               Вернуться домой\n",
                "                Вернувшись домой, Лисёнок нашёл там Бельчонка. \n" +
                        "           Оказалось, что Бельчонок пришёл на место встречи раньше \n" +
                        "                         и увидел там рой злобных пчел. \n" +
                        "           Он поспешил предупредить об этом Лисёнка, но они разминулись. \n" +
                        "                       Наконец-то друзья нашли друг друга!\n" +
                        "                            Игра завершилась успехом\n",
                null,
                null);
        Step step03 = new Step("                         Искать Бельчонка в одиночку\n",
                "            Лисёнок слишком долго плутал по лесу в поисках друга и сам \n" +
                        "            не заметил, как заблудился. Теперь его самого нужно искать.\n" +
                        "                           Игра завершилась неудачей\n",
                null,
                null);

        Step step04 = new Step("                          Отправиться на поиски\n",
                "           Все лесные жители были заняты своими делами и не обращали \n" +
                        "  внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... \n" +
                        "              Лисёнок не знал, что ему делать. Помогите ему.\n",
                "           1. Попытаться разузнать о Бельчонке у лесных жителей\n",
                "                    2. Искать Бельчонка в одиночку\n");
        Step step05 = new Step("              Попытаться разузнать о Бельчонке у лесных жителей\n",
                "        Пока Лисёнок принимал решение, лесные жители разошлись кто куда. \n" +
                        "                       Остались только Сова и Волк. \n" +
                        "                  Но у Совы бывают проблемы с памятью, \n" +
                        "           а Волк может сильно разозлиться из-за расспросов. \n" +
                        "                              Кого выбрать?\n",
                "                            1. Расспросить Сову\n",
                "                            2. Расспросить Волка\n");
        Step step06 = new Step("                              Расспросить Сову\n",
                "              Сова долго не хотела говорить, но в итоге сказала, \n" +
                        "          что видела испуганного Бельчонка, бежавшего вглубь леса. \n" +
                        "             Все лесные жители знают, что в глубине леса опасно, \n" +
                        "                 если Бельчонок там, ему срочно нужна помощь.\n",
                "                1. Поверить Сове и отправиться вглубь леса\n",
                "           2. Сове не стоит верить -> Искать Бельчонка в одиночку\n");
        Step step07 = new Step("                             Расспросить Волка\n",
                "              Волк оказался вполне дружелюбным, но помочь не смог. \n" +
                        "             Лишь сказал, что маленькому лисенку не стоит бродить \n" +
                        "                  по лесу одному. И как теперь поступить?\n",
                "                      1. Волк прав -> Вернуться домой\n",
                "                      2. Искать Бельчонка в одиночку\n");
        Step step08 = new Step("                    Поверить Сове и отправиться вглубь леса\n",
                "                  В глубине леса Лисёнок встретил Медвежонка. \n" +
                        "             Ленивый Медвежонок был готов рассказать все, что знает, \n" +
                        "                       если Лисёнок принесёт ему мёда.\n",
                "  1. Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку\n",
                "               2. Нужно воспользоваться шансом и раздобыть мёд\n");
        Step step09 = new Step("                Нужно воспользоваться шансом и раздобыть мёд\n",
                "          Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. \n" +
                        "        Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.\n",
                "                      1. Подождать, вдруг пчёлы улетят\n",
                "                 2. Нужно попытаться выкрасть мёд немедленно\n");
        Step step10 = new Step("                       Подождать, вдруг пчёлы улетят\n",
                "               Лисёнок подождал немного, и пчёлы разлетелись. \n" +
                        "              Лисёнок без проблем набрал мёда. Вдруг он понял, \n" +
                        "                     что очень голоден. Что же делать?\n",
                "                      1. Поесть немного и передохнуть\n",
                "                     2. Скорее отнести мёд Медвежонку\n");

        Step step11 = new Step("                  Нужно попытаться выкрасть мёд немедленно\n",
                "               Это была не лучшая идея. Пчёлы покусали Лисёнка, \n" +
                        "                        теперь ему самому нужна помощь\n" +
                        "                          Игра завершилась неудачей\n",
                null,
                null);
        Step step12 = new Step("                        Поесть немного и передохнуть\n",
                "             Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. \n" +
                        "              Лисёнку нужна помощь, он не сможет продолжить поиски. \n" +
                        "                         Игра завершилась неудачей\n",
                null,
                null);
        Step step13 = new Step("                        Скорее отнести мёд Медвежонку\n",
                "           Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает \n" +
                        "              семью Белок и уверен, что Бельчонок никогда не пошёл бы \n" +
                        "        в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, \n" +
                        "                  и что Совам нельзя верить, он также уговаривал\n" +
                        "                           Лисёнка вернуться домой.\n",
                " 1. Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку\n",
                "          2. Может быть он прав и Лисёнок просто паникует -> Вернуться домой\n");
        Step[] steps = {step01, step02, step03, step04, step05, step06, step07, step08, step09, step10, step11, step12, step13};

        System.out.println("Новая игра");

        //запустить steps
        Scanner scanner = new Scanner(System.in);
        Step realStep = steps[0];

        while (realStep != null) {
            System.out.println(realStep.getTitle() + realStep.getDesc());
            if (realStep.getNxtStp1() != null) {
                System.out.println(realStep.getNxtStp1() + realStep.getNxtStp2());

                System.out.println("\n выберите 1..2 \n" + "0 - для выхода в меню\n");}

            String scn = scanner.nextLine();
                switch (scn) {
                    case "1":
                        for (Step step : steps) {
                            if (realStep.getNxtStp1() != null) {
                                //System.out.println((realStep.getNxtStp1().toLowerCase()).trim());
                               // System.out.println((step.getTitle().toLowerCase()).trim());
                                if ((realStep.getNxtStp1().toLowerCase()).trim().contains((step.getTitle().toLowerCase()).trim())) {
                                    realStep = step;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } break;
                    case "2":
                        for (Step step : steps) {
                            if (realStep.getNxtStp2() != null) {
                               //System.out.println((realStep.getNxtStp2().toLowerCase()).trim());
                              // System.out.println((step.getTitle().toLowerCase()).trim());
                                if ((realStep.getNxtStp2().toLowerCase()).trim().contains((step.getTitle().toLowerCase()).trim())) {
                                    realStep = step;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } break;

                    case "0":
                        realStep = null;
                        break;
                }
            }
        }

void load(User user){

       try {
           input = new ObjectInputStream(new FileInputStream(path+user.getLogin()+ user.getPwd()+".txt"));
           user = (User) input.readObject();
       } catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
    }
}
     void save(User user) {
       try {
           output = new ObjectOutputStream(new FileOutputStream(path+user.getLogin()+ user.getPwd()+".txt"));
          output.writeObject(user);
        } catch (IOException e) {
           System.out.println("ошибка");
           throw new RuntimeException(e);
        }
     }



     void exit(){
         System.out.println("Игра закончена");
         System.exit(0);
     }
 }
