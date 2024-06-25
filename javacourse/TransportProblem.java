package com.javacourse;
//Base class Transport
class Transport {
Transport() {
   System.out.println("it is a general transport vehicle.");
}
}




//Subclass RoadTransport inheriting from Transport
class RoadTransport extends Transport {
RoadTransport() {
   System.out.println("it is a road transport vehicle.");
}
}





//Subclass FourWheeler inheriting from RoadTransport
class FourWheeler extends RoadTransport {
FourWheeler() {
   System.out.println("it is a four-wheeler vehicle.");
}
}




//Main class to demonstrate multilevel inheritance
public class TransportProblem {
public static void main(String[] args) {
   FourWheeler car = new FourWheeler();
}
}