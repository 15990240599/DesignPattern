package behavioralpattern.commandpattern;

public class SpeedAction implements IAction {

    private GPlayer gPlayer;

    public SpeedAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.speed();
    }
}
