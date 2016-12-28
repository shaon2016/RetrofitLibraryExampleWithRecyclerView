package shaoniiuc.com.recyclerviewwithretrofit.model;

/**
 * Created by Shaon on 12/26/2016.
 */



public class User {

    private String name;
    private String hobby;


    public User() {
    }


    public User(String name, String hobby) {

        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
