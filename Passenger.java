public class Passenger {
    private static int id = 1;
    private String name;
    private String gender;
    private String berthPreference;
    private int age;
    private String allotedBerth;
    private int passengerId = id++;
    private int seatNumber;

    public Passenger(String name, int age, String gender, String berthPreference){
        this.name = name;
        this.gender = gender;
        this.berthPreference = berthPreference;
        this.age = age;
        allotedBerth = "";
        seatNumber = -1;
    }   
}
