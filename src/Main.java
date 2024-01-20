import Classes.Gear;
import Classes.Mechanismable;
import Classes.Spring;
import Classes.TechSolution;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mechanismable gear = new Gear(3);
        Mechanismable spring = new Spring(5);

        TechSolution mysolution = new TechSolution(10);
        mysolution.SolutionDoing();
        System.out.println("Changing position 5");
        mysolution.SetMehanismIntoSolution(5, new Gear(15));
        System.out.println("After changed");
        mysolution.SolutionDoing();
        System.out.println("New solution");
        TechSolution mysol2 = new TechSolution(7);
        mysol2.SolutionDoing();
    }
}