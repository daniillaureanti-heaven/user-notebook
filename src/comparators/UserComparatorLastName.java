package comparators;

import java.util.Comparator;

public class UserComparatorLastName implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getLastName().compareTo(user2.getFirstName());
    }
}
