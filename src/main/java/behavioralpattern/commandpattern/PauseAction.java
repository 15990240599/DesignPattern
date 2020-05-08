package behavioralpattern.commandpattern;

public class PauseAction implements IAction {

    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer) {
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
