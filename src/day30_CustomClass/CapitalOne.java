package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

       Employee employee1 =new Employee();
        Employee employee2 =new Employee();
        Employee employee3 =new Employee();
        Employee employee4=new Employee();
        Employee employee5 =new Employee();
        employee1.setInfo("John",2290,29,'M',"Dev",2000,true);
        employee2.setInfo("Milso",1203,30,'M',"QA",20000,true);
        employee3.setInfo("Jakov",2313,42,'M',"PO",31232,true);
        employee4.setInfo("Jana",8228,50,'F',"CLeaner",1000,false);
        employee5.setInfo("Janko",9182,34,'M',"Vendor",93838,false);


        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        int countFullTime=0;
        int partTime=0;
        double max= employees[0].sallary;


        for (Employee each : employees) {

            if (each.isFullTime){
                countFullTime++;
            }else {
                partTime++;
            }

            if (each.sallary>max){
                max=each.sallary;//isto za minimum
            }
        }


        System.out.println("partTime = " + partTime);
        System.out.println("max = " + max);
        System.out.println("countFullTime = " + countFullTime);




    }
}
