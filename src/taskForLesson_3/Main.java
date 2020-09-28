package taskForLesson_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Лука",
                "Василинка",
                "Денисий",
                "Захар",
                "Денисий",
                "Галя",
                "Витя",
                "Томара",
                "Данила",
                "Евгения",
                "Андрей",
                "Филип",
                "Митя",
                "Алиса",
                "Томара",
                "Данила",
                "Евгения",
                "Андрей",
                "Филип",
                "Евгения",
                "Андрей"
                )  );
        System.out.println("Задание №1.1");
        System.out.println(list);
        System.out.println("\nЗадание №1.2");
        Set<String> listSet = new HashSet<>(list);
        System.out.println(listSet);
        System.out.println("\nЗадание №1.3");
        for (String name : listSet) {
            System.out.println(name + " - " + Collections.frequency(list,name) + "; ");
        }

        TelephoneDirectory.add("Лукин","454-75-89");
        TelephoneDirectory.add("Василинков","161-10-17");
        TelephoneDirectory.add("Денисий","388-76-46");
        TelephoneDirectory.add("Захарец","866-98-71");
        TelephoneDirectory.add("Денисов","084-96-14");
        TelephoneDirectory.add("Галинин","770-54-74");
        TelephoneDirectory.add("Витяев","088-17-20");
        TelephoneDirectory.add("Томаришкин","848-99-36");
        TelephoneDirectory.add("Данильчик","245-07-64");
        TelephoneDirectory.add("Евгеньев","929-40-83");
        TelephoneDirectory.add("Витяев","088-14-38");

        System.out.println("\nЗадание №2");
        System.out.println(TelephoneDirectory.get("Витяев"));
        System.out.println(TelephoneDirectory.get("Гал"));
        System.out.println(TelephoneDirectory.get("Томаришкин"));


    }
}
