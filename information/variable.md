1. Local Variables

- Definition: Declared inside a method, constructor, or block.
- Scope: Accessible only within that block/method.
- Lifetime: Created when the method is invoked and destroyed once it exits.
- Key Point: Must be initialized before use.
- Example:
  void display() {
  int count = 10; // local variable
  System.out.println(count);
  }

2. Instance Variables

- Definition: Declared inside a class but outside any method or block.
- Scope: Each object of the class has its own copy.
- Lifetime: Exists as long as the object exists.
- Default Values: Automatically initialized (e.g., 0 for int, null for objects).
- Example:
  class Student {
  String name; // instance variable
  int age; // instance variable
  }

3. Static (Class) Variables

- Definition: Declared with the static keyword inside a class.
- Scope: Shared among all objects of the class.
- Lifetime: Exists for the entire duration of the program.
- Key Point: Accessed using the class name.
- Example:
  class Student {
  static String school = "DPS"; // static variable
  }
  ![alt text](<Screenshot 2026-01-30 105118.png>)

✅ Extra Note
Besides these, Java also has primitive data types (int, float, char, boolean, etc.) and reference types (String, arrays, objects). These define what kind of data a variable can hold, while the above classification defines where and how the variable is stored and accesse
