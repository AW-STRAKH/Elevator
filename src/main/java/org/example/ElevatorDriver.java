package org.example;

public class ElevatorDriver {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(0);

        Request upRequest1 = new Request(3, 5, Direction.UP, Location.OUTSIDE_ELEVATOR);
        Request upRequest2 = new Request(2, 7, Direction.UP, Location.OUTSIDE_ELEVATOR);

        Request downRequest1 = new Request(elevator.currentFloor, 1, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest2 = new Request(elevator.currentFloor, 2, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest3 = new Request(4, 0, Direction.DOWN, Location.OUTSIDE_ELEVATOR);

        // Two people inside  the elevator pressed button to go up to floor 5 and 3.
        elevator.sendUpRequest(upRequest1);
        elevator.sendUpRequest(upRequest2);

        // One person outside  the elevator at floor 4 pressed button to go down to floor 0
        elevator.sendDownRequest(downRequest3);

        // Two person inside  the elevator pressed button to go down to floor 1 and 2.
        elevator.sendDownRequest(downRequest1);
        elevator.sendDownRequest(downRequest2);


        elevator.run();
    }

}
