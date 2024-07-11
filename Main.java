package mission.ClassRoom;

public class Main {
    public static void main(String[] args) {
        ClassRoom<CollegeStudent> allStudentsClassRoom = new ClassRoom<>("전체 교양수업");
        ClassRoom<YoungGroupCollegeStudent> youngGroupClassRoom = new ClassRoom<>("저학년 전용 교양수업");
        ClassRoom<ElderGroupCollegeStudent> elderGroupClassRoom = new ClassRoom<>("고학년 전용 교양수업");
        ClassRoom<Freshman> freshmanClassRoom = new ClassRoom<>("1학년 전공수업");
        ClassRoom<Sophomore> sophomoreClassRoom = new ClassRoom<>("2학년 전공수업");
        ClassRoom<Junior> juniorClassRoom = new ClassRoom<>("3학년 전공수업");
        ClassRoom<Senior> seniorClassRoom = new ClassRoom<>("4학년 전공수업");

        Senior senior1 = new Senior("001", "Larry", 3.7);
        Senior senior2 = new Senior("002", "Bob", 3.5);
        Senior senior3 = new Senior("003", "Eve", 3.8);

        Junior junior1 = new Junior("004", "Kelly", 4.0);
        Junior junior2 = new Junior("005", "Eve", 3.8);
        Junior junior3 = new Junior("006", "Frank", 4.1);

        Sophomore sophomore1 = new Sophomore("007", "Ivy", 3.9);
        Sophomore sophomore2 = new Sophomore("008", "Jack", 3.8);
        Sophomore sophomore3 = new Sophomore("009", "Charlie", 4.0);

        Freshman freshman1 = new Freshman("010", "Grace", 3.6);
        Freshman freshman2 = new Freshman("011", "Henry", 3.3);
        Freshman freshman3 = new Freshman("012", "David", 3.9);

        allStudentsClassRoom.addStudent(freshman1);
        allStudentsClassRoom.addStudent(freshman2);
        allStudentsClassRoom.addStudent(freshman3);
        allStudentsClassRoom.addStudent(sophomore1);
        allStudentsClassRoom.addStudent(sophomore2);
        allStudentsClassRoom.addStudent(sophomore3);
        allStudentsClassRoom.addStudent(junior1);
        allStudentsClassRoom.addStudent(junior2);
        allStudentsClassRoom.addStudent(junior3);
        allStudentsClassRoom.addStudent(senior1);
        allStudentsClassRoom.addStudent(senior2);
        allStudentsClassRoom.addStudent(senior3);

        youngGroupClassRoom.addStudent(freshman1);
        youngGroupClassRoom.addStudent(freshman2);
        youngGroupClassRoom.addStudent(sophomore1);
        youngGroupClassRoom.addStudent(sophomore2);

        elderGroupClassRoom.addStudent(junior1);
        elderGroupClassRoom.addStudent(junior2);
        elderGroupClassRoom.addStudent(senior1);
        elderGroupClassRoom.addStudent(senior2);

        freshmanClassRoom.addStudent(freshman1);
        freshmanClassRoom.addStudent(freshman2);
        freshmanClassRoom.addStudent(freshman3);

        sophomoreClassRoom.addStudent(sophomore1);
        sophomoreClassRoom.addStudent(sophomore2);
        sophomoreClassRoom.addStudent(sophomore3);

        juniorClassRoom.addStudent(junior2);
        juniorClassRoom.addStudent(junior3);

        seniorClassRoom.addStudent(senior2);
        seniorClassRoom.addStudent(senior3);

        System.out.println(allStudentsClassRoom.getStudentByStudentNumber("003")); //Senior ~~
        System.out.println(allStudentsClassRoom.getStudentByStudentNumber("006")); //Junior ~~
        allStudentsClassRoom.printStudentNames(); //이클래스룸(전체교양수업)은 ~~

        System.out.println(youngGroupClassRoom.getStudentByStudentNumber("010")); //Freshman ~~
        System.out.println(youngGroupClassRoom.getStudentByStudentNumber("005")); //null
        youngGroupClassRoom.printStudentNames(); //이클래스룸(저학년 전용 ~~

        System.out.println(elderGroupClassRoom.getStudentByStudentNumber("001")); //Senior ~~
        System.out.println(elderGroupClassRoom.getStudentByStudentNumber("002")); //Senior ~~
        elderGroupClassRoom.printStudentNames(); //이클래스룸(고학년 전용~

        System.out.println(freshmanClassRoom.getStudentByStudentNumber("011")); //Freshman ~~
        freshmanClassRoom.printStudentNames(); //이클래스룸은(1학년 전공수업~~

        System.out.println(sophomoreClassRoom.getStudentByStudentNumber("008")); //Sophomore ~~
        sophomoreClassRoom.printStudentNames(); //이클래스룸은(2학년 전공~~

        System.out.println(juniorClassRoom.getStudentByStudentNumber("006")); //Junior ~
        juniorClassRoom.printStudentNames(); //이클래스룸(3학년 전공~

        System.out.println(seniorClassRoom.getStudentByStudentNumber("002")); //Senior~
        seniorClassRoom.printStudentNames(); //이클래스룸(4학년~
    }
}
