package Editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
