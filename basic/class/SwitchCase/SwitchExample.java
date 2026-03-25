public class SwitchExample {
    public static void main(String[] args) {
        int size = 3;
        // ✅ 1. Basics (statement form, break, default)
        // Old version
        switch (size) {
            case 1,6: System.out.println("Extra Small"); break;
            case 2: System.out.println("Small"); break;
            case 3: System.out.println("Medium"); break;
            case 4: System.out.println("Large"); break;
            case 5: System.out.println("Extra Large"); break;
            default: System.out.println("Invalid size number");
        }
        //✅2. Modern Switch Expressions (Java 13/14)version
        // switch return is store in a string variable result.
        int day = 3;
        String result = switch (day) {
           case 1 -> "Monday";
           case 2 -> "Tuesday";
           case 3 -> "Wednesday";
           case 4 -> "Thursday";
           case 5 -> "Friday";
           case 6, 7 -> "Weekend";  // multiple labels
           default -> "Invalid";
        };
        System.out.println(result);  // Output: Wednesday

        //✅3. Arrow Syntax and yield

         String mode = "advanced";

        int Result = switch (mode) {
            case "basic" -> 1;
            case "intermediate" -> 2;
            case "advanced" -> {
                System.out.println("Performing complex logic...");
                int temp = 10 * 2;
                //In Java 13 and 14, when you want a switch expression
                // to return a value from a block of multiple statements, you use the yield keyword. 
                yield temp;  // return value from this block
            }
            default -> -1;
        };
        System.out.println("Result: " + Result);

        //✅4. Multiple Labels in One Case
        String letter = "b";
        String group = switch (letter) {
          case "a", "b", "c" -> "Group 1";
          case "d", "e" -> "Group 2";
          default -> "Other";
        };
        System.out.println(group);

        //✅ 5. Limitations (Unsupported Types, Null Handling)
        String str = null;
        try {
            switch (str) {
                case "hello" -> System.out.println("Hi there!");
                default -> System.out.println("Unknown");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: str is null");
        }
        
        //🔎 6. Pattern Matching in Switch (Java 17+ Preview)
        Object obj = Math.random() > 0.5 ? "Dynamic String" : 99;
            
        switch (obj) {
         case String s -> System.out.println("String length: " + s.length());
         case Integer i -> System.out.println("Integer value: " + i);
         case Boolean t -> System.out.println("Bollean value"+t);
         default -> System.out.println("Unknown type");
        }
    }
}