package Classes;

public class TechSolution {
    Mechanismable [] sol;
    Logger log = Logger.getInstance("log.txt");
    public TechSolution (int number){
        int rand = 0;
        if (number > 0) {
            this.sol = new Mechanismable[number];
            for (int i = 0; i < number; i++) {
                rand = (int)(Math.random() * 100);
                if ( rand > 50) {
                    sol[i] = new Gear((float) (Math.random() * 20));
                    log.Logging(" Gear mechanism", " adding position " + i);
                }
                else {
                    sol[i] = new Spring((float) (Math.random() * 20));
                    log.Logging(" Spring mechanism", " adding position " + i);
                }
            }
        }
        else
        {
            number = 5;
            this.sol = new Mechanismable[number];
            for (int i = 0; i < number; i++) {
                rand = (int)(Math.random() * 100);
                if ( rand > 50) {
                    sol[i] = new Gear((float) (Math.random() * 20));
                    log.Logging(" Gear mechanism", " adding position " + i);
                }
                else {
                    sol[i] = new Spring((float) (Math.random() * 20));
                    log.Logging(" Spring mechanism", " adding position " + i);
                }
            }
        }
    }

    public Mechanismable [] SetMehanismIntoSolution(int position, Mechanismable mechanism){
        if (position > -1 && position < sol.length) {
            log.Logging(" mechanism in position " + position + " from " + sol[position - 1].getClass().getName() + " to " + mechanism.getClass().getName(), " changing ");
            this.sol[position - 1] = mechanism;
        }
        return sol;
    }

    public void SolutionDoing(){
        for(int i = 0; i < sol.length; i++){
            float data = (float)Math.random()*20;
            sol[i].Show(data);
        }
    }


}
