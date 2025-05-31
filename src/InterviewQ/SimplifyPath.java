package InterviewQ;

import java.util.Objects;
import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go back to the previous directory
                }
            } else if (!component.equals("") && !component.equals(".")) {
                stack.push(component); // Valid directory or file name
            }
        }

        // Construct the simplified path
        StringBuilder simplePath = new StringBuilder();
        for (String dir : stack) {
            simplePath.append("/").append(dir);
        }

        return simplePath.length() > 0 ? simplePath.toString() : "/";
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
        System.out.println(simplifyPath("/home/User/Doc/../Pic/."));
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo//"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));

    }
}
