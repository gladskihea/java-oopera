import person.*;
import show.*;

import show.Show;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor(Gender.MALE, "Jesse", "Pinkman", 180);
        Actor actor2 = new Actor(Gender.MALE, "Tony", "Soprano", 184);
        Actor actor3 = new Actor(Gender.FEMALE, "Sanya", "Pilicin", 172);

        Director director1 = new Director(Gender.MALE, "Chris", "Potato", 20);
        Director director2 = new Director(Gender.MALE, "Denis", "Romao", 15);

        Show play = new Play("Romeo and Juliet", 160, director1);

        MusicalShow opera = new Opera(
                "Carmen",
                180, director2,
                "Jorge Bizet",
                "opera libretto",
                40);

        MusicalShow ballet = new Ballet(
                "The Nutcracker",
                100, director2,
                "Pyotr Ilyich Tchaikovsky",
                "ballet libretto",
                "Marius Petipa");

        // добавляем актеров
        System.out.println();
        play.addActor(actor1);
        play.addActor(actor2);
        play.addActor(actor3);

        System.out.println();
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println();
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        System.out.println();

        // Проверки на дублирование, null, на отсутствие актера с такой фамилией.
        ballet.addActor(actor2);
        ballet.addActor(null);
        ballet.changeActor("Jhon", actor1);
        System.out.println();

        // выводим списки в консоль
        ballet.printActors();
        System.out.println();

        play.printActors();
        System.out.println();

        opera.printActors();
        System.out.println();
        opera.changeActor("Hitman", actor2);
        System.out.println();
        opera.printActors(); // проверка замены элемента

        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();

        System.out.println();
        ballet.printDirector();
    }
}
