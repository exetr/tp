package seedu.duke.common;

/**
 * Class containing various output messages that are printed to the user.
 */
public class Messages {
    public static final String LOGO = "        _.-\"\\\n"
            + "    _.-\"     \\\n"
            + " ,-\"          \\\n"
            + "( \\            \\\n"
            + " \\ \\            \\\n"
            + "  \\ \\            \\\n"
            + "   \\ \\         _.-;\n"
            + "    \\ \\    _.-\"   :\n"
            + "     \\ \\,-\"    _.-\"\n"
            + "      \\(   _.-\"  libmgr\n"
            + "       `--\""
            + "";
    public static final String WELCOME_MESSAGE = "Welcome to libmgr";
    public static final String LIST_ALL_MESSAGE = "Listing out all items in library";
    public static final String LIST_AVAILABLE_MESSAGE = "Listing out available items in library";
    public static final String LIST_LOANED_MESSAGE = "Listing out loaned items in library";
    public static final String ADD_MESSAGE = "Added item to catalogue:";
    public static final String EXIT_MESSAGE = "See you soon!";
    public static final String UNKNOWN_MESSAGE = "Sorry, I don't understand what you mean";
    public static final String RM_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: rm <id>";
    public static final String RM_INVALID_ID = "  (!) Invalid Item ID!";
    public static final String RM_SUCCESS = "  (+) Removed the following item:";
    public static final String FORMAT_INCORRECT = "Incorrect input format. It should be 'add t/TITLE i/ID'";
    public static final String NO_TITLE = "Please enter a valid title";
    public static final String NO_ID = "Please enter a valid ID";
}
