package rogatireader;

import java.util.ArrayList;

class User{
    private String uid;
    private String email;
    private String name;
    private ArrayList<Action> actions; 
    
    public User (String uid, String email, String name, ArrayList<Action> actions){
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.actions = actions;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the actions
     */
    public ArrayList<Action> getActions() {
        return actions;
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }

}
