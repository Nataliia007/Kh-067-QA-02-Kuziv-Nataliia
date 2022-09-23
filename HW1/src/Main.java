import java.util.*;
import java.util.stream.Collectors;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Write 3 words");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitResult = input.split(",");
        List<String> result;

        while(true) {
            System.out.println("Choose filter: \n1 - maximum length \n2- start with \n3 - end with \n4 - contains\n0 - exit");
            int filterInput = Integer.parseInt(scanner.nextLine());

            switch (filterInput) {
                case 1:
                    System.out.println("Maximum length:");
                    break;
                case 2:
                    System.out.println("Starts with:");
                    break;
                case 3:
                    System.out.println("Ends with:");
                    break;
                case 4:
                    System.out.println("Contains:");
                    break;
                case 0:
                    return;
            }

            String additionalParameter = scanner.nextLine();

            switch (filterInput) {
                case 1:
                    int maxLength = Integer.parseInt(additionalParameter);
                    result = Arrays.stream(splitResult).filter(word -> word.length() <= maxLength).collect(Collectors.toList());
                    break;
                case 2:
                    result = Arrays.stream(splitResult).filter(word -> word.startsWith(additionalParameter)).collect(Collectors.toList());
                    break;
                case 3:
                    result = Arrays.stream(splitResult).filter(word -> word.endsWith(additionalParameter)).collect(Collectors.toList());
                    break;
                case 4:
                    result = Arrays.stream(splitResult).filter(word -> word.contains(additionalParameter)).collect(Collectors.toList());
                    break;
                default:
                    return;
            }

            System.out.println(result.toString());
        }
    }
}

       
