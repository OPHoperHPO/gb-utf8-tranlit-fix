package nodomain.freeyourgadget.gadgetbridge.tasker.service;

public class NoTaskDefinedException extends RuntimeException {

    public NoTaskDefinedException() {
        super("Tasker enabled but no task defined! Please define a task either in settings or in service.");
    }

}
