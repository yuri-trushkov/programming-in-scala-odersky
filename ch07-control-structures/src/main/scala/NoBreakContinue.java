
class NoBreakContinue {
    public static void main(String[] args) {
        
        int i = 0;
        boolean foundIt = false;
        while (i < args.length) {
            // System.out.println(args[i]);
            if (args[i].startsWith("-")) {
                i = i + 1;
                continue;
            }
            if (args[i].endsWith(".scala")) {
                foundIt = true;
                break;
            }
            i = i + 1;
        }
        System.out.println(i);
        System.out.println(args[i]);
    }
}
