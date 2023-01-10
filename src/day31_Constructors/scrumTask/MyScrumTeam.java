package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Jovan",11,"QA",110000);
        Tester tester2 = new Tester("Milos",12,"SDET",142000);
        Tester tester3 = new Tester("Milica",14,"SE",135000);
        Tester tester4 = new Tester("Lala",23,"SDET",115000);


        Developer developer1 = new Developer("Olga",22,"Java Developer",125000);
        Developer developer2 = new Developer("Aygun",39,"Java Master",185000);
        Developer developer3 = new Developer("Tunc",28,"Software Dev",135000);
        Developer developer4 = new Developer("Sinem",16,"Senior Dev",200000);



        ScrumTeam scrum = new ScrumTeam("Nigara","Husein","Neira",14);

        scrum.addtester(tester1);
        scrum.addDeveloper(developer1);

        Tester [] testers = {tester2,tester3,tester4};
        Developer[] developers = {developer2,developer3,developer4};
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for (Tester eachTester : scrum.testerList) {
            System.out.println(eachTester.name+" : "+ eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.developerList) {
            System.out.println(eachDeveloper.name + " : "+eachDeveloper.salary);

        }



        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);









    }
}
