package learncodingyouyubechannel;

public class Characteristics {  
    public static void showAgeOfObject(Human human) {
        System.out.println(human.getAge());
    }

    public static void main(String[] args) {
        Human human = new Human();
        Teacher teacher = new Teacher();

        showAgeOfObject(human);     
        showAgeOfObject(teacher);
    }
}
