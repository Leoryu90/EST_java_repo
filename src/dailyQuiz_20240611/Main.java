package dailyQuiz_20240611;

public class Main {
    public static void main(String[] args) {
        Human Ryu = new Human("Ryu Seok Ho", 33, "Seoul");
        JavaStudy study = new JavaStudy();
        Fat fat = new Fat(80);

        Ryu.sayHello();
        Ryu.sayMyAge();
        Ryu.sayMyPlace();

        Ryu.nowLevel(study);
        Ryu.nowFat(fat);
        Ryu.eatFood(fat);
        Ryu.running(fat);



        Ryu.goToBootcamp(study);
        Ryu.studyMySelf(study);
        Ryu.goToDate(study);
        Ryu.goToDate(study);
        Ryu.goToDate(study);
        Ryu.studyMySelf(study);
        Ryu.goToBootcamp(study);

    }
}
