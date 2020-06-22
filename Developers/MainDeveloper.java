//		1. Написать своего наследника Developer. Добавить его в
//		существующий проект.
//		2. Создать список разработчиков и заполнить его случайным
//		образом. Вывести на экран только Senior developer-ов с
//		зарплатой больше 1500 у.е.
//		3. Написать код, который разделит список объектов Developer
//		на 3 отдельных списка для Juniors, Seniors и Team Leads.
//		Вывести списки на экран.

package DevelopersPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MainDeveloper {

    public void start(){
        Developer[] manualDevelopers = {
            new JuniorDeveloper("Dimitry",400, 1),
            new SeniorDeveloper("Ion", 600, 6),
            new MiddleDeveloper("Ruslan", 500, 3),
            new JuniorDeveloper("Valery", 400,2),
            new TeamLeadDeveloper("Iulian", 700, 7),
            new SeniorDeveloper("Alexander", 600, 5)
        };

        delimiter('*');
        System.out.println("UnSorting Developers");
        delimiter('*');
        System.out.println("Manual Developers\n");
        showDevelopers(manualDevelopers);
        delimiter('-');
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number of developer generated:");
        Developer[] genDevelopers = generateDevelopers(enter.nextInt());
        System.out.println("Generate Developers\n");
        showDevelopers(genDevelopers);
        delimiter('-');
        System.out.println("Senior developers with a salary of more than 1500");
        showSenior(genDevelopers);
        System.out.println();
        delimiter('*');
        System.out.println("Sorting Developers");
        delimiter('*');
        Developer[][] sortedManualDevelopers = sortedDevelopers(manualDevelopers);
        Developer[][] sortedGenerateDevelopers = sortedDevelopers(genDevelopers);
        System.out.println("Manual Developers\n");
        for (Developer[] sortedManualDeveloper : sortedManualDevelopers)
            showDevelopers(sortedManualDeveloper);
        System.out.println("Generate Developers\n");
        for (Developer[] sortedGenerateDeveloper : sortedGenerateDevelopers)
            showDevelopers(sortedGenerateDeveloper);
    }
    private void showDevelopers(Developer[] developers){
        for (Developer developer:developers) {
            if (developer instanceof JuniorDeveloper){
                System.out.println("Junior Developer");
                showDeveloper(developer);
            } else if (developer instanceof MiddleDeveloper){
                System.out.println("Middle Developer");
                showDeveloper(developer);
            } else if (developer instanceof SeniorDeveloper){
                System.out.println("Senior Developer");
                showDeveloper(developer);
            } else if (developer instanceof TeamLeadDeveloper){
                System.out.println("Team Lead Developer");
                showDeveloper(developer);
            }
        }
    }
    private void showDeveloper(Developer developer){
        System.out.println(developer.getName());
        System.out.println(developer.basicSalary + "-> " + developer.getSalary());
        System.out.println();
    }
    private void delimiter(char delimit){
        for (int i = 0; i < 30; i++)
            System.out.print(delimit);
        System.out.println("\n");
    }
    private Developer[] generateDevelopers(int howMany){
        Developer[] developersArr = new Developer[howMany];
        for (int i = 0; i < developersArr.length; i++){
            int randomExperience = (int)(Math.random() * 12);
            if (randomExperience <= 2)
                developersArr[i] = new JuniorDeveloper(generateName(),400, randomExperience);
            else if (randomExperience <= 4)
                developersArr[i] = new MiddleDeveloper(generateName(), 500, randomExperience);
            else if (randomExperience <= 6)
                developersArr[i] = new SeniorDeveloper(generateName(), 600, randomExperience);
            else
                developersArr[i] = new TeamLeadDeveloper(generateName(), 700, randomExperience);
        }
        return developersArr;
    }
    private String generateName(){
        StringBuilder name = new StringBuilder();
        int length = 4 + (int)(Math.random() * 6);
        int[] character = new int[length];
        Arrays.fill(character, 97);
        character[0] = 65 + (int)(Math.random() * 25);
        for (int i = 1; i < character.length; i++)
            character[i] += (int)(Math.random() * 25);
        for (int i:character)
            name.append((char) i);
        return name.toString();
    }
    private void showSenior(Developer[] developers){
        for (Developer developer : developers) {
            if (developer instanceof SeniorDeveloper){
                if (developer.getSalary() > 1500){
                    showDeveloper(developer);
                }
            }
        }
    }
    private Developer[][] sortedDevelopers(Developer[] unsorted){
        Developer[][] sorted = new Developer[4][unsorted.length];
        int junior = 0, middle = 0, senior = 0, teamLead = 0;
        for (Developer developer : unsorted){
            if (developer instanceof JuniorDeveloper)
                sorted[0][junior++] = developer;
            else if (developer instanceof MiddleDeveloper)
                sorted[1][middle++] = developer;
            else if (developer instanceof SeniorDeveloper)
                sorted[2][senior++] = developer;
            else
                sorted[3][teamLead++] = developer;
        }
        return sorted;
    }
}
