// import java.util.HashMap;
// import java.util.Map;

// public class Example {
//     public static void main(String[] args, double d) {
//         InnerExample m = (a, b) -> d+b;
//         InnerExample x = Double::sum;
        
//     }
// }

// public interface InnerExample {
//     double add(double a, double b);
    
// }

// public class InnerExample_1 {
//     static Map<Character, InnerExample_2> map = new HashMap<>();
//     static{
//         map.put('+', args -> args[0]+args[1]);
//     }

//     public static void main(String ... args) {
//         System.out.println(calculate('+', 67, 58));
//     }
//     public static double calculate(char op, double x, double y){return map.get(op).calc(x,y);
// }

// public interface InnerExample_2 {
//     double calc(double ... args);
    
// }