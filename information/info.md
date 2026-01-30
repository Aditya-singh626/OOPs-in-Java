## ☕ Java Environment: JDK, JRE, and JVM

# 1. JVM (Java Virtual Machine)

The JVM is the engine that runs Java programs. It reads compiled bytecode (from .class files) and executes it on your machine.

- Key roles:
- Loads and runs Java bytecode
- Performs Just-In-Time (JIT) compilation for speed
- Handles automatic memory management (garbage collection)
- Provides platform independence — “Write once, run anywhere”
- Analogy: Think of JVM as a translator that understands Java’s language (bytecode) and speaks your computer’s language (machine code).

# 2. JRE (Java Runtime Environment)

The JRE is the package needed to run Java applications. It includes:

- The JVM
- Core Java class libraries (like java.util, java.io)
- Supporting files and runtime tools
- Use case: If you only want to run Java programs (not write or compile them), the JRE is enough.

# . JDK (Java Development Kit)

The JDK is the complete toolkit for Java developers. It includes:

- The JRE (which includes the JVM)
- The Java compiler (javac) to convert .java to .class
- Developer tools like:
- javadoc (for documentation)
- jar (for packaging)
- Debuggers and profilers
- Use case: If you want to write, compile, and run Java code, you need the JDK.

# 🔁 Relationship Diagram

JDK (Java Development Kit)
├── JRE (Java Runtime Environment)
│ └── JVM (Java Virtual Machine)

📝 Quick Revision Points

- JVM: Executes bytecode, handles memory, platform-independent.
- JRE: JVM + libraries → needed to run Java apps.
- JDK: JRE + compiler/tools → needed to write and compile Java code.
- Install JDK to get everything (JRE + JVM + tools).
- For IDE you can use intelliJ/Eclipse/NetBeans
