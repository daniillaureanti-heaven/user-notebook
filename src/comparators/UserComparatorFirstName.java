package comparators;

import java.util.Comparator;

public class UserComparatorFirstName implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getFirstName().compareTo(user2.getFirstName());
    }
}
