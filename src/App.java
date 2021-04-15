interface MachineLearning {
    public void AutoDrive();
}

interface CarsEngine {
    public void FoursWheel();
    public void Turbo();
}

class TeslaCar implements MachineLearning, CarsEngine {
    public void AutoDrive() {
        System.out.println("This Car can Auto Drive");
    }
    public void FoursWheel() {
        System.out.println("This Car have Fours Wheel");
    }
    public void Turbo() {
        System.out.println("This Car have Turbo");
    }
}

class App {
    public static void main(String[] args) {
        TeslaCar myCar = new TeslaCar();
        myCar.AutoDrive();
        myCar.FoursWheel();
        myCar.Turbo();
    }
}
