package raidone.robot.auto.sequences;

import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.wpilibj.Timer;
import raidone.robot.Constants.AutoConstants;
import raidone.robot.auto.actions.DrivePath;
import raidone.robot.auto.actions.LambdaAction;
import raidone.robot.auto.actions.SeriesAction;
import raidone.robot.submodules.Intake;
import raidone.robot.submodules.Intake.IntakeState;

import java.util.Arrays;

import com.pathplanner.lib.PathPlanner;

public class leftFront extends AutoSequence {
    private static final Trajectory path1 = PathPlanner.loadPath("leftFront", AutoConstants.MAX_VEL, AutoConstants.MAX_ACCEL);

    public leftFront() {}

    @Override
    public void sequence() {
        addAction(
            new SeriesAction(Arrays.asList(
                new DrivePath(path1, true))
            )
        );
    }

    @Override
    public void onEnded() {
        System.out.println("leftFront ended!");
    }

    @Override
    public String getName() {
        return "leftFront";
    }
}
