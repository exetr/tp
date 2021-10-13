package seedu.duke.commands;

import seedu.duke.data.Catalogue;
import seedu.duke.data.Item;
import seedu.duke.ui.TextUI;

import java.util.logging.Logger;

import static seedu.duke.common.Messages.RM_INVALID_FORMAT;
import static seedu.duke.common.Messages.INVALID_ID;
import static seedu.duke.common.Messages.RM_SUCCESS;

public class RemoveCommand extends Command {
    public static final String COMMAND_REMOVE = "rm";
    protected String args;

    /**
     * Single constructor, takes in full line of input.
     * @param input User input
     */
    public RemoveCommand(String input) {
        args = input;
    }

    /**
     * Gets the ID of object to be deleted, attempt deletion and output result.
     * @param ui Object that handles user IO
     * @param catalogue Underlying list of all items
     */
    @Override
    public void execute(TextUI ui, Catalogue catalogue) {
        Logger logger = Logger.getLogger(RemoveCommand.class.getName());
        try {
            String[] argList = args.split(" ");
            if (argList.length == 2) {
                Item removed = catalogue.removeItem(argList[1]);
                assert removed != null : "Removed item returns null";
                ui.print(RM_SUCCESS, removed);
            } else {
                ui.print(INVALID_ID);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.warning("Remove: Invalid command");
            ui.print(RM_INVALID_FORMAT);
        } catch (NullPointerException e) {
            logger.warning("Remove: Invalid ID");
            ui.print(INVALID_ID);
        }
    }

}
