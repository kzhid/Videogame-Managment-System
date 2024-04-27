import java.util.ArrayList;

public class Database {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> usernames = new ArrayList<String>();

    public void AddUser(User Sc) {
        users.add(Sc);
        usernames.add(Sc.getName());
    }

    public int login(String phonenumber, String email) {
        int n = -1;
        for (User Sc : users) {
            if (Sc.getPhonenumber().equals(phonenumber) && Sc.getEmail().equals(email)) {
                n = users.indexOf(Sc);
                break;

            }
        }
        return n;
    }
    public User getUser(int n) {
        return users.get(n);

    }

    }


