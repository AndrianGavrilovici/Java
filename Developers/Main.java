//		1. Написать своего наследника Developer. Добавить его в
//		существующий проект.
//		2. Создать список разработчиков и заполнить его случайным
//		образом. Вывести на экран только Senior developer-ов с
//		зарплатой больше 1500 у.е.
//		3. Написать код, который разделит список объектов Developer
//		на 3 отдельных списка для Juniors, Seniors и Team Leads.
//		Вывести списки на экран.

package DevelopersPackage;

public class Main {

    public static void main(String[] args) {
	    MainDeveloper mainDeveloper = new MainDeveloper();
	    mainDeveloper.start();
    }
}
