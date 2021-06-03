import java.util.ArrayList;

public class Db_Users {

    static ArrayList users = new ArrayList();

    public static ArrayList <User> allUsers (){

        users.add(new User(
                "Anton",
                "Sokolov",
                25,
                "anton@gmail.com",
                285_85_65));

        users.add(new User(
                "Anton",
                "Voron",
                20,
                "anton@gmail.com",
                654_86_12));

        users.add(new User(
                "Anna",
                "Beluh",
                17,
                "anna@gmail.com",
                259_85_36));

        users.add(new User(
                "Tatiana",
                "Visochina",
                31,
                "tatiana@gmail.com",
                695_78_21));

        users.add(new User(
                "Victor",
                "Poznyakov",
                18,
                "viktor@gmail.com",
                369_96_14));

        users.add(new User(
                "Evgeniy",
                "Topol",
                48,
                "evgeniy@gmail.com",
                356_98_74));

        return users;
    }

    public static void addUser(String firstName, String lastName, int age, String mail, int phone){
        users.add(new User(firstName, lastName, age, mail, phone));
    }
}