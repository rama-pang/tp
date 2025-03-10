package seedu.uninurse.model.remark.exceptions;

/**
 * Signals that the operation will result in duplicate Remarks.
 * Remarks are considered duplicates if they have the same description.
 */
public class DuplicateRemarkException extends RuntimeException {
    public DuplicateRemarkException() {
        super("Operation would result in duplicate remark");
    }
}
