class GravityCalculator {
public static void main(String[] arguments) {
double gravity = -9.81; // Earth's gravity in m/s^2
double initialVelocity = 0.0;
double fallingTime = 10.0;
double initialPosition = 0.0;
double acceleration = -9.81;
double finalPosition = 0.0;
System.out.println("The object's position after " + fallingTime +
" seconds is " + finalPosition + " m." );

//answer after initial code run is " The object's position after 10.0 seconds is 0.0 m."

finalPosition = (fallingTime = (acceleration * Math.pow(fallingTime, 2)/2) + (initialVelocity * fallingTime) + initialPosition);
System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
}

}

