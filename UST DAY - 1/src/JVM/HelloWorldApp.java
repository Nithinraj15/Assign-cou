package JVM;
public class HelloWorldApp {
	public static void main(String[] args) {
		System.out.println("Hello, JVM, JRE, JDK!");
	}
}

//* Which component (JDK, JRE, or JVM) was primarily responsible for *compiling* your Java source code into bytecode?
/*JDK is responsible for compiling the java source code into the bytecode it makes the .java file to .class file*/
//* Which component (JDK, JRE, or JVM) was primarily responsible for *executing* the bytecode?
// JVM is responsible for executing the bytecode into the mchine code to produce the output
//* Briefly explain the role of each of JDK, JRE, and JVM in the lifecycle of your `HelloWorldApp.java` from source code to execution. Consider what each provides.
/*1. JDK --> contains JRE+Development tools like compiler javac, debugger and documentation tools
 * 2. JRE --> it is used for the runtime Execution and contains the JRE + libraries + other files to run a java pgm
 * 3.JVM --> JVM is responsible for executing the bytecode into the mchine code to produce the output */
 