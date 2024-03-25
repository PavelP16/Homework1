public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Задача№2");
        dog = dog + 2;
        cat = cat + 2;
        paper = paper + 2;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№6");
        var boxer_MikiTyson = 78.2;
        var boxer_RoyJones = 82.7;
        System.out.println(boxer_MikiTyson + boxer_RoyJones);
        System.out.println(boxer_RoyJones - boxer_MikiTyson);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№7");
        System.out.println(boxer_RoyJones % boxer_MikiTyson);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Задача№8");
        var time_worked = 640;
        var worker = 8;
        var workers = time_worked / worker;
        System.out.println("Всего работников в компании - "+workers+" человек");

        workers = workers + 94;
        System.out.println("Если в компании работает " + workers+" челове, то всего " + workers+worker + " часов работы может быть поделено между сотрудниками.");

    }
}